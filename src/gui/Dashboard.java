/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import uangkyu.Activity;
import uangkyu.ActivityList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author Alfian Andi Nugraha
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.activityTable.getTableHeader().setOpaque(false);
        this.activityTable.getTableHeader().setBackground(new Color(21,132,103));
        this.activityTable.getTableHeader().setForeground(Color.white);
        
        this.incomeRadioButton.setSelected(true);
        this.incomeRadioButton.setActionCommand("1");
        this.outcomeRadioButton.setActionCommand("0");
        this.buttonGroup1.add(incomeRadioButton);
        this.buttonGroup1.add(outcomeRadioButton);
    }

    public void resetForm() {
        this.inputName.setText("");
        this.inputNominal.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inputNominal = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        addActivityButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        incomeRadioButton = new javax.swing.JRadioButton();
        outcomeRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        outcomeNominal = new javax.swing.JLabel();
        incomeNominal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(21, 132, 103));

        inputNominal.setBackground(new java.awt.Color(255, 255, 255));
        inputNominal.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputName.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        addActivityButton.setBackground(new java.awt.Color(255, 255, 255));
        addActivityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addActivityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addActivityButtonMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(21, 132, 103));
        jLabel1.setText("Tambah Aktifitas");

        javax.swing.GroupLayout addActivityButtonLayout = new javax.swing.GroupLayout(addActivityButton);
        addActivityButton.setLayout(addActivityButtonLayout);
        addActivityButtonLayout.setHorizontalGroup(
            addActivityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
            .addGroup(addActivityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addActivityButtonLayout.createSequentialGroup()
                    .addGap(0, 48, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 49, Short.MAX_VALUE)))
        );
        addActivityButtonLayout.setVerticalGroup(
            addActivityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(addActivityButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addActivityButtonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        incomeRadioButton.setBackground(new java.awt.Color(21, 132, 103));
        incomeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        incomeRadioButton.setText("Pemasukan");
        incomeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeRadioButtonActionPerformed(evt);
            }
        });

        outcomeRadioButton.setBackground(new java.awt.Color(21, 132, 103));
        outcomeRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        outcomeRadioButton.setSelected(true);
        outcomeRadioButton.setText("Pengeluran");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Aktifitas");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nominal");

        jLabel3.setBackground(new java.awt.Color(21, 63, 65));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("uangKyu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addActivityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(inputNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(outcomeRadioButton)
                                .addComponent(incomeRadioButton)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(inputNominal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(incomeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outcomeRadioButton)
                .addGap(58, 58, 58)
                .addComponent(addActivityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        activityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Aktifitas", "Type", "Nominal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activityTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        activityTable.setOpaque(false);
        activityTable.setRowHeight(32);
        activityTable.setSelectionBackground(new java.awt.Color(21, 132, 103));
        activityTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        activityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activityTableMouseClicked(evt);
            }
        });
        activityTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                activityTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(activityTable);
        if (activityTable.getColumnModel().getColumnCount() > 0) {
            activityTable.getColumnModel().getColumn(0).setResizable(false);
            activityTable.getColumnModel().getColumn(1).setResizable(false);
            activityTable.getColumnModel().getColumn(2).setResizable(false);
            activityTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(21, 63, 65));
        jLabel2.setForeground(new java.awt.Color(21, 132, 103));
        jLabel2.setText("Rp");

        jLabel4.setForeground(new java.awt.Color(240, 84, 84));
        jLabel4.setText("Rp");

        outcomeNominal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        outcomeNominal.setForeground(new java.awt.Color(240, 84, 84));
        outcomeNominal.setText("0");

        incomeNominal.setBackground(new java.awt.Color(21, 63, 65));
        incomeNominal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        incomeNominal.setForeground(new java.awt.Color(21, 132, 103));
        incomeNominal.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incomeNominal)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outcomeNominal)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(outcomeNominal)
                        .addComponent(incomeNominal))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activityTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_activityTablePropertyChange
        // TODO add your handling code here:
        System.out.println("Hello");
    }//GEN-LAST:event_activityTablePropertyChange

    private void incomeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeRadioButtonActionPerformed

    private void addActivityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addActivityButtonMouseClicked
        try {
            String name = this.inputName.getText();
            int nominal = Integer.parseInt(this.inputNominal.getText());
            int type = Integer.parseInt(this.buttonGroup1.getSelection().getActionCommand());

            Activity activity = new Activity();
            activity
                .setNominal(nominal)
                .setDescription(name)
                .setType(type);
        
            this.activityList.insert(activity);
            
            String typeText = Activity.convertTypeToText(type);
            
            Object data[] = {0, name, typeText, nominal};
            DefaultTableModel tableModel = (DefaultTableModel) this.activityTable.getModel();
            tableModel.addRow(data);
            
            this.resetForm();
            
            this.incomeNominal.setText(String.valueOf(activityList.getTotalNominal()[1]));
            this.outcomeNominal.setText(String.valueOf(activityList.getTotalNominal()[0]));
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Silahkan isi form dengan benar");
        }
        
    }//GEN-LAST:event_addActivityButtonMouseClicked

    private void activityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityTableMouseClicked
        int selectedRow = this.activityTable.getSelectedRow();
        Modal modal = new Modal(selectedRow, this);
        modal.setVisible(true);
    }//GEN-LAST:event_activityTableMouseClicked

    public void deleteRow(int index) {
        DefaultTableModel tableModel = (DefaultTableModel) this.activityTable.getModel();
        tableModel.removeRow(index);
    }
    
    public void updateRow(int index, Object data[]) {
        DefaultTableModel tableModel = (DefaultTableModel) this.activityTable.getModel();
        tableModel.removeRow(index);
        tableModel.insertRow(index, data);
    }
    
    public void refreshNominal() {
        this.incomeNominal.setText(String.valueOf(activityList.getTotalNominal()[1]));
        this.outcomeNominal.setText(String.valueOf(activityList.getTotalNominal()[0]));
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Metal".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Dashboard().setVisible(true);
//            }
//        });
//    }
    
    public ActivityList activityList = new ActivityList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable activityTable;
    private javax.swing.JPanel addActivityButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel incomeNominal;
    private javax.swing.JRadioButton incomeRadioButton;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputNominal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outcomeNominal;
    private javax.swing.JRadioButton outcomeRadioButton;
    // End of variables declaration//GEN-END:variables
}
