package com.um.maya;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class Staff {
//VARIABLES
    public String name, staffID, password, ic, email, department;
    private ArrayList<Module> modules;
   
//CONSTRUCTORS
    public Staff() {}
    
    public Staff(String name, String staffID, String password, String ic, String email, String department) 
    {
        this.name = name;
        this.staffID = staffID;
        this.password = password;
        this.ic = ic;
        this.email = email;
        this.department = department;
    }
      
//FUNCTIONS
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
        
    public void timetable(DefaultTableModel table)
    {
        //Get registered modules from all modules
        modules = new ArrayList<Module>();
        for(Module m : Globals.modules)
        {
            if(m.lecture.contains(staffID+","+name) || m.tutorial.contains(staffID+","+name))
                modules.add(m);
        }
        
        //Clear Table & internal timetable
        for(int row=0; row<5; row++)
            for(int col=1; col<14; col++)
                table.setValueAt("", row, col);
        
        //For each module in modules update table
        modules.forEach((module)->
                {
                    if(!module.lecture.isEmpty() && module.lecture.contains(staffID+","+name))
                        updateTimetableCell(table,module.lecture,module.code + "- L");
                    
                    if(!module.tutorial.isEmpty() && module.tutorial.contains(staffID+","+name))
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
    
    
}
