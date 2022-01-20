package com.um.maya;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ModuleView extends javax.swing.JFrame {
    boolean isNew;
    Module m;
    DefaultListModel studentListModel;
    
    public ModuleView(Module module, boolean isNew) {
        initList();
        initComponents();
        initstaffList();
        deleteBtn.setVisible(false);
        this.m = module;
        this.isNew= isNew;
        if(!isNew)
            loadData();
        jDialog1.setVisible(true);
    }
    
    private void initList(){
        studentListModel = new DefaultListModel();
        studentListModel.clear();
    }
    
    private void initstaffList(){
        for (Staff s: Globals.staffList)
        {
            String itemName = s.staffID + "," + s.name;
            
            if(((DefaultComboBoxModel)l_lecturer.getModel()).getIndexOf(itemName) == -1)
                l_lecturer.addItem(itemName);
            
            if(((DefaultComboBoxModel)t_lecturer.getModel()).getIndexOf(itemName) == -1)
                t_lecturer.addItem(itemName);
        }
    }
    
    private void loadData()
    {
        name.setText(m.name);
        code.setText(m.code);
        credit.setText(String.valueOf(m.credit));
        occurence.setText(String.valueOf(m.occurrence));
        capacity.setText(String.valueOf(m.capacity));
        programme.setSelectedItem(m.requirements);
        muet.setSelectedItem(String.valueOf(m.muet));
        
        if(!m.lecture.isEmpty())
        {
            isLecture.setSelected(true);
            l_lecturer.setSelectedItem(m.lecture.get(0));
            l_day.setSelectedItem(m.lecture.get(1));
            l_stime.setSelectedItem(m.lecture.get(2));
            l_etime.setSelectedItem(m.lecture.get(3));
            
            l_lecturer.setEnabled(true);
            l_day.setEnabled(true);
            l_stime.setEnabled(true);
            l_etime.setEnabled(true);
        }
        
        if(!m.tutorial.isEmpty())
        {
            isTutorial.setSelected(true);
            t_lecturer.setSelectedItem(m.tutorial.get(0));
            t_day.setSelectedItem(m.tutorial.get(1));
            t_stime.setSelectedItem(m.tutorial.get(2));
            t_etime.setSelectedItem(m.tutorial.get(3));
            
            t_lecturer.setEnabled(true);
            t_day.setEnabled(true);
            t_stime.setEnabled(true);
            t_etime.setEnabled(true);
        }
        
        
        for (String s : this.m.students)
        {
            studentListModel.addElement(s);
        }
        
        
        //disable name,code,occurence,credit for existing
        credit.setEnabled(false);
        occurence.setEnabled(false);
        name.setEnabled(false);
        code.setEnabled(false);
        
        deleteBtn.setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        occurence = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        credit = new javax.swing.JTextField();
        programme = new javax.swing.JComboBox<>();
        muet = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        l_day = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        l_lecturer = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        l_stime = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        l_etime = new javax.swing.JComboBox<>();
        t_day = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        t_lecturer = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        t_stime = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        t_etime = new javax.swing.JComboBox<>();
        isTutorial = new javax.swing.JCheckBox();
        isLecture = new javax.swing.JCheckBox();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(850, 1030));

        jLabel1.setText("Module Code");

        jLabel2.setText("Module Name");

        jLabel3.setText("Module Occurence");

        jLabel4.setText("Capacity");

        jLabel5.setText("Programme Requirements");

        jLabel6.setText("MUET Requirements");

        jLabel7.setText("Credit");

        jLabel8.setText("Lecture");

        jLabel9.setText("Tutorial");

        studentList.setModel(studentListModel);
        jScrollPane1.setViewportView(studentList);

        jLabel10.setText("Students");

        programme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Bachelor of Computer Science (Computer System and Network)", "Bachelor of Computer Science (Artificial Intelligence)", "Bachelor of Computer Science (Information Systems)", "Bachelor of Computer Science (Software Engineering)", "Bachelor of Information Technology (Multimedia)", "Bachelor of Computer Science (Data Science)" }));

        muet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5" }));

        jLabel11.setText("Lecturer");

        l_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "monday", "tuesday", "wednesday", "thursday", "friday" }));
        l_day.setEnabled(false);

        jLabel12.setText("Day");

        l_lecturer.setEnabled(false);
        l_lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_lecturerActionPerformed(evt);
            }
        });

        jLabel13.setText("Start Time");

        l_stime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        l_stime.setEnabled(false);

        jLabel14.setText("End Time");

        l_etime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        l_etime.setEnabled(false);

        t_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "monday", "tuesday", "wednesday", "thursday", "friday" }));
        t_day.setEnabled(false);

        jLabel15.setText("Day");

        t_lecturer.setEnabled(false);
        t_lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_lecturerActionPerformed(evt);
            }
        });

        jLabel16.setText("Lecturer");

        jLabel17.setText("Start Time");

        t_stime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        t_stime.setEnabled(false);

        jLabel18.setText("End Time");

        t_etime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        t_etime.setEnabled(false);

        isTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isTutorialActionPerformed(evt);
            }
        });

        isLecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isLectureActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isLecture)
                                    .addComponent(isTutorial))))
                        .addGap(13, 13, 13)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(code)
                            .addComponent(name)
                            .addComponent(occurence)
                            .addComponent(capacity)
                            .addComponent(credit)
                            .addComponent(programme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l_lecturer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDialog1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(l_day, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDialog1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(t_day, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(t_stime, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l_stime, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(l_etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(t_etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_lecturer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(occurence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(programme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(muet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11)
                        .addComponent(l_lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(isLecture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(l_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(l_etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel9))
                                    .addComponent(isTutorial)))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_lecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t_etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15)
                                    .addComponent(t_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(l_stime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_stime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap(413, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isTutorialActionPerformed
        if(!isTutorial.isSelected())
        {
            t_lecturer.setEnabled(false);
            t_day.setEnabled(false);
            t_stime.setEnabled(false);
            t_etime.setEnabled(false);
        }
        else
        {
            t_lecturer.setEnabled(true);
            t_day.setEnabled(true);
            t_stime.setEnabled(true);
            t_etime.setEnabled(true);
        }
    }//GEN-LAST:event_isTutorialActionPerformed

    private void isLectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isLectureActionPerformed
        if(!isLecture.isSelected())
        {
            l_lecturer.setEnabled(false);
            l_day.setEnabled(false);
            l_stime.setEnabled(false);
            l_etime.setEnabled(false);
        }
        else
        {
            l_lecturer.setEnabled(true);
            l_day.setEnabled(true);
            l_stime.setEnabled(true);
            l_etime.setEnabled(true);
        }
    }//GEN-LAST:event_isLectureActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            Globals.modules.remove(m);
            Globals.db.deleteModule(this.m);
            JOptionPane.showMessageDialog(rootPane, "Module successfully deleted!");
            Globals.modulesTable.fireTableDataChanged();
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(ModuleView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ModuleView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        this.m.setCode(code.getText());
        this.m.setName(name.getText());
        this.m.setOccurrence(Integer.parseInt(occurence.getText()));
        this.m.setCapacity(Integer.parseInt(capacity.getText()));
        this.m.setCredit(Integer.parseInt(credit.getText()));
        String muetStr = muet.getSelectedItem().toString();
        int muetInt = 0;
        if(!muetStr.equals("None")){
            muetInt = Integer.parseInt(muetStr);
        }
        this.m.setMuet(muetInt);
        this.m.setRequirements(programme.getSelectedItem().toString());
        
        if(this.m.students==null)
            this.m.students = new ArrayList<String>();
        
        if(this.m.lecture==null){
            this.m.lecture = new ArrayList<String>();
        }
        
        if(isLecture.isSelected())
        {
            this.m.lecture.add(0,l_lecturer.getSelectedItem().toString());
            this.m.lecture.add(1,l_day.getSelectedItem().toString());
            this.m.lecture.add(2,l_stime.getSelectedItem().toString());
            this.m.lecture.add(3,l_etime.getSelectedItem().toString());
        }
        
        if(this.m.tutorial==null){
            this.m.tutorial= new ArrayList<String>();
        }
        
        if(isTutorial.isSelected())
        {
            this.m.tutorial.add(0,t_lecturer.getSelectedItem().toString());
            this.m.tutorial.add(1,t_day.getSelectedItem().toString());
            this.m.tutorial.add(2,t_stime.getSelectedItem().toString());
            this.m.tutorial.add(3,t_etime.getSelectedItem().toString());
        }
        boolean isFound = false;
        if(isNew)
        {
            for(Module mod : Globals.modules)
            {
                if(mod.code.equalsIgnoreCase(this.m.code) && mod.occurrence==(this.m.occurrence))
                {
                    isFound= true;
                    break;
                }   
            }
        }
        
        if (isFound)
            JOptionPane.showMessageDialog(rootPane, "Module already exists");
        
        else
            try {
                Globals.db.updateModule(this.m);
                JOptionPane.showMessageDialog(rootPane, "Module successfully updated!");
            } catch (InterruptedException ex) {
                Logger.getLogger(ModuleView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(ModuleView.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void l_lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_lecturerActionPerformed
        
    }//GEN-LAST:event_l_lecturerActionPerformed

    private void t_lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_lecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_lecturerActionPerformed

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
            java.util.logging.Logger.getLogger(ModuleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuleView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ModuleView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField code;
    private javax.swing.JTextField credit;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JCheckBox isLecture;
    private javax.swing.JCheckBox isTutorial;
    private static javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> l_day;
    private javax.swing.JComboBox<String> l_etime;
    private javax.swing.JComboBox<String> l_lecturer;
    private javax.swing.JComboBox<String> l_stime;
    private javax.swing.JComboBox<String> muet;
    private javax.swing.JTextField name;
    private javax.swing.JTextField occurence;
    private javax.swing.JComboBox<String> programme;
    private javax.swing.JList<String> studentList;
    private javax.swing.JComboBox<String> t_day;
    private javax.swing.JComboBox<String> t_etime;
    private javax.swing.JComboBox<String> t_lecturer;
    private javax.swing.JComboBox<String> t_stime;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
