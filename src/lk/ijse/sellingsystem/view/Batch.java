/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sellingsystem.view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.sellingsystem.controller.BatchController;
import lk.ijse.sellingsystem.controller.CustomerAddController;
import lk.ijse.sellingsystem.controller.CustomerOrderController;
import lk.ijse.sellingsystem.core.dto.BatchDTO;
import lk.ijse.sellingsystem.core.dto.CustomerDTO;
import lk.ijse.sellingsystem.core.dto.CustomerOrderDTO;
import lk.ijse.sellingsystem.idgenerator.IDGenerator;

/**
 *
 * @author Samishka
 */
public class Batch extends javax.swing.JPanel {

    /**
     * Creates new form Batch
     */
    public Batch() {
        initComponents();
        loadComBox();
        loadBatchId();
        loadTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBatchView = new org.jdesktop.swingx.JXTable();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        btnNew = new org.jdesktop.swingx.JXLabel();
        btnDelete = new org.jdesktop.swingx.JXLabel();
        btnSave = new org.jdesktop.swingx.JXLabel();
        txtBatchId = new org.jdesktop.swingx.JXTextField();
        jXLabel19 = new org.jdesktop.swingx.JXLabel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        cmbVehicleType = new org.jdesktop.swingx.JXComboBox();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        txtVehicleBrand = new org.jdesktop.swingx.JXTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomerView = new org.jdesktop.swingx.JXTable();
        CmbFueTypel = new org.jdesktop.swingx.JXComboBox();
        cmbCustOrderId = new org.jdesktop.swingx.JXComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jXLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jXLabel2.setText("BATCH ");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel2);

        jXLabel1.setBackground(new java.awt.Color(235, 235, 235));
        jXPanel1.add(jXLabel1);

        add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 30));

        tblBatchView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch ID", "Manufacture ", "Fuel Type", "VehicleType", "Vehicle Brand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBatchView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBatchViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBatchView);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 740, 370));

        jXPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jXPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew.setBackground(new java.awt.Color(153, 153, 153));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/add (4).png"))); // NOI18N
        btnNew.setText("NEW");
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setOpaque(true);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
        });
        jXPanel2.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/delete4.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        jXPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 90, 40));

        btnSave.setBackground(new java.awt.Color(153, 153, 153));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/sellingsystem/view/icon/sav4.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        jXPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 90, 40));

        add(jXPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 290, 40));

        txtBatchId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBatchId.setForeground(new java.awt.Color(102, 102, 102));
        txtBatchId.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtBatchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchIdActionPerformed(evt);
            }
        });
        add(txtBatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 30));

        jXLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel19.setText("Batch ID");
        jXLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 50, 30));

        jXLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel8.setText("Vehicle Brand");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 80, 30));

        jXLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel14.setText("Vehicle Type");
        jXLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 80, 30));
        add(cmbVehicleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 110, 30));

        jXLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel12.setText("Fuel Type");
        jXLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 60, 30));
        add(txtVehicleBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 90, 30));

        jXLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jXLabel9.setText("Customer order ID");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        tblCustomerView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerId", "name"
            }
        ));
        tblCustomerView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCustomerView);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 370));
        add(CmbFueTypel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 120, 30));
        add(cmbCustOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tblBatchViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBatchViewMouseClicked

    }//GEN-LAST:event_tblBatchViewMouseClicked

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked

    }//GEN-LAST:event_btnNewMouseClicked

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/add 4_1.png"));
        btnNew.setIcon(icon);
    }//GEN-LAST:event_btnNewMouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
        btnNew.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/add (4).png"));
        btnNew.setIcon(icon);
    }//GEN-LAST:event_btnNewMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/delete5.png"));
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/delete4.png"));
        btnDelete.setIcon(icon);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
            BatchDTO batch;
            batch=new BatchDTO(
                    cmbCustOrderId.getSelectedItem().toString(),
                    txtBatchId.getText(),
                    CmbFueTypel.getSelectedItem().toString(),
                    cmbVehicleType.getSelectedItem().toString(),
                    txtVehicleBrand.getText()
                    
            );
            boolean result = BatchController.addBatch(batch);
            if (result) {
            JOption mass = new JOption();
            mass.setVisible(true);
            
            } else {
            JOptionPane.showMessageDialog(this, "Customer hasn't been added due to some error");
            }
      
        } catch (Exception ex) {
            Logger.getLogger(Batch.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadBatchId();
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/sav3.png"));
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setForeground(Color.BLACK);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/lk/ijse/sellingsystem/view/icon/sav4.png"));
        btnSave.setIcon(icon);
    }//GEN-LAST:event_btnSaveMouseExited

    private void txtBatchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchIdActionPerformed

    private void tblCustomerViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerViewMouseClicked
        try {
            String itemId = (String) tblCustomerView.getValueAt(tblCustomerView.getSelectedRow(), 0);
            CustomerOrderDTO customerDTO = new CustomerOrderDTO();
            customerDTO.setId(itemId);
            CustomerOrderDTO searchCustomer = CustomerOrderController.searchCustomer(customerDTO);
           
            cmbCustOrderId.setSelectedItem(searchCustomer.getId());
          

        } catch (Exception ex) {
            Logger.getLogger(CustomerAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblCustomerViewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXComboBox CmbFueTypel;
    private org.jdesktop.swingx.JXLabel btnDelete;
    private org.jdesktop.swingx.JXLabel btnNew;
    private org.jdesktop.swingx.JXLabel btnSave;
    private org.jdesktop.swingx.JXComboBox cmbCustOrderId;
    private org.jdesktop.swingx.JXComboBox cmbVehicleType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel19;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXTable tblBatchView;
    private org.jdesktop.swingx.JXTable tblCustomerView;
    private org.jdesktop.swingx.JXTextField txtBatchId;
    private org.jdesktop.swingx.JXTextField txtVehicleBrand;
    // End of variables declaration//GEN-END:variables

    private void loadComBox() {
        try {
            cmbVehicleType.addItem("economy car");
            cmbVehicleType.addItem("Family car");
            cmbVehicleType.addItem("Luxury vehicle");
            cmbVehicleType.addItem("Sports cars");
            cmbVehicleType.addItem("Off roaders");
            cmbVehicleType.addItem("Commercial vehicle");
            CmbFueTypel.addItem("Premium unleaded petrol");
            CmbFueTypel.addItem("Super unleaded petrol");
            CmbFueTypel.addItem("Diesel");
            CmbFueTypel.addItem("LPG Autogas");

            ArrayList<CustomerOrderDTO> batch = CustomerOrderController.getAllCustomers();

            cmbCustOrderId.removeAllItems();
            if (batch == null) {
                return;
            }

            for (CustomerOrderDTO allVehicle : batch) {
                cmbCustOrderId.addItem(allVehicle.getId());
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadBatchId() {
        try {
            String orderId;
            orderId = IDGenerator.getNewID("batch", "id", "B");
            txtBatchId.setText(orderId);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTables() {
        try {
            ArrayList<CustomerOrderDTO> allCustomers = CustomerOrderController.getAllCustomers();

            DefaultTableModel dtm = (DefaultTableModel) tblCustomerView.getModel();

            dtm.setRowCount(0);

            if (allCustomers != null) {

                for (CustomerOrderDTO orders : allCustomers) {

                    Object[] rowData = {
                        orders.getId(),
                        orders.getOrderDate(),};

                    dtm.addRow(rowData);

                }

            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
