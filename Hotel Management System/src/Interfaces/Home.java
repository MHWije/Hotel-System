/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author mhWiJe
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buttons = new javax.swing.JLayeredPane();
        RestaurantBTN = new javax.swing.JLabel();
        GuestBTN1 = new javax.swing.JLabel();
        InventoryBTN = new javax.swing.JLabel();
        EmployeeBTN = new javax.swing.JLabel();
        GuestBTN = new javax.swing.JLabel();
        ReservationBTN = new javax.swing.JLabel();
        ReservationBTN1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Management System");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(150, 75));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 600));

        Buttons.setBackground(new java.awt.Color(51, 51, 51));

        RestaurantBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RestaurantBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestaurantBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RestaurantIcon.png"))); // NOI18N
        RestaurantBTN.setToolTipText("Rooms and Lodges");
        RestaurantBTN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        RestaurantBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RestaurantBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GuestBTN1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GuestBTN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuestBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SupplierIcon.png"))); // NOI18N
        GuestBTN1.setToolTipText("Rooms and Lodges");
        GuestBTN1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        GuestBTN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GuestBTN1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        InventoryBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        InventoryBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InventoryBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/InventoryIcon.png"))); // NOI18N
        InventoryBTN.setToolTipText("Rooms and Lodges");
        InventoryBTN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        InventoryBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InventoryBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        EmployeeBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmployeeBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EmployeeIcon.png"))); // NOI18N
        EmployeeBTN.setToolTipText("Rooms and Lodges");
        EmployeeBTN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        EmployeeBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EmployeeBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        GuestBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GuestBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GuestBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/GuestIcon.png"))); // NOI18N
        GuestBTN.setToolTipText("Rooms and Lodges");
        GuestBTN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        GuestBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GuestBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ReservationBTN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ReservationBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReservationBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RoomIcon.png"))); // NOI18N
        ReservationBTN.setToolTipText("Rooms and Lodges");
        ReservationBTN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ReservationBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReservationBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ReservationBTN1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ReservationBTN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReservationBTN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ReservationAndPayment.png"))); // NOI18N
        ReservationBTN1.setToolTipText("Rooms and Lodges");
        ReservationBTN1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ReservationBTN1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReservationBTN1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Buttons.setLayer(RestaurantBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Buttons.setLayer(GuestBTN1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Buttons.setLayer(InventoryBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Buttons.setLayer(EmployeeBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Buttons.setLayer(GuestBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Buttons.setLayer(ReservationBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Buttons.setLayer(ReservationBTN1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ButtonsLayout = new javax.swing.GroupLayout(Buttons);
        Buttons.setLayout(ButtonsLayout);
        ButtonsLayout.setHorizontalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonsLayout.createSequentialGroup()
                                .addComponent(EmployeeBTN)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsLayout.createSequentialGroup()
                                .addComponent(ReservationBTN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InventoryBTN)
                            .addGroup(ButtonsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(GuestBTN1)))
                        .addGap(38, 38, 38)
                        .addComponent(ReservationBTN))
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(RestaurantBTN)
                        .addGap(75, 75, 75)
                        .addComponent(GuestBTN)))
                .addContainerGap(447, Short.MAX_VALUE))
        );
        ButtonsLayout.setVerticalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ButtonsLayout.createSequentialGroup()
                            .addComponent(EmployeeBTN)
                            .addGap(34, 34, 34)
                            .addComponent(ReservationBTN1)
                            .addGap(64, 64, 64))
                        .addGroup(ButtonsLayout.createSequentialGroup()
                            .addComponent(InventoryBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuestBTN1)
                            .addGap(18, 18, 18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsLayout.createSequentialGroup()
                        .addComponent(ReservationBTN)
                        .addGap(54, 54, 54)))
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RestaurantBTN)
                    .addComponent(GuestBTN))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buttons)
                .addContainerGap())
        );

        Buttons.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Buttons;
    private javax.swing.JLabel EmployeeBTN;
    private javax.swing.JLabel GuestBTN;
    private javax.swing.JLabel GuestBTN1;
    private javax.swing.JLabel InventoryBTN;
    private javax.swing.JLabel ReservationBTN;
    private javax.swing.JLabel ReservationBTN1;
    private javax.swing.JLabel RestaurantBTN;
    // End of variables declaration//GEN-END:variables
}
