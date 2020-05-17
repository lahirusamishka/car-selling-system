/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Samishka
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        getDate();
        getTime();

        loadHome();
        btnColor();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel5 = new org.jdesktop.swingx.JXPanel();
        btnCustomer = new org.jdesktop.swingx.JXLabel();
        btnOrder = new org.jdesktop.swingx.JXLabel();
        btnVehicle = new org.jdesktop.swingx.JXLabel();
        btnPayment = new org.jdesktop.swingx.JXLabel();
        btnHome = new org.jdesktop.swingx.JXLabel();
        btnSupplierOrder = new org.jdesktop.swingx.JXLabel();
        btnSupplier = new org.jdesktop.swingx.JXLabel();
        btnBatch = new org.jdesktop.swingx.JXLabel();
        btnSupplierPayment2 = new org.jdesktop.swingx.JXLabel();
        btnBatch1 = new org.jdesktop.swingx.JXLabel();
        btnAbout = new org.jdesktop.swingx.JXLabel();
        btnSettings = new org.jdesktop.swingx.JXLabel();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        txtTime = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        txtDateHome1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        MainPanel = new org.jdesktop.swingx.JXPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jXPanel5.setBackground(new java.awt.Color(0, 51, 51));

        btnCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/customer-service (1).png"))); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCustomer.setOpaque(true);
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCustomerMousePressed(evt);
            }
        });

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/menu.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrder.setOpaque(true);
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrderMouseExited(evt);
            }
        });

        btnVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnVehicle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/car.png"))); // NOI18N
        btnVehicle.setText("Vehicles");
        btnVehicle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVehicle.setOpaque(true);
        btnVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVehicleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVehicleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVehicleMouseExited(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(255, 255, 255));
        btnPayment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/cash.png"))); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPayment.setOpaque(true);
        btnPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPaymentMouseExited(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/home.png"))); // NOI18N
        btnHome.setText("  Home");
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setOpaque(true);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        btnSupplierOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplierOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSupplierOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/menu.png"))); // NOI18N
        btnSupplierOrder.setText("Supplier Order");
        btnSupplierOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSupplierOrder.setOpaque(true);
        btnSupplierOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierOrderMouseExited(evt);
            }
        });

        btnSupplier.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/customer-service (1).png"))); // NOI18N
        btnSupplier.setText("Supplier");
        btnSupplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSupplier.setOpaque(true);
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierMouseExited(evt);
            }
        });

        btnBatch.setBackground(new java.awt.Color(255, 255, 255));
        btnBatch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/logout.png"))); // NOI18N
        btnBatch.setText("LogOut");
        btnBatch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBatch.setOpaque(true);
        btnBatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatchMouseExited(evt);
            }
        });

        btnSupplierPayment2.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplierPayment2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSupplierPayment2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/cash.png"))); // NOI18N
        btnSupplierPayment2.setText("Supp_ Payment");
        btnSupplierPayment2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSupplierPayment2.setOpaque(true);
        btnSupplierPayment2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierPayment2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierPayment2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierPayment2MouseExited(evt);
            }
        });

        btnBatch1.setBackground(new java.awt.Color(255, 255, 255));
        btnBatch1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBatch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/file (4).png"))); // NOI18N
        btnBatch1.setText("Batch");
        btnBatch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBatch1.setOpaque(true);
        btnBatch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatch1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatch1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatch1MouseExited(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(51, 153, 255));
        btnAbout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbout.setForeground(new java.awt.Color(204, 204, 204));
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/user.png"))); // NOI18N
        btnAbout.setText("ABOUT");
        btnAbout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAbout.setOpaque(true);
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAboutMouseExited(evt);
            }
        });

        btnSettings.setBackground(new java.awt.Color(51, 153, 255));
        btnSettings.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSettings.setForeground(new java.awt.Color(204, 204, 204));
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/settings.png"))); // NOI18N
        btnSettings.setText("SETTINGS");
        btnSettings.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSettings.setOpaque(true);
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSettingsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jXPanel5Layout = new javax.swing.GroupLayout(jXPanel5);
        jXPanel5.setLayout(jXPanel5Layout);
        jXPanel5Layout.setHorizontalGroup(
            jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addGroup(jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplierOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplierPayment2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatch1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addGroup(jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jXPanel5Layout.createSequentialGroup()
                        .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXPanel5Layout.setVerticalGroup(
            jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSupplierOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSupplierPayment2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBatch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jXPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTime.setForeground(new java.awt.Color(204, 204, 204));
        txtTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 11, 117, 30));

        jXLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 11, 131, 127));

        txtDateHome1.setForeground(new java.awt.Color(204, 204, 204));
        txtDateHome1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(txtDateHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1091, 11, 124, 30));

        jXLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1074, 11, 7, 127));

        jXPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        CustomerAdd order = new CustomerAdd();
        Home.MainPanel.removeAll();
        order.setSize(Home.MainPanel.getSize());
        Home.MainPanel.add(order);
        Home.MainPanel.revalidate();
        Home.MainPanel.repaint();


    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
        CustomerOrder order = new CustomerOrder();
        Home.MainPanel.removeAll();
        order.setSize(Home.MainPanel.getSize());
        Home.MainPanel.add(order);
        Home.MainPanel.revalidate();
        Home.MainPanel.repaint();

    }//GEN-LAST:event_btnOrderMouseClicked

    private void btnCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseEntered
        btnCustomer.setBackground(Color.DARK_GRAY);
        btnCustomer.setForeground(Color.white);
    }//GEN-LAST:event_btnCustomerMouseEntered

    private void btnCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseExited
        btnCustomer.setBackground(Color.LIGHT_GRAY);
        btnCustomer.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnCustomerMouseExited

    private void btnCustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMousePressed

    }//GEN-LAST:event_btnCustomerMousePressed

    private void btnOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseEntered
        btnOrder.setBackground(Color.DARK_GRAY);
        btnOrder.setForeground(Color.white);
    }//GEN-LAST:event_btnOrderMouseEntered

    private void btnPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentMouseEntered
        btnPayment.setBackground(Color.DARK_GRAY);
        btnPayment.setForeground(Color.white);
    }//GEN-LAST:event_btnPaymentMouseEntered

    private void btnVehicleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehicleMouseEntered
        btnVehicle.setBackground(Color.DARK_GRAY);
        btnVehicle.setForeground(Color.white);
    }//GEN-LAST:event_btnVehicleMouseEntered

    private void btnSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseEntered
        btnSupplier.setBackground(Color.DARK_GRAY);
        btnSupplier.setForeground(Color.white);
    }//GEN-LAST:event_btnSupplierMouseEntered

    private void btnSupplierOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierOrderMouseEntered
        btnSupplierOrder.setBackground(Color.DARK_GRAY);
        btnSupplierOrder.setForeground(Color.white);
    }//GEN-LAST:event_btnSupplierOrderMouseEntered

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setBackground(Color.DARK_GRAY);
        btnHome.setForeground(Color.white);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehicleMouseClicked
        VehicleStore order = new VehicleStore();
        MainPanel.removeAll();
        order.setSize(MainPanel.getSize());
        MainPanel.add(order);
        MainPanel.revalidate();
        MainPanel.repaint();
    }//GEN-LAST:event_btnVehicleMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        SupplierAdd order = new SupplierAdd();
        MainPanel.removeAll();
        order.setSize(MainPanel.getSize());
        MainPanel.add(order);
        MainPanel.revalidate();
        MainPanel.repaint();
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnBatchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatchMouseEntered
        btnBatch.setBackground(Color.DARK_GRAY);
        btnBatch.setForeground(Color.white);
    }//GEN-LAST:event_btnBatchMouseEntered

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        HomePanel order = new HomePanel();
        MainPanel.removeAll();
        order.setSize(MainPanel.getSize());
        MainPanel.add(order);
        MainPanel.revalidate();
        MainPanel.repaint();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseEntered
        btnSettings.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSettingsMouseEntered

    private void btnSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseExited
        btnSettings.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSettingsMouseExited

    private void btnAboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseEntered
        btnAbout.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnAboutMouseEntered

    private void btnAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseExited
        btnAbout.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnAboutMouseExited

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        About frmAboutUs = new About(this, true);
        frmAboutUs.setVisible(true);
    }//GEN-LAST:event_btnAboutMouseClicked

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        btnHome.setBackground(Color.LIGHT_GRAY);
        btnHome.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentMouseClicked
        CustomerPayment lord = new CustomerPayment();
        MainPanel.removeAll();
        lord.setSize(MainPanel.getSize());
        MainPanel.add(lord);
        MainPanel.revalidate();
        MainPanel.repaint();
    }//GEN-LAST:event_btnPaymentMouseClicked

    private void btnOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseExited
        btnOrder.setBackground(Color.LIGHT_GRAY);
        btnOrder.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnOrderMouseExited

    private void btnPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentMouseExited
        btnPayment.setBackground(Color.LIGHT_GRAY);
        btnPayment.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnPaymentMouseExited

    private void btnVehicleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehicleMouseExited
        btnVehicle.setBackground(Color.LIGHT_GRAY);
        btnVehicle.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnVehicleMouseExited

    private void btnSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseExited
        btnSupplier.setBackground(Color.LIGHT_GRAY);
        btnSupplier.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSupplierMouseExited

    private void btnSupplierOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierOrderMouseExited
        btnSupplierOrder.setBackground(Color.LIGHT_GRAY);
        btnSupplierOrder.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSupplierOrderMouseExited

    private void btnBatchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatchMouseExited
        btnBatch.setBackground(Color.LIGHT_GRAY);
        btnBatch.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnBatchMouseExited

    private void btnSupplierPayment2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierPayment2MouseEntered
        btnSupplierPayment2.setBackground(Color.DARK_GRAY);
        btnSupplierPayment2.setForeground(Color.white);
    }//GEN-LAST:event_btnSupplierPayment2MouseEntered

    private void btnSupplierPayment2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierPayment2MouseExited
        btnSupplierPayment2.setBackground(Color.LIGHT_GRAY);
        btnSupplierPayment2.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSupplierPayment2MouseExited

    private void btnBatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatchMouseClicked

        WorningMsg frmAboutUs = new WorningMsg(this, true);
        frmAboutUs.setting(this);
        frmAboutUs.setVisible(true);

    }//GEN-LAST:event_btnBatchMouseClicked

    private void btnSupplierOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierOrderMouseClicked
        SupplierOrder order = new SupplierOrder();
        Home.MainPanel.removeAll();
        order.setSize(Home.MainPanel.getSize());
        Home.MainPanel.add(order);
        Home.MainPanel.revalidate();
        Home.MainPanel.repaint();
    }//GEN-LAST:event_btnSupplierOrderMouseClicked

    private void btnSupplierPayment2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierPayment2MouseClicked
        SupplierPayment order = new SupplierPayment();
        Home.MainPanel.removeAll();
        order.setSize(Home.MainPanel.getSize());
        Home.MainPanel.add(order);
        Home.MainPanel.revalidate();
        Home.MainPanel.repaint();
    }//GEN-LAST:event_btnSupplierPayment2MouseClicked

    private void btnBatch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatch1MouseClicked
        Batch order = new Batch();
        Home.MainPanel.removeAll();
        order.setSize(Home.MainPanel.getSize());
        Home.MainPanel.add(order);
        Home.MainPanel.revalidate();
        Home.MainPanel.repaint();
    }//GEN-LAST:event_btnBatch1MouseClicked

    private void btnBatch1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatch1MouseEntered
        btnBatch1.setBackground(Color.DARK_GRAY);
        btnBatch1.setForeground(Color.white);
    }//GEN-LAST:event_btnBatch1MouseEntered

    private void btnBatch1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatch1MouseExited
        btnBatch1.setBackground(Color.LIGHT_GRAY);
        btnBatch1.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnBatch1MouseExited

    private void btnSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseClicked
//        SettingWindows pasWrd=new SettingWindows();
//        pasWrd.setVisible(true);
    }//GEN-LAST:event_btnSettingsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static org.jdesktop.swingx.JXPanel MainPanel;
    private org.jdesktop.swingx.JXLabel btnAbout;
    private org.jdesktop.swingx.JXLabel btnBatch;
    private org.jdesktop.swingx.JXLabel btnBatch1;
    private org.jdesktop.swingx.JXLabel btnCustomer;
    private org.jdesktop.swingx.JXLabel btnHome;
    private org.jdesktop.swingx.JXLabel btnOrder;
    private org.jdesktop.swingx.JXLabel btnPayment;
    private org.jdesktop.swingx.JXLabel btnSettings;
    private org.jdesktop.swingx.JXLabel btnSupplier;
    private org.jdesktop.swingx.JXLabel btnSupplierOrder;
    private org.jdesktop.swingx.JXLabel btnSupplierPayment2;
    private org.jdesktop.swingx.JXLabel btnVehicle;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel5;
    private org.jdesktop.swingx.JXLabel txtDateHome1;
    private org.jdesktop.swingx.JXLabel txtTime;
    // End of variables declaration//GEN-END:variables

    public static JPanel getMainPanel() {
        return MainPanel;
    }

    private void getTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
                txtTime.setText(time.format(d));
            }
        }).start();

    }

    private void getDate() {

        Date d1 = new Date(); //request current data
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String fDate = df.format(d1);
        txtDateHome1.setText(fDate);
    }

    private void loadHome() {
        HomePanel order = new HomePanel();
        MainPanel.removeAll();
        order.setSize(MainPanel.getSize());
        MainPanel.add(order);
        MainPanel.revalidate();
        MainPanel.repaint();
    }

    private void btnColor() {
        btnHome.setBackground(Color.LIGHT_GRAY);
        btnOrder.setBackground(Color.LIGHT_GRAY);
        btnVehicle.setBackground(Color.LIGHT_GRAY);
        btnAbout.setBackground(Color.LIGHT_GRAY);
        btnSettings.setBackground(Color.LIGHT_GRAY);
        btnBatch.setBackground(Color.LIGHT_GRAY);
        btnPayment.setBackground(Color.LIGHT_GRAY);
       
        btnSupplier.setBackground(Color.LIGHT_GRAY);
        btnSupplierOrder.setBackground(Color.LIGHT_GRAY);
        btnCustomer.setBackground(Color.LIGHT_GRAY);
        btnSupplierPayment2.setBackground(Color.LIGHT_GRAY);
        btnBatch1.setBackground(Color.LIGHT_GRAY);
        btnAbout.setForeground(Color.BLACK);
        btnSettings.setForeground(Color.BLACK);
                
        
    }

}