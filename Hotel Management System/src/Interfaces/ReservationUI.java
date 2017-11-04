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
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


/**
 *
 * @author mhWiJe
 */
public class ReservationUI extends javax.swing.JFrame {

    ReservationModel RM = new ReservationModel();
    Reservation R = new Reservation();
    Guest G = new Guest();
    Room room = new Room();

    int GuestID,RoomID; //id to store the selected record ID
    
    public ReservationUI() {
        initComponents();
        tableLoad();
        Reset();
    }
 
    //function to load the table
    public void tableLoad()
    {
        tableGuests.setModel(DbUtils.resultSetToTableModel(G.GuestRecords()));
        tableRooms.setModel(DbUtils.resultSetToTableModel(room.AvailableRoomRecords()));
    }
    
    //function to clear the text fields
    public void Reset(){
        txtReservationRoomNumber.setText("");
        txtReservationGuestName.setText("");
        txtReservationHeadCount.setText("");
        DateReservationCheckOut.setDate(null);
        DateReservationCheckIn.setDate(null);
        GuestID=0;
        RoomID=0;
        btnAdd.setVisible(true);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGuests = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblReservationRoomNumber = new javax.swing.JLabel();
        txtReservationRoomNumber = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        lblReservationCheckIn = new javax.swing.JLabel();
        lblReservationGuestName = new javax.swing.JLabel();
        txtReservationGuestName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblReservationCheckOut = new javax.swing.JLabel();
        lblReservationHeadCount = new javax.swing.JLabel();
        txtReservationHeadCount = new javax.swing.JTextField();
        DateReservationCheckIn = new org.jdesktop.swingx.JXDatePicker();
        DateReservationCheckOut = new org.jdesktop.swingx.JXDatePicker();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRooms = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        tableGuests.setModel(new javax.swing.table.DefaultTableModel(
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
        tableGuests.setName(""); // NOI18N
        tableGuests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGuestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGuests);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 50, 570, 170);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblReservationRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationRoomNumber.setText("Room number");

        txtReservationRoomNumber.setEditable(false);
        txtReservationRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationRoomNumber.setName("txtReservationRoomNumber"); // NOI18N
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
        lblReservationCheckIn.setText("Check-in date");

        lblReservationGuestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationGuestName.setText("Guest Name");

        txtReservationGuestName.setEditable(false);
        txtReservationGuestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationGuestName.setName("txtRoomCategory"); // NOI18N
        txtReservationGuestName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtReservationGuestNamePropertyChange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        lblReservationCheckOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationCheckOut.setText("Check-out date");

        lblReservationHeadCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblReservationHeadCount.setText("Head count");

        txtReservationHeadCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReservationHeadCount.setName("txtName"); // NOI18N
        txtReservationHeadCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationHeadCountActionPerformed(evt);
            }
        });

        DateReservationCheckIn.setPreferredSize(new java.awt.Dimension(220, 30));

        DateReservationCheckOut.setPreferredSize(new java.awt.Dimension(220, 30));

        btnAdd.setBackground(new java.awt.Color(51, 51, 51));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setMargin(null);
        btnAdd.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAdd.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblReservationRoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblReservationCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblReservationHeadCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblReservationCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReservationHeadCount)
                            .addComponent(DateReservationCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateReservationCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservationGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservationRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateReservationCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateReservationCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReservationHeadCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservationHeadCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 30, 420, 400);

        tableRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Room ID", "Number", "Category", "No Of Beds", "Price", "is Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoomsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableRooms);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(460, 280, 570, 150);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Room Details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 260, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Guest Details");
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        RM.setGuestID(GuestID);
        RM.setRoomID(RoomID);
        RM.setCheckIN(DateReservationCheckIn.getDate().toString());
        RM.setCheckOut(DateReservationCheckOut.getDate().toString());
        
        //date difference
        Date checkin = DateReservationCheckOut.getDate();
        Date checkout = DateReservationCheckIn.getDate();
        int days = (int)(checkin.getTime() - checkout.getTime()) / (24 * 60 * 60 * 1000);

        Double cost = days*room.RoomPrice(RoomID);
        
        RM.setHeadCount(Integer.parseInt(txtReservationHeadCount.getText()));
        RM.setCost(cost);
        if(R.addReservation(RM) & room.RoomAvailability(RoomID)){
            JOptionPane.showMessageDialog(null,"Reservation successful. Total cost is"+cost,"Alert",JOptionPane.INFORMATION_MESSAGE);
        }
        tableLoad();
        Reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableGuestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGuestsMouseClicked
        int selectedRow=tableGuests.getSelectedRow();
        
        GuestID=Integer.parseInt(tableGuests.getValueAt(selectedRow,0).toString());
        txtReservationGuestName.setText(tableGuests.getValueAt(selectedRow,1).toString());
    }//GEN-LAST:event_tableGuestsMouseClicked

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

    private void tableRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoomsMouseClicked
        int selectedRow=tableRooms.getSelectedRow();
        
        RoomID=Integer.parseInt(tableRooms.getValueAt(selectedRow,0).toString());
        txtReservationRoomNumber.setText(tableRooms.getValueAt(selectedRow,1).toString());
    }//GEN-LAST:event_tableRoomsMouseClicked

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        ReservationListUI RLUI = new ReservationListUI();
        RLUI.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(ReservationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DateReservationCheckIn;
    private org.jdesktop.swingx.JXDatePicker DateReservationCheckOut;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblReservationCheckIn;
    private javax.swing.JLabel lblReservationCheckOut;
    private javax.swing.JLabel lblReservationGuestName;
    private javax.swing.JLabel lblReservationHeadCount;
    private javax.swing.JLabel lblReservationRoomNumber;
    private javax.swing.JTable tableGuests;
    private javax.swing.JTable tableRooms;
    private javax.swing.JTextField txtReservationGuestName;
    private javax.swing.JTextField txtReservationHeadCount;
    private javax.swing.JTextField txtReservationRoomNumber;
    // End of variables declaration//GEN-END:variables
}
