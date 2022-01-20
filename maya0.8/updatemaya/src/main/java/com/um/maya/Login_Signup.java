package com.um.maya;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login_Signup extends javax.swing.JFrame {

    public Login_Signup() throws IOException {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        username3 = new javax.swing.JTextField();
        login3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        userType3 = new javax.swing.JComboBox<>();
        password3 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        staffName = new javax.swing.JTextField();
        staffIc = new javax.swing.JTextField();
        staffPassword = new javax.swing.JTextField();
        staffEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        staffID = new javax.swing.JTextField();
        staffSignup = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        staffDepartment = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        studentIc = new javax.swing.JTextField();
        studentMatric = new javax.swing.JTextField();
        studentPassword = new javax.swing.JTextField();
        studentEmail = new javax.swing.JTextField();
        studentProg = new javax.swing.JComboBox<>();
        studentMuet = new javax.swing.JComboBox<>();
        studentSignup = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jTabbedPane4.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane4.setAlignmentX(0.0F);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        username3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        login3.setText("Log in");
        login3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel12.setText("Username :");

        jLabel22.setText("Password :");

        userType3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Staff" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username3)
                            .addComponent(password3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addComponent(userType3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(password3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(userType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(login3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane4.addTab("Log in", jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Name");

        jLabel15.setText("IC");

        jLabel16.setText("Email");

        jLabel17.setText("Password");

        staffName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffNameActionPerformed(evt);
            }
        });

        jLabel10.setText("Staff ID");

        staffSignup.setText("Sign up");
        staffSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffSignupActionPerformed(evt);
            }
        });

        jLabel18.setText("Department");

        staffDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer System and Network", "Artificial Intelligence", "Information Systems", "Software Engineering", "Multimedia", "Data Science" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(staffName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(staffID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(staffEmail)
                                    .addComponent(staffPassword)
                                    .addComponent(staffIc)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(staffDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(staffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(staffIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(staffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(staffDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(staffSignup)
                .addGap(40, 40, 40))
        );

        jTabbedPane4.addTab("Staff Sign up", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(320, 443));

        jLabel3.setText("Name");

        jLabel4.setText("IC");

        jLabel5.setText("Email");

        jLabel6.setText("Matric");

        jLabel7.setText("Password");

        jLabel8.setText("MUET");

        jLabel9.setText("Programme");

        studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameActionPerformed(evt);
            }
        });

        studentIc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIcActionPerformed(evt);
            }
        });

        studentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPasswordActionPerformed(evt);
            }
        });

        studentProg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor of Computer Science (Computer System and Network)", "Bachelor of Computer Science (Artificial Intelligence)", "Bachelor of Computer Science (Information Systems)", "Bachelor of Computer Science (Software Engineering)", "Bachelor of Information Technology (Multimedia)", "Bachelor of Computer Science (Data Science)" }));

        studentMuet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        studentSignup.setText("Sign up");
        studentSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentProg, 0, 0, Short.MAX_VALUE)
                    .addComponent(studentSignup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentIc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 44, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentMuet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(studentIc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(studentMatric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(studentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentMuet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentProg)
                .addGap(81, 81, 81)
                .addComponent(studentSignup)
                .addGap(33, 33, 33))
        );

        jTabbedPane4.addTab("Student Sign up", jPanel2);

        jLabel11.setIcon(new javax.swing.ImageIcon(Globals.path+"\\src\\main\\java\\com\\um\\maya\\bg.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSignupActionPerformed
        Student student = new Student();
        student.setEmail(studentEmail.getText());
        student.setName(studentName.getText());
        student.setIc(studentIc.getText());
        student.setMatric(studentMatric.getText());
        student.setPassword(studentPassword.getText());
        student.setProgramme(studentProg.getSelectedItem().toString());
        student.setMuet(Integer.parseInt(studentMuet.getSelectedItem().toString()));

        boolean result = false;

        if(student.name.equals("")   || student.ic.equals("") || student.email.equals("") ||
            student.matric.equals("") || student.password.equals(""))
        {
            JOptionPane.showMessageDialog(jPanel2,
                "Please fill in all info",
                "SignUp Error",
                JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try {
                result = Globals.db.createStudent(student);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (result)
            {
                try {
                    moveToDashboard();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel2,
                    "Student already exists",
                    "SignUp Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_studentSignupActionPerformed

    private void studentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentPasswordActionPerformed

    private void studentIcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIcActionPerformed

    private void studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameActionPerformed

    private void staffSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffSignupActionPerformed
        Staff staff = new Staff();
        staff.setEmail(staffEmail.getText());
        staff.setName(staffName.getText());
        staff.setIc(staffIc.getText());
        staff.setStaffID(staffID.getText());
        staff.setPassword(staffPassword.getText());
        staff.setDepartment(staffDepartment.getSelectedItem().toString());

        boolean result = false;

        if(staff.name.equals("")   || staff.ic.equals("") || staff.email.equals("") ||
            staff.staffID.equals("") || staff.password.equals(""))
        {
            JOptionPane.showMessageDialog(jPanel3,
                "Please fill in all info",
                "SignUp Error",
                JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try {
                result = Globals.db.createStaff(staff);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (result)
            {
                try {
                    moveToDashboard();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel3,
                    "Staff already exists",
                    "SignUp Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_staffSignupActionPerformed

    private void staffNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffNameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String userName = username3.getText();
        String pass = password3.getText();
        String type = userType3.getSelectedItem().toString();
        boolean result = false;
        if (type.equals("Student"))
        {
            try {
                result = Globals.db.getStudent(userName, pass);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (result){
                try {
                    moveToDashboard();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel6,
                    "Username/Password is incorrect!",
                    "Login Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        if (type.equals("Staff"))
        {
            try {
                result = Globals.db.getStaff(userName, pass);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (result){
                Globals.isStudent = false;
                try {
                    moveToDashboard();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel6,
                    "Username/Password is incorrect!",
                    "Login Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login_Signup().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login_Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void moveToDashboard() throws InterruptedException, ExecutionException
    {
        new Dashboard().setVisible(true);
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton login3;
    private javax.swing.JPasswordField password3;
    private static javax.swing.JComboBox<String> staffDepartment;
    private static javax.swing.JTextField staffEmail;
    private static javax.swing.JTextField staffID;
    private static javax.swing.JTextField staffIc;
    private static javax.swing.JTextField staffName;
    private static javax.swing.JTextField staffPassword;
    private static javax.swing.JButton staffSignup;
    private javax.swing.JTextField studentEmail;
    private javax.swing.JTextField studentIc;
    private javax.swing.JTextField studentMatric;
    private javax.swing.JComboBox<String> studentMuet;
    private static javax.swing.JTextField studentName;
    private javax.swing.JTextField studentPassword;
    private javax.swing.JComboBox<String> studentProg;
    private javax.swing.JButton studentSignup;
    private javax.swing.JComboBox<String> userType3;
    private javax.swing.JTextField username3;
    // End of variables declaration//GEN-END:variables
}
