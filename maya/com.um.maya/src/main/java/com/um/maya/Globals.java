package com.um.maya;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.nio.file.Paths;

public class Globals 
{
    public static ArrayList<Module> modules;
    public static Student student;
    public static Staff staff;
    public static Module module;
    public static FirestoreHandler db;
    public static DefaultTableModel timetable, modulesTable;
    public static int maxCredits = 22;
    public static boolean isStudent = true;
    
    public static String[] timetableRows = {"monday","tuesday","wednesday","thursday","friday"};
    public static String[] timetableCols = {"Days", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00"};
        
    public static String path = Paths.get("").toAbsolutePath().normalize().toString();
}