/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.GuestModel;
import DBOperations.Guest;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author HarshaKoshila
 */
public class GuestUI extends javax.swing.JFrame {

    GuestModel GM = new GuestModel();
    Guest G = new Guest();

    int id; //id to store the selected record ID
    
    public GuestUI() {
        initComponents();
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        txtGuestID.setVisible(false);
        lblGuestID.setVisible(false);
        tableLoad();
        Reset();
    }
 
    //function to load the table
    public void tableLoad()
    {
        tableGuest.setModel(DbUtils.resultSetToTableModel(G.GuestRecords()));
    }
    
    //function to clear the text fields
    public void Reset(){
        txtGuestName.setText("");
        txtGuestID.setText("");
        txtGuestEmail.setText("");
        txtGuestNIC.setText("");
        txtGuestTP.setText("");
        txtGuestAddress.setText("");
        id=0;
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        btnAdd.setVisible(true);
        txtGuestID.setVisible(false);
        lblGuestID.setVisible(false);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGuest = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblGuestName = new javax.swing.JLabel();
        txtGuestName = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        lblGuestNIC = new javax.swing.JLabel();
        lblGuestID = new javax.swing.JLabel();
        txtGuestID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblGuestTP = new javax.swing.JLabel();
        lblGuestEmail = new javax.swing.JLabel();
        txtGuestEmail = new javax.swing.JTextField();
        lblGuestAddress = new javax.swing.JLabel();
        txtGuestTP = new javax.swing.JTextField();
        txtGuestNIC = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGuestAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        tableGuest.setModel(new javax.swing.table.DefaultTableModel(
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
        tableGuest.setName(""); // NOI18N
        tableGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGuestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGuest);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 30, 570, 340);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblGuestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGuestName.setText("Name                  :");

        txtGuestName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGuestName.setName("txtGuestName"); // NOI18N
        txtGuestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestNameActionPerformed(evt);
            }
        });
        txtGuestName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtGuestNamePropertyChange(evt);
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

        lblGuestNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGuestNIC.setText("NIC                     :");

        lblGuestID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGuestID.setText("Guest ID              :");

        txtGuestID.setEditable(false);
        txtGuestID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGuestID.setName("txtRoomCategory"); // NOI18N
        txtGuestID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtGuestIDPropertyChange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

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
        jPanel3.add(btnAdd);

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
        jPanel3.add(btnUpdate);

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setMaximumSize(new java.awt.Dimension(100, 30));
        btnDelete.setMinimumSize(new java.awt.Dimension(100, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblGuestTP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGuestTP.setText("Telephone           :");

        lblGuestEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGuestEmail.setText("Email                   :");

        txtGuestEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGuestEmail.setName("txtName"); // NOI18N
        txtGuestEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestEmailActionPerformed(evt);
            }
        });

        lblGuestAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGuestAddress.setText("Address               :");

        txtGuestTP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGuestTP.setName("txtRoomName"); // NOI18N
        txtGuestTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestTPActionPerformed(evt);
            }
        });
        txtGuestTP.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtGuestTPPropertyChange(evt);
            }
        });

        txtGuestNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGuestNIC.setName("txtRoomName"); // NOI18N
        txtGuestNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestNICActionPerformed(evt);
            }
        });
        txtGuestNIC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtGuestNICPropertyChange(evt);
            }
        });

        txtGuestAddress.setColumns(20);
        txtGuestAddress.setRows(5);
        txtGuestAddress.setPreferredSize(new java.awt.Dimension(180, 94));
        jScrollPane2.setViewportView(txtGuestAddress);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblGuestTP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGuestTP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblGuestName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblGuestNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGuestEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGuestAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtGuestNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGuestEmail)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuestNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuestNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuestTP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuestTP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuestEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGuestAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 30, 420, 450);

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
        
        GM.setName(txtGuestName.getText());
        GM.setNIC(txtGuestNIC.getText());
        GM.setTP(txtGuestTP.getText());
        GM.setEmail(txtGuestEmail.getText());
        GM.setAddress(txtGuestAddress.getText());
        
        if(G.addGuest(GM)){
            JOptionPane.showMessageDialog(null,"Successfully inserted","Alert",JOptionPane.INFORMATION_MESSAGE);
        }
        tableLoad();
        Reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGuestMouseClicked
        int selectedRow=tableGuest.getSelectedRow();
        
        id=Integer.parseInt(tableGuest.getValueAt(selectedRow,0).toString());
        txtGuestID.setText(tableGuest.getValueAt(selectedRow,0).toString());
        txtGuestName.setText(tableGuest.getValueAt(selectedRow,1).toString());
        txtGuestNIC.setText(tableGuest.getValueAt(selectedRow,2).toString());
        txtGuestTP.setText(tableGuest.getValueAt(selectedRow,3).toString());
        txtGuestEmail.setText(tableGuest.getValueAt(selectedRow,4).toString());
        txtGuestAddress.setText(tableGuest.getValueAt(selectedRow,5).toString());
        btnAdd.setVisible(false);
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
        txtGuestID.setVisible(true);
        lblGuestID.setVisible(true);
    }//GEN-LAST:event_tableGuestMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
        GM.setId(Integer.parseInt(txtGuestID.getText()));
        GM.setName(txtGuestName.getText());
        GM.setNIC(txtGuestNIC.getText());
        GM.setTP(txtGuestTP.getText());
        GM.setEmail(txtGuestEmail.getText());
        GM.setAddress(txtGuestAddress.getText());
        
        if(x==0)
        {
            if(G.updateGuest(GM))
            {
                JOptionPane.showMessageDialog(null,"Successfuliy updated","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
                Reset();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
        if(x==0){
            if(G.DeleteGuest(id)){
                JOptionPane.showMessageDialog(null,"Successfuliy deleted","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
                Reset();
            }
            else{
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtGuestNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtGuestNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestNamePropertyChange

    private void txtGuestIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtGuestIDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestIDPropertyChange

    private void txtGuestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestNameActionPerformed

    private void txtGuestEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestEmailActionPerformed

    private void txtGuestTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestTPActionPerformed

    private void txtGuestTPPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtGuestTPPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestTPPropertyChange

    private void txtGuestNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestNICActionPerformed

    private void txtGuestNICPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtGuestNICPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestNICPropertyChange

    
    
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
            java.util.logging.Logger.getLogger(GuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGuestAddress;
    private javax.swing.JLabel lblGuestEmail;
    private javax.swing.JLabel lblGuestID;
    private javax.swing.JLabel lblGuestNIC;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblGuestTP;
    private javax.swing.JTable tableGuest;
    private javax.swing.JTextArea txtGuestAddress;
    private javax.swing.JTextField txtGuestEmail;
    private javax.swing.JTextField txtGuestID;
    private javax.swing.JTextField txtGuestNIC;
    private javax.swing.JTextField txtGuestName;
    private javax.swing.JTextField txtGuestTP;
    // End of variables declaration//GEN-END:variables
}
