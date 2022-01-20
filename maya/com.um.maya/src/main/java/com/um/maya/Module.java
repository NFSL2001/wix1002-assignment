/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.um.maya;

import java.util.ArrayList;

public class Module {
//VARIABLES
    public String name, code, requirements;
    public int occurrence, credit, muet, capacity;
    public ArrayList<String> students,lecture, tutorial;  // {lecturer/tutor , dayOfTheWeek, StartTime, EndTime}

//CONSTRUCTORS    
    public Module() {}

    public Module(String name, String code, String requirements, int occurrence, int credit, int muet, int capacity, ArrayList<String> students, ArrayList<String> lecture, ArrayList<String> tutorial) {
        this.name = name;
        this.code = code;
        this.requirements = requirements;
        this.occurrence = occurrence;
        this.credit = credit;
        this.muet = muet;
        this.capacity = capacity;
        this.students = students;
        this.lecture = lecture;
        this.tutorial = tutorial;
    }

//FUNCTIONS
    public void viewAllModules(String query, boolean isMine)
    {
        //empty table
        while(Globals.modulesTable.getRowCount()>0)
            Globals.modulesTable.removeRow(0);
        
        Globals.modulesTable.setNumRows(0);
        
        //Get All
        ArrayList<Module> modules = new ArrayList<Module>();
        System.out.println(modules.size());
        
        //Get Related Data from query
        if(!query.equals(""))
        {   
            for(Module m : Globals.modules)
            if(
                (m.code.toLowerCase().contains(query.toLowerCase())) 
                ||
                (m.name.toLowerCase().contains(query.toLowerCase())) 
              )
                modules.add(m);
        }
        
        //Get Student/Staff modules
        else if(isMine)
        {
            for(Module m : Globals.modules)
            {
                if(Globals.isStudent){
                    if((m.students.contains(Globals.student.matric+","+Globals.student.name)))
                        modules.add(m);
                }
                
                else
                {
                    if(
                        (m.lecture.contains(Globals.staff.staffID+","+Globals.staff.name))
                        ||
                        (m.tutorial.contains(Globals.staff.staffID+","+Globals.staff.name))
                      )
                        modules.add(m);
                }
            }
        }
        else
            modules = Globals.modules;
        
        //System.out.println(modules.size());
                
        //Populate the table
        for(Module m : modules)
        {
            String[] dataRow = 
            {
                m.code + " - " + m.name,
                String.valueOf(m.occurrence),
                "","","",
                String.valueOf(m.capacity),
                String.valueOf(m.students.size()),
                ""
            };
                        
            if(!m.lecture.isEmpty())
            {
                
                dataRow[2] = "Lecture";
                dataRow[3] = m.lecture.get(1) + " " + m.lecture.get(2) + " - " + m.lecture.get(3);
                dataRow[4] = m.lecture.get(0).split(",")[1];
            }
            
            if(!m.tutorial.isEmpty())
            {
                
                dataRow[2] += "\nTutorial";
                dataRow[3] += "\n" + m.tutorial.get(1) + " " + m.tutorial.get(2) + " - " + m.tutorial.get(3);
                dataRow[4] += "\n" + m.tutorial.get(0).split(",")[1];
            }
            
            
            //Button
            if(Globals.isStudent)
            {
                if((m.students.contains(Globals.student.matric+","+Globals.student.name)))
                    dataRow[7] = "Drop";
                else
                    dataRow[7] = "Add";
            }
            else
            {
                dataRow[7] = "View/Edit";
            }
            
            
            Globals.modulesTable.addRow(dataRow);
            
        }
            //notify table that data has been changed to update in UI.
            Globals.modulesTable.fireTableDataChanged();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMuet(int muet) {
        this.muet = muet;
    }

    public void setLecture(ArrayList<String> lecture) {
        this.lecture = lecture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setTutorial(ArrayList<String> tutorial) {
        this.tutorial = tutorial;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }
    
    
    
}
