
package com.um.maya;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Dashboard extends javax.swing.JFrame {
    
    ButtonColumn btnCOL;
    
    public Dashboard() throws InterruptedException, ExecutionException {
        initTimetable();
        initListeners();
        initmoduleTable();
        initComponents();
        initmoduleTable2();
        
        //Hide add course button if student
        if(Globals.isStudent)
            addBtn.setVisible(false);
    }

    private void initTimetable() throws InterruptedException, ExecutionException {
        String[][] initRows= 
        {
            {"Monday","","","","","","","","","","","","",""},
            {"Tuesday","","","","","","","","","","","","",""},
            {"Wednesday","","","","","","","","","","","","",""},
            {"Thursday","","","","","","","","","","","","",""},
            {"Friday","","","","","","","","","","","","",""},
        };
        
        Globals.timetable = new DefaultTableModel(initRows, Globals.timetableCols){
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    private void initListeners() throws InterruptedException, InterruptedException, ExecutionException{
        Globals.modules = new ArrayList<Module>();
        Globals.staffList = new ArrayList<Staff>();
        Globals.db.getAllModules();
        Globals.db.getAllStaff();
    }
    
    private void initmoduleTable() {
        Globals.modulesTable = new DefaultTableModel() 
        {
            public Class getColumnClass(int columnIndex) {
              return String.class;
            }
            
            @Override
            public boolean isCellEditable(int i, int i1) {
                if(i1 == 7)
                    return true;
                
                return false;
            }
        };
                
        Globals.modulesTable.addColumn("Module");
        Globals.modulesTable.addColumn("Occurence");
        Globals.modulesTable.addColumn("Activity");
        Globals.modulesTable.addColumn("Day & Time");
        Globals.modulesTable.addColumn("Instructor");
        Globals.modulesTable.addColumn("Target");
        Globals.modulesTable.addColumn("Actual");
        Globals.modulesTable.addColumn("Action");

        Globals.modulesTable.setNumRows(0);
    }
    
    private void initmoduleTable2(){
        moduletable.setDefaultRenderer(String.class, new MultiLineCellRenderer());
        this.btnCOL = new ButtonColumn (moduletable,tableActionButton,7);
        Globals.module = new Module();
        Globals.module.viewAllModules("", false);
    }
    
    Action tableActionButton =  new AbstractAction() {
        public void actionPerformed(ActionEvent e) {
       //JTable table = (JTable) e.getSource(); // If you have multiple component following the ActionEvent
            int modelRow = Integer.valueOf(e.getActionCommand());
            
            Module module = new Module();
            String code = Globals.modulesTable.getValueAt(modelRow, 0).toString().substring(0, 7);
            int occurance = Integer.parseInt(Globals.modulesTable.getValueAt(modelRow, 1).toString()) ;
            
            for(Module m : Globals.modules)
                {
                    if(m.code.equals(code) && m.occurrence == occurance)
                    {
                        module = m;
                        break;
                    }
                }
            
            if (Globals.isStudent) {
                String value = (String) Globals.modulesTable.getValueAt(modelRow, 7);
                
                if(value=="Add")
                {
                    String result="";
                    try {
                        result = Globals.student.addModule(module);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ExecutionException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(rootPane, result);   
                }
                else
                {
                    try {
                        Globals.student.dropModule(module);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ExecutionException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(rootPane, "Successfully Dropped");
                }
                
            } else {
                new ModuleView(module,false);
            }
        }

        private void print(String code) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        timetable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        moduletable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        moduleQuery = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        mineBtn = new javax.swing.JButton();
        allBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1200, 600));

        timetable.setModel(Globals.timetable);
        timetable.setRowHeight(60);
        jScrollPane1.setViewportView(timetable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Timetable", jPanel1);

        moduletable.setModel(Globals.modulesTable);
        moduletable.setRowHeight(60);
        moduletable.setShowGrid(true);
        jScrollPane3.setViewportView(moduletable);

        jLabel1.setText("Search");

        moduleQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleQueryActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        mineBtn.setText("Show My Modules");
        mineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineBtnActionPerformed(evt);
            }
        });

        allBtn.setText("Show All");
        allBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add Module");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(moduleQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mineBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 216, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(moduleQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(allBtn)
                    .addComponent(mineBtn)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Modules", jPanel2);

        jMenu1.setText("Account");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Timetable");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moduleQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleQueryActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String query = moduleQuery.getText();
        Globals.module.viewAllModules(query, false);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void mineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineBtnActionPerformed
        Globals.module.viewAllModules("", true);
    }//GEN-LAST:event_mineBtnActionPerformed

    private void allBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBtnActionPerformed
        Globals.module.viewAllModules("", false);
    }//GEN-LAST:event_allBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new ModuleView(new Module(), true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            new Login_Signup().setVisible(true);
            //reset cookie when logout
            Globals.modules = new ArrayList<Module>();
            Globals.student = new Student();
            Globals.staff = new Staff();
            Globals.module = new Module();
            Globals.timetable = new DefaultTableModel();
            Globals.modulesTable = new DefaultTableModel();
            Globals.isStudent = true;
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton allBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mineBtn;
    private javax.swing.JTextField moduleQuery;
    private javax.swing.JTable moduletable;
    private javax.swing.JButton searchBtn;
    private static javax.swing.JTable timetable;
    // End of variables declaration//GEN-END:variables

    

    
}
