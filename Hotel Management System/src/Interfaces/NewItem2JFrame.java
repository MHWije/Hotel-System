/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
 
import Classes.Item;
import DBOperations.DBAccess;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
 
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HarshaKoshila
 */
public class NewItem2JFrame extends javax.swing.JFrame {

    DBAccess ob=new DBAccess();
    int itemID;
    int catID;
    int supplierID;
    String [] catArr; 
    String [] supplierArr;
    
    
    public NewItem2JFrame() {
        initComponents();
        tableLoad();
        cmbCatLoad();
        cmbSupplierLoad();
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        btnOrder.setVisible(false);
    }

     
    
     public void tableLoad()
    {
        tblItem.setModel(DbUtils.resultSetToTableModel(ob.dataSetItem()));
    }
     
       public void tableLoadFromName()
    {
        tblItem.setModel(DbUtils.resultSetToTableModel(ob.dataSetItemFromName(txtSearch.getText())));
    }
          public void tableLoadFromNameWithDanger()
    {
        tblItem.setModel(DbUtils.resultSetToTableModel(ob.dataSetItemFromNameWithDanger(txtSearch.getText())));
    }
             public void tableLoadDanger()
    {
        tblItem.setModel(DbUtils.resultSetToTableModel(ob.dataSetDangerItem()));
    }
    
    
     public void cmbCatLoad()
    {
            catArr=ob.getOnlyCatName();
            for (int i = 0; i < catArr.length; i++) {
            cmbCat.addItem(catArr[i]);
        }
    }
 
     
       public void cmbSupplierLoad()
    {
            supplierArr=ob.getSupplierName();
            for (int i = 0; i < supplierArr.length; i++) {
            cmbSupplier.addItem(supplierArr[i]);
        }
    }
     
    public boolean isEmpty()
    { 
        boolean status;
        if( (cmbCat.getSelectedIndex()==0) && (cmbSupplier.getSelectedIndex()==0) && (txtName.getText().isEmpty()) && (txtQun.getText().isEmpty())&& (txtPrice.getText().isEmpty())&& (txtTotal.getText().isEmpty())&& (txtReSt.getText().isEmpty()) )
            status=true;
        else
            status=false;
        return status;
    }
       
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbCat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQun = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtReSt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        cmbSupplier = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        txtRemainQun = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        btnOrder = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setName("txtName"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Item Details");

        cmbCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one" }));
        cmbCat.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Category");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantity");

        txtQun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQun.setName("txtName"); // NOI18N
        txtQun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQunActionPerformed(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice.setName("txtName"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total amount");

        txtReSt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReSt.setName("txtName"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Restock level");

        btnSubmit.setBackground(new java.awt.Color(51, 51, 51));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setText("Add");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRest.setBackground(new java.awt.Color(51, 51, 51));
        btnRest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRest.setText("Reset");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
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
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotal.setName("txtName"); // NOI18N
        txtTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalMouseClicked(evt);
            }
        });

        cmbSupplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one " }));
        cmbSupplier.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Supplier name");

        btnSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setName("txtName"); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        txtRemainQun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRemainQun.setName("txtName"); // NOI18N
        txtRemainQun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemainQunActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Remaining quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Item name");

        checkBox.setText("Danger");

        btnOrder.setBackground(new java.awt.Color(51, 51, 51));
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnPDF.setBackground(new java.awt.Color(51, 51, 51));
        btnPDF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPDF.setText("Generate PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 153, 153));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRest, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtRemainQun, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQun, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReSt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkBox)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBox))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSupplier))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQun, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRemainQun, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQunActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
            
         if(!isEmpty())
            { 
                   catID=ob.getCatID(cmbCat.getSelectedItem().toString());
                   supplierID=ob.getSupplierID(cmbSupplier.getSelectedItem().toString());
       
                Item itemOb = new Item();
                itemOb.setName(txtName.getText());
                itemOb.setCatID(catID);
                itemOb.setSupID(supplierID);
                itemOb.setQuantity(Integer.parseInt(txtQun.getText()));
                itemOb.setRemainquant(Integer.parseInt(txtRemainQun.getText()));
                itemOb.setPrice(Integer.parseInt(txtPrice.getText()));
                itemOb.setTotal(Integer.parseInt(txtTotal.getText()));
                itemOb.setReStockLvl(Integer.parseInt(txtReSt.getText()));
                
                if(Integer.parseInt(txtReSt.getText()) >= Integer.parseInt(txtRemainQun.getText()))
                {
                    itemOb.setStatus("Danger");
                }
                else
                    itemOb.setStatus("Normal");

                try {
                    if (ob.addItem(itemOb)) {
                        JOptionPane.showMessageDialog(null, "Successfuly added", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        tableLoad();
                    }
                } catch (Exception e) {
                }
                   
            }
         else
             JOptionPane.showMessageDialog(null,"Please fill all fields ","Alert",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
            
        if(!isEmpty())
            { 
                   catID=ob.getCatID(cmbCat.getSelectedItem().toString());
                   supplierID=ob.getSupplierID(cmbSupplier.getSelectedItem().toString());
       
                Item itemOb = new Item();
                itemOb.setID(itemID);
                itemOb.setName(txtName.getText());
                itemOb.setCatID(catID);
                itemOb.setSupID(supplierID);
                itemOb.setQuantity(Integer.parseInt(txtQun.getText()));
                itemOb.setRemainquant(Integer.parseInt(txtRemainQun.getText()));
                itemOb.setPrice(Integer.parseInt(txtPrice.getText()));
                itemOb.setTotal(Integer.parseInt(txtTotal.getText()));
                itemOb.setReStockLvl(Integer.parseInt(txtReSt.getText()));

                if(Integer.parseInt(txtReSt.getText()) >= Integer.parseInt(txtRemainQun.getText()))
                {
                    itemOb.setStatus("Danger");
                }
                else
                    itemOb.setStatus("Normal");
                
                try {
                    if (ob.updateItem(itemOb)) {
                        JOptionPane.showMessageDialog(null, "Successfuly updated", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        tableLoad();
                        btnUpdate.setVisible(false);
                        btnDelete.setVisible(false);
                        btnSubmit.setVisible(true);
                    }
                } catch (Exception e) {
                }
                   
            }
         else
             JOptionPane.showMessageDialog(null,"Please fill all fields ","Alert",JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
        if(x==0)
        {
            if(ob.deleteItem(itemID))
            {
                JOptionPane.showMessageDialog(null,"Successfuly deleted","Alert",JOptionPane.INFORMATION_MESSAGE);
                tableLoad();
                btnUpdate.setVisible(false);
                btnDelete.setVisible(false);
                btnSubmit.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error ","Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked

        int r=tblItem.getSelectedRow();
        
        itemID=Integer.parseInt(tblItem.getValueAt(r,0).toString());
        txtName.setText(tblItem.getValueAt(r,1).toString());
        cmbCat.setSelectedItem(tblItem.getValueAt(r,2).toString()); 
        cmbSupplier.setSelectedItem(tblItem.getValueAt(r,3).toString());
        txtQun.setText(tblItem.getValueAt(r,4).toString());
        txtRemainQun.setText(tblItem.getValueAt(r,5).toString());
        txtPrice.setText(tblItem.getValueAt(r,6).toString());
        txtTotal.setText(tblItem.getValueAt(r,7).toString());
        txtReSt.setText(tblItem.getValueAt(r,8).toString());
         
        btnUpdate.setVisible(true);
        btnDelete.setVisible(true);
        btnOrder.setVisible(true);
        btnSubmit.setVisible(false); 
        
    }//GEN-LAST:event_tblItemMouseClicked

    private void txtTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalMouseClicked
        
        int qnty=Integer.parseInt(txtQun.getText());
         int price=Integer.parseInt(txtPrice.getText());
         int total=qnty*price;
         
        txtTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_txtTotalMouseClicked

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        
          btnUpdate.setVisible(false);
          btnDelete.setVisible(false);
          btnOrder.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnRestActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          
        if(!txtSearch.getText().isEmpty() && !checkBox.isSelected())
        {
          tableLoadFromName();
        }
        
         if(!txtSearch.getText().isEmpty() && checkBox.isSelected())
        {
          tableLoadFromNameWithDanger();
        }
          if(checkBox.isSelected())
        {
          tableLoadDanger(); 
        }
          if(txtSearch.getText().isEmpty())
        {
          tableLoad();
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtRemainQunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemainQunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemainQunActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
         
        String supEmail=ob.getSupplierEmail(cmbSupplier.getSelectedItem().toString());
        OrderJFrame frame = new OrderJFrame(txtName.getText(),cmbSupplier.getSelectedItem().toString(),txtQun.getText(),supEmail);
        frame.setVisible(true);
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        
     Document document=new Document();
     String date=new Date().toString();
     String filename=date.replaceAll("[:\\//]", "_");
     try{
          PdfWriter.getInstance(document,new FileOutputStream("D:/PDF"+filename+".pdf"));
          document.open();
            PdfPTable tab = new PdfPTable(10);
            tab.addCell("ID");
            tab.addCell("Item name");
            tab.addCell("Category");
            tab.addCell("Supplier name");
            tab.addCell("Quantity");
            tab.addCell("Remain quantity");
            tab.addCell("Price");
            tab.addCell("Total");
            tab.addCell("RestockLevel");
            tab.addCell("Status");
            
            for (int i = 0; i < tblItem.getRowCount(); i++) { 
                String value0 = tblItem.getValueAt(i,0).toString();
                String value1 = tblItem.getValueAt(i,1).toString();
                String value2 = tblItem.getValueAt(i,2).toString();
                String value3 = tblItem.getValueAt(i,3).toString();
                String value4 = tblItem.getValueAt(i,4).toString();
                String value5 = tblItem.getValueAt(i,5).toString();
                String value6 = tblItem.getValueAt(i,6).toString();
                String value7 = tblItem.getValueAt(i,7).toString();
                String value8 = tblItem.getValueAt(i,8).toString();
                String value9 = tblItem.getValueAt(i,9).toString();

                tab.addCell(value0);
                tab.addCell(value1);
                tab.addCell(value2);
                tab.addCell(value3);
                tab.addCell(value4);
                tab.addCell(value5);
                tab.addCell(value6);
                tab.addCell(value7);
                tab.addCell(value8);
                tab.addCell(value9);

            }
            document.add(tab);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        document.close();

    }//GEN-LAST:event_btnPDFActionPerformed

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
            java.util.logging.Logger.getLogger(NewItem2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewItem2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewItem2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewItem2JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewItem2JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JComboBox<String> cmbCat;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQun;
    private javax.swing.JTextField txtReSt;
    private javax.swing.JTextField txtRemainQun;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
