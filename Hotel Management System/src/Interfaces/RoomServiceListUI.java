/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Room_ServiceModel;
import DBOperations.Room;
import DBOperations.Room_Service;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


/**
 *
 * @author mhWiJe
 */
public class RoomServiceListUI extends javax.swing.JFrame {

    Room_Service RS = new Room_Service();
    Room_ServiceModel RSM = new Room_ServiceModel();
    Room room = new Room();
    int roomID,menuID;

    int id; //id to store the selected record ID
    
    public RoomServiceListUI() {
        initComponents();
        tableLoad();
        Reset();
    }
 
    //function to load the table
    public void tableLoad()
    {
        tableRoomService.setModel(DbUtils.resultSetToTableModel(RS.Room_ServiceRecords()));
    }
    
    //function to clear the text fields
    public void Reset(){
        txtRoomServiceMenu.setText("");
        txtRoomServiceRoomNumber.setText("");
        id=0;
        txtRoomServiceStatus.setText("");
        DateRoomServiceDate.setDate(null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoomService = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblReservationMenu = new javax.swing.JLabel();
        txtRoomServiceMenu = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        lblRoomServiceStatus = new javax.swing.JLabel();
        lblReservationRoomNumber = new javax.swing.JLabel();
        txtRoomServiceRoomNumber = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtRoomServiceStatus = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnNewRoomService = new javax.swing.JButton();
        lblRoomServiceDate = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        DateRoomServiceDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        tableRoomService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Guest ID", "Name", "NIC", "Telephone", "Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRoomService.setName(""); // NOI18N
        tableRoomService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoomServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRoomService);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 50, 570, 400);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblReservationMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationMenu.setText("Menu description");

        txtRoomServiceMenu.setEditable(false);
        txtRoomServiceMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomServiceMenu.setName("txtRoomServiceMenu"); // NOI18N
        txtRoomServiceMenu.setPreferredSize(new java.awt.Dimension(220, 30));
        txtRoomServiceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomServiceMenuActionPerformed(evt);
            }
        });
        txtRoomServiceMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomServiceMenuPropertyChange(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 51, 51));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblRoomServiceStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomServiceStatus.setText("Status");

        lblReservationRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationRoomNumber.setText("Room number");

        txtRoomServiceRoomNumber.setEditable(false);
        txtRoomServiceRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomServiceRoomNumber.setName("txtRoomCategory"); // NOI18N
        txtRoomServiceRoomNumber.setPreferredSize(new java.awt.Dimension(220, 30));
        txtRoomServiceRoomNumber.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomServiceRoomNumberPropertyChange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        txtRoomServiceStatus.setEditable(false);
        txtRoomServiceStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomServiceStatus.setName("txtReservationRoomNumber"); // NOI18N
        txtRoomServiceStatus.setPreferredSize(new java.awt.Dimension(220, 30));
        txtRoomServiceStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomServiceStatusActionPerformed(evt);
            }
        });
        txtRoomServiceStatus.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomServiceStatusPropertyChange(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setMargin(null);
        btnDelete.setMaximumSize(new java.awt.Dimension(100, 30));
        btnDelete.setMinimumSize(new java.awt.Dimension(100, 30));
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNewRoomService.setBackground(new java.awt.Color(51, 51, 51));
        btnNewRoomService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNewRoomService.setText("New Room Service");
        btnNewRoomService.setMargin(null);
        btnNewRoomService.setMaximumSize(new java.awt.Dimension(100, 30));
        btnNewRoomService.setMinimumSize(new java.awt.Dimension(100, 30));
        btnNewRoomService.setPreferredSize(new java.awt.Dimension(100, 30));
        btnNewRoomService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRoomServiceActionPerformed(evt);
            }
        });

        lblRoomServiceDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomServiceDate.setText("Date");

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setMargin(null);
        btnUpdate.setMaximumSize(new java.awt.Dimension(100, 30));
        btnUpdate.setMinimumSize(new java.awt.Dimension(100, 30));
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        DateRoomServiceDate.setPreferredSize(new java.awt.Dimension(220, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblReservationMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(txtRoomServiceRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRoomServiceStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoomServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoomServiceMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DateRoomServiceDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRoomServiceStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(btnNewRoomService, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnNewRoomService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomServiceRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomServiceMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservationMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomServiceStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoomServiceStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateRoomServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 30, 420, 420);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Room Service");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 30, 100, 20);

        btnClose.setBackground(new java.awt.Color(51, 51, 51));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.setMargin(null);
        btnClose.setMaximumSize(new java.awt.Dimension(100, 30));
        btnClose.setMinimumSize(new java.awt.Dimension(100, 30));
        btnClose.setPreferredSize(new java.awt.Dimension(100, 30));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);
        btnClose.setBounds(930, 470, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableRoomServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoomServiceMouseClicked
        
        int selectedRow=tableRoomService.getSelectedRow();
        
        id=Integer.parseInt(tableRoomService.getValueAt(selectedRow,0).toString());
        txtRoomServiceRoomNumber.setText(room.RoomName(Integer.parseInt(tableRoomService.getValueAt(selectedRow,1).toString())));
        txtRoomServiceMenu.setText(RS.MenuDes(Integer.parseInt(tableRoomService.getValueAt(selectedRow,2).toString())));
        txtRoomServiceStatus.setText(tableRoomService.getValueAt(selectedRow,3).toString());
        roomID = Integer.parseInt(tableRoomService.getValueAt(selectedRow,1).toString());
        menuID = Integer.parseInt(tableRoomService.getValueAt(selectedRow,2).toString());
    }//GEN-LAST:event_tableRoomServiceMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtRoomServiceMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomServiceMenuPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomServiceMenuPropertyChange

    private void txtRoomServiceRoomNumberPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomServiceRoomNumberPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomServiceRoomNumberPropertyChange

    private void txtRoomServiceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomServiceMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomServiceMenuActionPerformed

    private void txtRoomServiceStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomServiceStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomServiceStatusActionPerformed

    private void txtRoomServiceStatusPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomServiceStatusPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomServiceStatusPropertyChange

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
        if(x==0){
            if(RS.deleteRoomService(id)){
                JOptionPane.showMessageDialog(null,"Successfuliy deleted","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
                Reset();
            }
            else{
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewRoomServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRoomServiceActionPerformed
        RoomServiceUI RSUI = new RoomServiceUI();
        RSUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewRoomServiceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        RSM.setId(id);
        RSM.setRoomID(roomID);
        RSM.setMenuID(menuID);
        RSM.setDate(DateRoomServiceDate.getDate().toString());

        if(RS.updateRoomService(RSM)){
            JOptionPane.showMessageDialog(null,"Room service updated successful.","Alert",JOptionPane.INFORMATION_MESSAGE);
        }
        tableLoad();
        Reset();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RoomServiceListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomServiceListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomServiceListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomServiceListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomServiceListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DateRoomServiceDate;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewRoomService;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReservationMenu;
    private javax.swing.JLabel lblReservationRoomNumber;
    private javax.swing.JLabel lblRoomServiceDate;
    private javax.swing.JLabel lblRoomServiceStatus;
    private javax.swing.JTable tableRoomService;
    private javax.swing.JTextField txtRoomServiceMenu;
    private javax.swing.JTextField txtRoomServiceRoomNumber;
    private javax.swing.JTextField txtRoomServiceStatus;
    // End of variables declaration//GEN-END:variables
}
