package com.banco.gui;

import com.banco.aplicacao.JFrameAplicacao;
import com.banco.domain.ContaBancaria;
import com.banco.domain.ContaCorrente;
import com.banco.domain.ContaPoupanca;
import com.banco.domain.Imprimivel;
import com.banco.domain.Relatorio;
import com.banco.images.FundoTela;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author M4ESTRO
 */
public class RelatorioConta extends javax.swing.JFrame {

    private Boolean todas = true;

    public RelatorioConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcao = new javax.swing.ButtonGroup();
        jPanel1 = new FundoTela(1);
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxContas = new javax.swing.JComboBox<String>();
        jButtonReport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneReport = new javax.swing.JEditorPane();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Contas");
        setIconImage(JFrameAplicacao.getIcon());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório de Conta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Todas as contas?");

        buttonGroupOpcao.add(jRadioButtonSim);
        jRadioButtonSim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonSim.setSelected(true);
        jRadioButtonSim.setText("Sim");
        jRadioButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSimActionPerformed(evt);
            }
        });

        buttonGroupOpcao.add(jRadioButtonNao);
        jRadioButtonNao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonNao.setText("Não");
        jRadioButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Selecione uma conta");

        jComboBoxContas.setEnabled(false);
        jComboBoxContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxContasActionPerformed(evt);
            }
        });

        jButtonReport.setText("Visualizar Relatório");
        jButtonReport.setEnabled(false);
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        jEditorPaneReport.setEditable(false);
        jScrollPane1.setViewportView(jEditorPaneReport);

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSim)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonNao)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxContas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 179, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSim)
                    .addComponent(jRadioButtonNao)
                    .addComponent(jComboBoxContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonReport)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFechar)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void jRadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSimActionPerformed
        String lista[] = new String[1];
        lista[0] = "Selecione uma conta";
        jComboBoxContas.setModel(new DefaultComboBoxModel<>(lista));
        jComboBoxContas.setSelectedIndex(0);
        jComboBoxContas.setEnabled(false);

        this.todas = true;
    }//GEN-LAST:event_jRadioButtonSimActionPerformed

    private void jRadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNaoActionPerformed
        String lista[] = new String[JFrameAplicacao.getBanco().getContas().size()];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = String.valueOf(JFrameAplicacao.getBanco().getContas().get(i).getNumeroConta());
        }
        String listaFinal[] = new String[lista.length + 1];
        listaFinal[0] = "Selecione uma conta";
        for (int i = 0; i < listaFinal.length; i++) {
            if (i + 1 < listaFinal.length) {
                listaFinal[i + 1] = lista[i];
            }

        }
        jComboBoxContas.setModel(new DefaultComboBoxModel<>(listaFinal));
        jComboBoxContas.setEnabled(true);

        this.todas = false;
    }//GEN-LAST:event_jRadioButtonNaoActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        Relatorio report = new Relatorio();

        if (this.todas) {
            JFrameAplicacao.getBanco().getContas().stream().forEach((conta) -> {
                report.gerarRelatorio((Imprimivel) conta);
            });
        } else {
            ContaBancaria conta = null;
            Long numeroConta = Long.valueOf(jComboBoxContas.getSelectedItem().toString());
            Integer index = JFrameAplicacao.getBanco().getContas().indexOf(new ContaCorrente(numeroConta));
            try {
                if(index != -1){
                    conta  = JFrameAplicacao.getBanco().getContas().get(index);
                }else{
                    conta  = JFrameAplicacao.getBanco().getContas().get(JFrameAplicacao.getBanco().getContas().indexOf(new ContaPoupanca(numeroConta)));
                }                
                
                report.gerarRelatorio((Imprimivel) conta);
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Selecione uma conta válida.", "ERRO", JOptionPane.PLAIN_MESSAGE);

            }

        }
    }//GEN-LAST:event_jButtonReportActionPerformed

    private void jComboBoxContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxContasActionPerformed
        if(jRadioButtonSim.isSelected()){
            jButtonReport.setEnabled(true)
        }
        
        if (jComboBoxContas.getSelectedIndex() != 0 && jRadioButtonSim.isSelected()){
            jButtonReport.setEnabled(true);
        } else {
            jButtonReport.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxContasActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioConta().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc="">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOpcao;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JComboBox<String> jComboBoxContas;
    private javax.swing.JEditorPane jEditorPaneReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNao;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
