/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.ReservationModel;
import DBOperations.Guest;
import DBOperations.Reservation;
import DBOperations.Room;
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
public class ReservationListUI extends javax.swing.JFrame {

    ReservationModel RM = new ReservationModel();
    Reservation R = new Reservation();
    Guest G = new Guest();
    Room room = new Room();

    int id; //id to store the selected record ID
    
    public ReservationListUI() {
        initComponents();
        tableLoad();
        Reset();
    }
 
    //function to load the table
    public void tableLoad()
    {
        tableReservations.setModel(DbUtils.resultSetToTableModel(R.ReservationRecords()));
    }
    
    //function to clear the text fields
    public void Reset(){
        txtReservationRoomNumber.setText("");
        txtReservationGuestName.setText("");
        txtReservationHeadCount.setText("");
        txtReservationTotalCost.setText("");
        id=0;
        txtReservationcheckIn.setText("");
        txtReservationcheckOut.setText("");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservations = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblReservationRoomNumber = new javax.swing.JLabel();
        txtReservationRoomNumber = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        lblReservationCheckIn = new javax.swing.JLabel();
        lblReservationGuestName = new javax.swing.JLabel();
        txtReservationGuestName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblReservationHeadCount = new javax.swing.JLabel();
        txtReservationHeadCount = new javax.swing.JTextField();
        lblReservationTotalCost = new javax.swing.JLabel();
        txtReservationTotalCost = new javax.swing.JTextField();
        txtReservationcheckIn = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnNewReseration = new javax.swing.JButton();
        lblReservationCheckOut1 = new javax.swing.JLabel();
        txtReservationcheckOut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        tableReservations.setModel(new javax.swing.table.DefaultTableModel(
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
        tableReservations.setName(""); // NOI18N
        tableReservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReservationsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableReservations);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 50, 570, 410);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblReservationRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationRoomNumber.setText("Room number    :");

        txtReservationRoomNumber.setEditable(false);
        txtReservationRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationRoomNumber.setName("txtReservationRoomNumber"); // NOI18N
        txtReservationRoomNumber.setPreferredSize(new java.awt.Dimension(220, 30));
        txtReservationRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationRoomNumberActionPerformed(evt);
            }
        });
        txtReservationRoomNumber.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtReservationRoomNumberPropertyChange(evt);
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

        lblReservationCheckIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationCheckIn.setText("Check-in date     :");

        lblReservationGuestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationGuestName.setText("Guest Name        :");

        txtReservationGuestName.setEditable(false);
        txtReservationGuestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationGuestName.setName("txtRoomCategory"); // NOI18N
        txtReservationGuestName.setPreferredSize(new java.awt.Dimension(220, 30));
        txtReservationGuestName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtReservationGuestNamePropertyChange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        lblReservationHeadCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationHeadCount.setText("Head count        :");

        txtReservationHeadCount.setEditable(false);
        txtReservationHeadCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationHeadCount.setName("txtName"); // NOI18N
        txtReservationHeadCount.setPreferredSize(new java.awt.Dimension(220, 30));
        txtReservationHeadCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationHeadCountActionPerformed(evt);
            }
        });

        lblReservationTotalCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationTotalCost.setText("Total cost           :");

        txtReservationTotalCost.setEditable(false);
        txtReservationTotalCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationTotalCost.setName("txtName"); // NOI18N
        txtReservationTotalCost.setPreferredSize(new java.awt.Dimension(220, 30));
        txtReservationTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationTotalCostActionPerformed(evt);
            }
        });

        txtReservationcheckIn.setEditable(false);
        txtReservationcheckIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationcheckIn.setName("txtReservationRoomNumber"); // NOI18N
        txtReservationcheckIn.setPreferredSize(new java.awt.Dimension(220, 30));
        txtReservationcheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationcheckInActionPerformed(evt);
            }
        });
        txtReservationcheckIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtReservationcheckInPropertyChange(evt);
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

        btnNewReseration.setBackground(new java.awt.Color(51, 51, 51));
        btnNewReseration.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNewReseration.setText("New Reservation");
        btnNewReseration.setMargin(null);
        btnNewReseration.setMaximumSize(new java.awt.Dimension(100, 30));
        btnNewReseration.setMinimumSize(new java.awt.Dimension(100, 30));
        btnNewReseration.setPreferredSize(new java.awt.Dimension(100, 30));
        btnNewReseration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReserationActionPerformed(evt);
            }
        });

        lblReservationCheckOut1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationCheckOut1.setText("Check-out date  :");

        txtReservationcheckOut.setEditable(false);
        txtReservationcheckOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationcheckOut.setName("txtReservationRoomNumber"); // NOI18N
        txtReservationcheckOut.setPreferredSize(new java.awt.Dimension(220, 30));
        txtReservationcheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationcheckOutActionPerformed(evt);
            }
        });
        txtReservationcheckOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtReservationcheckOutPropertyChange(evt);
            }
        });

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
                                .addComponent(lblReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblReservationRoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(txtReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNewReseration, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblReservationCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblReservationHeadCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblReservationTotalCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblReservationCheckOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReservationcheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReservationcheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtReservationTotalCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtReservationHeadCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnNewReseration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservationcheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservationCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationCheckOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservationcheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationHeadCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservationHeadCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReservationTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReservationTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 30, 420, 430);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Reservations");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 30, 80, 20);

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

    private void tableReservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReservationsMouseClicked
        
        int selectedRow=tableReservations.getSelectedRow();
        
        id=Integer.parseInt(tableReservations.getValueAt(selectedRow,0).toString());
        txtReservationGuestName.setText(G.GuestName(Integer.parseInt(tableReservations.getValueAt(selectedRow,1).toString())));
        txtReservationRoomNumber.setText(room.RoomName(Integer.parseInt(tableReservations.getValueAt(selectedRow,2).toString())));
        txtReservationcheckIn.setText(tableReservations.getValueAt(selectedRow,3).toString());
        txtReservationcheckOut.setText(tableReservations.getValueAt(selectedRow,4).toString());
        txtReservationHeadCount.setText(tableReservations.getValueAt(selectedRow,5).toString());
        txtReservationTotalCost.setText(tableReservations.getValueAt(selectedRow,6).toString());
    }//GEN-LAST:event_tableReservationsMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtReservationRoomNumberPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtReservationRoomNumberPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationRoomNumberPropertyChange

    private void txtReservationGuestNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtReservationGuestNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationGuestNamePropertyChange

    private void txtReservationRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationRoomNumberActionPerformed

    private void txtReservationHeadCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationHeadCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationHeadCountActionPerformed

    private void txtReservationTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationTotalCostActionPerformed

    private void txtReservationcheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationcheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationcheckInActionPerformed

    private void txtReservationcheckInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtReservationcheckInPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationcheckInPropertyChange

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
        if(x==0){
            if(R.DeleteReservation(id)){
                JOptionPane.showMessageDialog(null,"Successfuliy deleted","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
                Reset();
            }
            else{
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewReserationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReserationActionPerformed
        ReservationUI RUI = new ReservationUI();
        RUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewReserationActionPerformed

    private void txtReservationcheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationcheckOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationcheckOutActionPerformed

    private void txtReservationcheckOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtReservationcheckOutPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationcheckOutPropertyChange

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
            java.util.logging.Logger.getLogger(ReservationListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationListUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewReseration;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReservationCheckIn;
    private javax.swing.JLabel lblReservationCheckOut1;
    private javax.swing.JLabel lblReservationGuestName;
    private javax.swing.JLabel lblReservationHeadCount;
    private javax.swing.JLabel lblReservationRoomNumber;
    private javax.swing.JLabel lblReservationTotalCost;
    private javax.swing.JTable tableReservations;
    private javax.swing.JTextField txtReservationGuestName;
    private javax.swing.JTextField txtReservationHeadCount;
    private javax.swing.JTextField txtReservationRoomNumber;
    private javax.swing.JTextField txtReservationTotalCost;
    private javax.swing.JTextField txtReservationcheckIn;
    private javax.swing.JTextField txtReservationcheckOut;
    // End of variables declaration//GEN-END:variables
}
