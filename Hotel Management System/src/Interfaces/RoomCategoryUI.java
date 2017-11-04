/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DBOperations.Room_Category;
import Classes.Room_CategoryModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author mhWije
 */
public class RoomCategoryUI extends javax.swing.JFrame {

    Room_Category RC = new Room_Category();
    Room_CategoryModel RCM = new Room_CategoryModel();

    int id; //id to store the selected record ID
    
    public RoomCategoryUI() {
        initComponents();
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        txtRoomCategoryID.setVisible(false);
        lblRoomCategoryID.setVisible(false);
        tableLoad();
    }
 
    //function to load the table
    public void tableLoad()
    {
        tableRoomCategory.setModel(DbUtils.resultSetToTableModel(RC.Room_CategoryRecords()));
    }
    
    //function to clear the text fields
    public void Reset(){
        txtRoomCategory.setText("");
        txtPricePerHead.setText("");
        txtRoomCategoryID.setText("");
        id=0;
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        btnAdd.setVisible(true);
        txtRoomCategoryID.setVisible(false);
        lblRoomCategoryID.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoomCategory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblRoomCategory = new javax.swing.JLabel();
        txtRoomCategory = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        txtPricePerHead = new javax.swing.JTextField();
        lblPricePerHead = new javax.swing.JLabel();
        lblRoomCategoryID = new javax.swing.JLabel();
        txtRoomCategoryID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        tableRoomCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room Category ID", "Name", "Price per Head", "is Active"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRoomCategory.setName(""); // NOI18N
        tableRoomCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoomCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRoomCategory);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 30, 520, 340);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblRoomCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomCategory.setText("Category name :");

        txtRoomCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomCategory.setName("txtRoomCategory"); // NOI18N
        txtRoomCategory.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomCategoryPropertyChange(evt);
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

        txtPricePerHead.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPricePerHead.setName("txtName"); // NOI18N
        txtPricePerHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePerHeadActionPerformed(evt);
            }
        });

        lblPricePerHead.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPricePerHead.setText("Price per head   :");

        lblRoomCategoryID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomCategoryID.setText("Category ID      :");

        txtRoomCategoryID.setEditable(false);
        txtRoomCategoryID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomCategoryID.setName("txtRoomCategory"); // NOI18N
        txtRoomCategoryID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomCategoryIDPropertyChange(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoomCategory)
                            .addComponent(lblRoomCategoryID))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoomCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPricePerHead, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPricePerHead, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPricePerHead, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPricePerHead, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 30, 420, 340);

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
        RCM.setName(txtRoomCategory.getText());
        RCM.setPricePerHead(Double.parseDouble(txtPricePerHead.getText()));
        
        if(RC.addRoomCategory(RCM)){
            JOptionPane.showMessageDialog(null,"Successfully inserted","Alert",JOptionPane.INFORMATION_MESSAGE);
        }
        tableLoad();
        Reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableRoomCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoomCategoryMouseClicked
        int selectedRow=tableRoomCategory.getSelectedRow();
        
        id=Integer.parseInt(tableRoomCategory.getValueAt(selectedRow,0).toString());
        txtRoomCategoryID.setText(tableRoomCategory.getValueAt(selectedRow,0).toString());
        txtRoomCategory.setText(tableRoomCategory.getValueAt(selectedRow,1).toString());
        txtPricePerHead.setText(tableRoomCategory.getValueAt(selectedRow,2).toString());
        btnAdd.setVisible(false);
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
        txtRoomCategoryID.setVisible(true);
        lblRoomCategoryID.setVisible(true);
    }//GEN-LAST:event_tableRoomCategoryMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
        //set Updating properties
        RCM.setId(id);
        RCM.setName(txtRoomCategory.getText());
        RCM.setPricePerHead(Double.parseDouble(txtPricePerHead.getText()));
        
        if(x==0)
        {
            if(RC.updateRoomCategory(RCM))
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
            if(RC.deleteRoomCategory(id)){
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

    private void txtPricePerHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePerHeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePerHeadActionPerformed

    private void txtRoomCategoryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomCategoryPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomCategoryPropertyChange

    private void txtRoomCategoryIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomCategoryIDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomCategoryIDPropertyChange

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
            java.util.logging.Logger.getLogger(RoomCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomCategoryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomCategoryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPricePerHead;
    private javax.swing.JLabel lblRoomCategory;
    private javax.swing.JLabel lblRoomCategoryID;
    private javax.swing.JTable tableRoomCategory;
    private javax.swing.JTextField txtPricePerHead;
    private javax.swing.JTextField txtRoomCategory;
    private javax.swing.JTextField txtRoomCategoryID;
    // End of variables declaration//GEN-END:variables
}
