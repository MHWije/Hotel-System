/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.RoomModel;
import DBOperations.Room;
import DBOperations.Room_Category;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author mhWiJe
 */
public class RoomUI extends javax.swing.JFrame {

    RoomModel RM = new RoomModel();
    Room R = new Room();
    Room_Category RC = new Room_Category();
    ResultSet Room_CategoryNameList;

    int id; //id to store the selected record ID
    
    public RoomUI() {
        initComponents();
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        txtRoomID.setVisible(false);
        lblRoomID.setVisible(false);
        tableLoad();
        setListRoomCategory();
        setListRoomNoOfBeds();
        Reset();
    }
 
    //function to load the table
    public void tableLoad()
    {
        tableRoom.setModel(DbUtils.resultSetToTableModel(R.RoomRecords()));
    }
    
    //function to clear the text fields
    public void Reset(){
        txtRoomName.setText("");
        ListRoomCategory.setSelectedIndex(0);
        ListRoomNoOfBeds.setSelectedIndex(0);
        txtRoomID.setText("");
        txtRoomPrice.setText("");
        id=0;
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        btnAdd.setVisible(true);
        txtRoomID.setVisible(false);
        lblRoomID.setVisible(false);
        ListRoomNoOfBeds.setEnabled(false);
    }
    
    //set Category List
    public void setListRoomCategory(){
        Room_CategoryNameList = RC.Room_CategoryNameList();
        try {
            while(Room_CategoryNameList.next()){
                ListRoomCategory.addItem(Room_CategoryNameList.getString("name"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    public void setListRoomNoOfBeds(){
        String[] arr = {"1","2","3","4"};
        for(String element : arr){
            ListRoomNoOfBeds.addItem(element);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoom = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblRoomName = new javax.swing.JLabel();
        txtRoomName = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        lblRoomCategory = new javax.swing.JLabel();
        lblRoomID = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblRoomNoOfBeds = new javax.swing.JLabel();
        lblRoomPrice = new javax.swing.JLabel();
        txtRoomPrice = new javax.swing.JTextField();
        ListRoomCategory = new javax.swing.JComboBox<>();
        ListRoomNoOfBeds = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 600));

        jPanel1.setLayout(null);

        tableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Room ID", "Number", "Category", "No Of Beds", "Price", "isAvailable", "isActive"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRoom.setName(""); // NOI18N
        tableRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRoom);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 30, 540, 340);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblRoomName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomName.setText("Room number     :");

        txtRoomName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomName.setName("txtRoomName"); // NOI18N
        txtRoomName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNameActionPerformed(evt);
            }
        });
        txtRoomName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomNamePropertyChange(evt);
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

        lblRoomCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomCategory.setText("Category             :");

        lblRoomID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomID.setText("Room ID             :");

        txtRoomID.setEditable(false);
        txtRoomID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomID.setName("txtRoomCategory"); // NOI18N
        txtRoomID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtRoomIDPropertyChange(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

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

        lblRoomNoOfBeds.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomNoOfBeds.setText("Number of beds  :");

        lblRoomPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRoomPrice.setText("Price                   :");

        txtRoomPrice.setEditable(false);
        txtRoomPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomPrice.setName("txtName"); // NOI18N
        txtRoomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomPriceActionPerformed(evt);
            }
        });

        ListRoomCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        ListRoomCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListRoomCategoryItemStateChanged(evt);
            }
        });
        ListRoomCategory.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ListRoomCategoryPropertyChange(evt);
            }
        });

        ListRoomNoOfBeds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        ListRoomNoOfBeds.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListRoomNoOfBedsItemStateChanged(evt);
            }
        });
        ListRoomNoOfBeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListRoomNoOfBedsActionPerformed(evt);
            }
        });
        ListRoomNoOfBeds.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ListRoomNoOfBedsPropertyChange(evt);
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
                        .addComponent(lblRoomNoOfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ListRoomNoOfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRoomName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoomPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtRoomPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ListRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListRoomCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomNoOfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListRoomNoOfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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
        
        //get selected values from combobox
        int Category_id = RC.RetrieveCategoryID(ListRoomCategory.getSelectedItem().toString());
        
        
        RM.setName(txtRoomName.getText());
        RM.setCategory(Category_id);
        RM.setNoOfBeds(Integer.parseInt(ListRoomNoOfBeds.getSelectedItem().toString()));
        RM.setPrice(Double.parseDouble(txtRoomPrice.getText()));
        
        if(R.addRoom(RM)){
            JOptionPane.showMessageDialog(null,"Successfully inserted","Alert",JOptionPane.INFORMATION_MESSAGE);
        }
        tableLoad();
        Reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoomMouseClicked
        int selectedRow=tableRoom.getSelectedRow();
        
        id=Integer.parseInt(tableRoom.getValueAt(selectedRow,0).toString());
        txtRoomID.setText(tableRoom.getValueAt(selectedRow,0).toString());
        txtRoomName.setText(tableRoom.getValueAt(selectedRow,1).toString());
        ListRoomCategory.setSelectedItem(RC.Room_CategoryName(Integer.parseInt(tableRoom.getValueAt(selectedRow,2).toString())));
        ListRoomNoOfBeds.setSelectedItem(tableRoom.getValueAt(selectedRow,4).toString());
        txtRoomPrice.setText(tableRoom.getValueAt(selectedRow,3).toString());
        btnAdd.setVisible(false);
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
        txtRoomID.setVisible(true);
        lblRoomID.setVisible(true);
    }//GEN-LAST:event_tableRoomMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
        //set Updating properties
        //get selected values from combobox
        int Category_id = RC.RetrieveCategoryID(ListRoomCategory.getSelectedItem().toString());
        
        RM.setId(id);
        RM.setName(txtRoomName.getText());
        RM.setCategory(Category_id);
        RM.setNoOfBeds(Integer.parseInt(ListRoomNoOfBeds.getSelectedItem().toString()));
        RM.setPrice(Double.parseDouble(txtRoomPrice.getText()));
        
        if(x==0)
        {
            if(R.updateRoom(RM))
            {
                JOptionPane.showMessageDialog(null,"Successfuliy updated","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
                Reset();
                setListRoomCategory();
                setListRoomNoOfBeds();
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
            if(R.deleteRoom(id)){
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

    private void txtRoomNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNamePropertyChange

    private void txtRoomIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtRoomIDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomIDPropertyChange

    private void txtRoomNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNameActionPerformed

    private void txtRoomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomPriceActionPerformed

    private void ListRoomNoOfBedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListRoomNoOfBedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListRoomNoOfBedsActionPerformed

    private void ListRoomNoOfBedsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ListRoomNoOfBedsPropertyChange
        
    }//GEN-LAST:event_ListRoomNoOfBedsPropertyChange

    private void ListRoomCategoryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ListRoomCategoryPropertyChange
        
    }//GEN-LAST:event_ListRoomCategoryPropertyChange

    private void ListRoomNoOfBedsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListRoomNoOfBedsItemStateChanged
        if(ListRoomNoOfBeds.getSelectedIndex()!=0){
            double pricePerHead = RC.RetrieveCategoryPricePerHead(RC.RetrieveCategoryID(ListRoomCategory.getSelectedItem().toString()));
            String price = Double.toString(pricePerHead*Double.parseDouble(ListRoomNoOfBeds.getSelectedItem().toString()));
            txtRoomPrice.setText(price);
        }
    }//GEN-LAST:event_ListRoomNoOfBedsItemStateChanged

    private void ListRoomCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListRoomCategoryItemStateChanged
        if(ListRoomCategory.getSelectedIndex()!=0){
            ListRoomNoOfBeds.setEnabled(true);
        }
    }//GEN-LAST:event_ListRoomCategoryItemStateChanged

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
            java.util.logging.Logger.getLogger(RoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new RoomUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListRoomCategory;
    private javax.swing.JComboBox<String> ListRoomNoOfBeds;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRoomCategory;
    private javax.swing.JLabel lblRoomID;
    private javax.swing.JLabel lblRoomName;
    private javax.swing.JLabel lblRoomNoOfBeds;
    private javax.swing.JLabel lblRoomPrice;
    private javax.swing.JTable tableRoom;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtRoomName;
    private javax.swing.JTextField txtRoomPrice;
    // End of variables declaration//GEN-END:variables
}
