package com.um.maya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import javax.swing.table.DefaultTableModel;

public class Student {
//VARIABLES
    public String name, matric, password, ic, email, programme;
    public int muet;
    private ArrayList<Module> modules;
   
//CONSTRUCTORS
    public Student(){}

    public Student(String name, String matric, String password, String ic, String email, String programme, int muet) 
    {
        this.name = name;
        this.matric = matric;
        this.password = password;
        this.ic = ic;
        this.email = email;
        this.programme = programme;
        this.muet = muet;
    }
    
//SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public int getMuet() {
        return muet;
    }

    public void setMuet(int muet) {
        this.muet = muet;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    
  
//FUNCTIONS
    public void timetable(DefaultTableModel table)
    {
        //Get registered modules from all modules
        modules = new ArrayList<Module>();
        for(Module m : Globals.modules)
        {
            if(m.students.contains(matric+","+name))
                modules.add(m);
        }
        
        //Clear Table & internal timetable
        for(int row=0; row<5; row++)
            for(int col=1; col<14; col++)
                table.setValueAt("", row, col);
        
        //For each module in modules update table
        modules.forEach((module)->
                {
                    if(!module.lecture.isEmpty())
                        updateTimetableCell(table,module.lecture,module.code + "- L");
                    
                    if(!module.tutorial.isEmpty())
                        updateTimetableCell(table,module.tutorial,module.code + "- T");
                });
    }
    
    private void updateTimetableCell(DefaultTableModel table, ArrayList<String> activity, String code)
    {
        //Get data from given activity ArrayList and convert to usable variables
        String dayOfWeek = activity.get(1),
               startTime = activity.get(2),
               endTime   = activity.get(3);
        
        //find initial time in columns and day in rows. 
        int initialIndex = Arrays.asList(Globals.timetableCols).indexOf(startTime);
        int dayOfWeekIndex = Arrays.asList(Globals.timetableRows).indexOf(dayOfWeek);
        
        //for duration of class in hours, update the related cells.
        int hours = Integer.parseInt(endTime.split(":")[0]) - Integer.parseInt(startTime.split(":")[0]);
        for(int i=initialIndex; i<initialIndex+hours; i++)
            table.setValueAt(code, dayOfWeekIndex, i);
        
        //notify table that data has been changed to update in UI.
        table.fireTableDataChanged();
    }

    public String addModule(Module module) throws InterruptedException, ExecutionException
    {
        //Get registered modules from all modules
        modules = new ArrayList<Module>();
        for(Module m : Globals.modules)
        {
            if(m.students.contains(matric+","+name))
                modules.add(m);
        }
        
        //Get registered credits;
        int registeredCredits = 0;
        for(Module m : modules)
        {
            registeredCredits += m.credit;
        }

        //Condition 0 - Not in registered list
        for(Module mod : modules)
        {
            if(mod.code.equalsIgnoreCase(module.code))
                return "Already in the registered List.";
        }
        
        //Condition 1 - Not exceeding max credits
        if(registeredCredits+module.credit>Globals.maxCredits)
            return "Current credits would exceed max credits allowed.";
        
        //Condition 2 - Meeting Module MUET Rrequirements
        if(muet < module.muet && module.muet != 0)
            return "Not meeting module's MUET requirement.";
        
        //Condition 3 - Meeting Module Program Rrequirements
        if(!module.requirements.equals("None") && !programme.equals(module.requirements))
            return "Not meeting module's programme requirement.";
        
        //Condition 4 - Module is not full
        if(module.students.size() == module.capacity)
            return "Class is full already";
        
        //Condition 5 - Check for no clash of time with other modules
        if(!module.lecture.isEmpty())
           if(!checkClash(module.lecture))
               return "Have clash with other modules.";
        
        if(!module.tutorial.isEmpty())
           if(!checkClash(module.tutorial))
               return "Have clash with other modules.";

        //If All conditions are passed
        Globals.db.addRemoveStudents(module, true);
        
        //Return true as result -> successful operation
        return "Successfully Added!";
    }
    
    private boolean checkClash(ArrayList<String> activity)
    {
        String dayOfWeek = activity.get(1),
               startTime = activity.get(2),
               endTime   = activity.get(3);
        
        //find initial time in columns and day in rows. 
        int initialIndex = Arrays.asList(Globals.timetableCols).indexOf(startTime);
        int dayOfWeekIndex = Arrays.asList(Globals.timetableRows).indexOf(dayOfWeek);

        //get duration of class in hours.
        int hours = Integer.parseInt(endTime.split(":")[0]) - Integer.parseInt(startTime.split(":")[0]);

        //check if each of the time exists in timetable already
        for(int i=initialIndex; i<initialIndex+hours; i++)
        {
            if(!Globals.timetable.getValueAt(dayOfWeekIndex, i).equals(""))
            {
                return false;
            }
        }
        
    
        return true;
    }
    
    public void dropModule(Module module) throws InterruptedException, ExecutionException
    {
        Globals.db.addRemoveStudents(module, false);
    }

    
}
