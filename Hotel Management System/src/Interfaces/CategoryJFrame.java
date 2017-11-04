/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.ItemCategory;
import DBOperations.DBAccess;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HarshaKoshila
 */
public class CategoryJFrame extends javax.swing.JFrame {

    DBAccess ob= new DBAccess();
    int id;
    
    public CategoryJFrame() {
        initComponents();
        tableLoad();
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
    }
 
    public void tableLoad()
    {
        tblCat.setModel(DbUtils.resultSetToTableModel(ob.dataSetCategory()));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCat = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLocat = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add new category");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 250, 30);

        tblCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCat.setName(""); // NOI18N
        tblCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCat);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 90, 400, 240);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setName("txtName"); // NOI18N
        jPanel1.add(txtName);
        txtName.setBounds(120, 80, 180, 30);

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(80, 220, 100, 30);

        btnRest.setBackground(new java.awt.Color(51, 51, 51));
        btnRest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRest.setText("Reset");
        jPanel1.add(btnRest);
        btnRest.setBounds(80, 170, 100, 30);

        btnSubmit.setBackground(new java.awt.Color(51, 51, 51));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setText("Add");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(190, 170, 100, 30);

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(190, 220, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Store Location");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 120, 90, 30);

        txtLocat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLocat.setName("txtName"); // NOI18N
        jPanel1.add(txtLocat);
        txtLocat.setBounds(120, 120, 180, 30);

        btnHome.setBackground(new java.awt.Color(0, 153, 153));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome);
        btnHome.setBounds(690, 10, 85, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    
        ItemCategory itemOb=new ItemCategory();
        itemOb.setName(txtName.getText());
        itemOb.setLocation(txtLocat.getText());
        try {
            if ( ob.addCategory(itemOb) ) {
                     JOptionPane.showMessageDialog(null,"Successfuly added","Alert", JOptionPane.INFORMATION_MESSAGE);
                     tableLoad();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tblCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatMouseClicked
        int r=tblCat.getSelectedRow();
        
        id=Integer.parseInt(tblCat.getValueAt(r,0).toString());
        txtName.setText(tblCat.getValueAt(r,1).toString());
        txtLocat.setText(tblCat.getValueAt(r,2).toString());
    }//GEN-LAST:event_tblCatMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        ItemCategory itemOb=new ItemCategory();
        itemOb.setCatID(id);
        itemOb.setName(txtName.getText());
        itemOb.setLocation(txtLocat.getText());
        if(x==0)
        {
            if(ob.updateCategory(itemOb))
            {
                JOptionPane.showMessageDialog(null,"Successfuly updated","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete?"); 
        if(x==0)
        {
            if(ob.deleteCategory(id))
            {
                JOptionPane.showMessageDialog(null,"Successfuly deleted","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        InventoryJFrame newFrame = new InventoryJFrame();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCat;
    private javax.swing.JTextField txtLocat;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
