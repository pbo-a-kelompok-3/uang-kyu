/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import Models.Activity;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import Utils.Time;

/**
 *
 * @author Alfian Andi Nugraha
 */
public class Modal extends javax.swing.JFrame {

    /**
     * Creates new form Modal
     */
    public Modal(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
    }
    
    public void run() {
        this.setVisible(true);
        try {
            Date date = new SimpleDateFormat(Time.DateFormat).parse(this.updatedAt);
            this.inputDate.setDate(date);
        }catch(Exception err) {
            System.out.println(err.getMessage());
        }
        this.idHeader.setText("#" + String.valueOf(this.id));
        this.inputDescription.setText(this.description);
        this.inputNominal.setText(String.valueOf(this.nominal));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputDescription = new javax.swing.JTextField();
        inputNominal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        buttonToSetIncome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonToSetExpense = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        idHeader.setBackground(new java.awt.Color(43, 43, 43));
        idHeader.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        idHeader.setForeground(new java.awt.Color(43, 43, 43));
        idHeader.setText("#128");

        jLabel1.setBackground(new java.awt.Color(43, 43, 43));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 43, 43));
        jLabel1.setText("Aktifitas");

        inputDescription.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputDescription.setMargin(new java.awt.Insets(0, 10, 0, 10));
        inputDescription.setPreferredSize(new java.awt.Dimension(265, 45));
        inputDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDescriptionActionPerformed(evt);
            }
        });

        inputNominal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        inputNominal.setMargin(new java.awt.Insets(0, 10, 0, 10));
        inputNominal.setPreferredSize(new java.awt.Dimension(265, 45));
        inputNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNominalActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(43, 43, 43));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 43, 43));
        jLabel2.setText("Nominal");

        inputDate.setPreferredSize(new java.awt.Dimension(265, 45));

        jLabel3.setBackground(new java.awt.Color(43, 43, 43));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 43, 43));
        jLabel3.setText("Tanggal");

        buttonToSetIncome.setBackground(new java.awt.Color(82, 128, 120));
        buttonToSetIncome.setForeground(new java.awt.Color(255, 255, 255));
        buttonToSetIncome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonToSetIncome.setPreferredSize(new java.awt.Dimension(265, 45));
        buttonToSetIncome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonToSetIncomeMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pemasukan");

        javax.swing.GroupLayout buttonToSetIncomeLayout = new javax.swing.GroupLayout(buttonToSetIncome);
        buttonToSetIncome.setLayout(buttonToSetIncomeLayout);
        buttonToSetIncomeLayout.setHorizontalGroup(
            buttonToSetIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
            .addGroup(buttonToSetIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonToSetIncomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        buttonToSetIncomeLayout.setVerticalGroup(
            buttonToSetIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(buttonToSetIncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonToSetIncomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        buttonToSetExpense.setBackground(new java.awt.Color(240, 84, 84));
        buttonToSetExpense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonToSetExpense.setPreferredSize(new java.awt.Dimension(265, 45));
        buttonToSetExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonToSetExpenseMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pengeluaran");

        javax.swing.GroupLayout buttonToSetExpenseLayout = new javax.swing.GroupLayout(buttonToSetExpense);
        buttonToSetExpense.setLayout(buttonToSetExpenseLayout);
        buttonToSetExpenseLayout.setHorizontalGroup(
            buttonToSetExpenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(buttonToSetExpenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonToSetExpenseLayout.createSequentialGroup()
                    .addGap(0, 99, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 98, Short.MAX_VALUE)))
        );
        buttonToSetExpenseLayout.setVerticalGroup(
            buttonToSetExpenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(buttonToSetExpenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonToSetExpenseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel6.setBackground(new java.awt.Color(240, 84, 84));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 84, 84));
        jLabel6.setText("Close");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(inputDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idHeader)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonToSetExpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonToSetIncome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel6)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(idHeader)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonToSetIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonToSetExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescriptionActionPerformed

    private void inputNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNominalActionPerformed

    private void buttonToSetIncomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonToSetIncomeMouseClicked
        
    }//GEN-LAST:event_buttonToSetIncomeMouseClicked

    private void buttonToSetExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonToSetExpenseMouseClicked
        
    }//GEN-LAST:event_buttonToSetExpenseMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Modal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Modal().setVisible(true);
//            }
//        });
//    }

    public Dashboard dashboard;
    public int id;
    public String description;
    public float nominal;
    public String updatedAt;

    public int getId() {
        return id;
    }

    public Modal setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Modal setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getNominal() {
        return nominal;
    }

    public Modal setNominal(float nominal) {
        this.nominal = nominal;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Modal setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonToSetExpense;
    private javax.swing.JPanel buttonToSetIncome;
    private javax.swing.JLabel idHeader;
    private org.jdesktop.swingx.JXDatePicker inputDate;
    private javax.swing.JTextField inputDescription;
    private javax.swing.JTextField inputNominal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
