package com.um.maya;

import java.io.IOException;


public class main {

    public static void main(String[] args) throws IOException {
       Globals.db = new FirestoreHandler ();
       new Login_Signup().setVisible(true);
    }
    
}
