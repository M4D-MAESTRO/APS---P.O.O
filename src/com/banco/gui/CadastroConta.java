

package com.banco.gui;

import com.banco.aplicacao.JFrameAplicacao;
import com.banco.domain.Banco;
import com.banco.domain.ContaBancaria;
import com.banco.domain.ContaCorrente;
import com.banco.domain.ContaPoupanca;
import com.banco.images.FundoTela;
import com.banco.utils.Formatador;
import javax.swing.JOptionPane;

/**
 *
 * @author M4ESTRO
 */
public class CadastroConta extends javax.swing.JFrame {

    private Boolean numero = false, saldo = false, taxaLim = false;
    private Boolean tipoConta = true;

    public CadastroConta() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupConta = new javax.swing.ButtonGroup();
        jPanelCadastro = new FundoTela(1);
        jRadioButtonContCorrente = new javax.swing.JRadioButton();
        jRadioButtonContPoupanca = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelTaxaLim = new javax.swing.JLabel();
        jTextFieldTaxaLimite = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contas");
        setAlwaysOnTop(true);
        setIconImage(JFrameAplicacao.getIcon());
        setResizable(false);

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Contas", 1, 0));

        buttonGroupConta.add(jRadioButtonContCorrente);
        jRadioButtonContCorrente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonContCorrente.setSelected(true);
        jRadioButtonContCorrente.setText("Conta Corrente");
        jRadioButtonContCorrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonContCorrenteActionPerformed(evt);
            }
        });

        buttonGroupConta.add(jRadioButtonContPoupanca);
        jRadioButtonContPoupanca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonContPoupanca.setText("Conta Poupança");
        jRadioButtonContPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonContPoupancaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Informe o número da Conta: ");

        jTextFieldNumConta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNumConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumContaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumContaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Informe o saldo: ");

        jTextFieldSaldo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSaldoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSaldoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("R$: ");

        jLabelTaxaLim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTaxaLim.setText("Taxa: ");

        jTextFieldTaxaLimite.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldTaxaLimite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTaxaLimiteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTaxaLimiteKeyTyped(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setToolTipText("<html>");
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabel4.setText("(insira apenas números)");

        jLabel5.setText("(insira apenas números)");

        jLabel6.setText("(insira apenas números)");

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelTaxaLim)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                        .addComponent(jButtonFechar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCadastrar))
                                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldTaxaLimite, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldSaldo))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroLayout.createSequentialGroup()
                                            .addComponent(jRadioButtonContCorrente)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButtonContPoupanca))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonContCorrente)
                    .addComponent(jRadioButtonContPoupanca))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTaxaLim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTaxaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonFechar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonContCorrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonContCorrenteActionPerformed
        jLabelTaxaLim.setText("Taxa: ");
        tipoConta = true;
    }//GEN-LAST:event_jRadioButtonContCorrenteActionPerformed

    private void jRadioButtonContPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonContPoupancaActionPerformed
        jLabelTaxaLim.setText("Limite: ");
        tipoConta = false;
    }//GEN-LAST:event_jRadioButtonContPoupancaActionPerformed

    private void jTextFieldNumContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldNumContaKeyTyped

    private void jTextFieldSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSaldoKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldSaldoKeyTyped

    private void jTextFieldTaxaLimiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTaxaLimiteKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldTaxaLimiteKeyTyped

    private void jTextFieldTaxaLimiteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTaxaLimiteKeyReleased
        if (!jTextFieldTaxaLimite.getText().isEmpty()) {
            taxaLim = true;
        } else {
            taxaLim = false;
        }
        
        desbloquearCadastro();
    }//GEN-LAST:event_jTextFieldTaxaLimiteKeyReleased

    private void jTextFieldSaldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSaldoKeyReleased
        if (!jTextFieldSaldo.getText().isEmpty()) {
            saldo = true;
        } else {
            saldo = false;
        }
        
        desbloquearCadastro();
    }//GEN-LAST:event_jTextFieldSaldoKeyReleased

    private void jTextFieldNumContaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaKeyReleased
        if (!jTextFieldNumConta.getText().isEmpty()) {
            numero = true;
        } else {
            numero = false;
        }

        desbloquearCadastro();
    }//GEN-LAST:event_jTextFieldNumContaKeyReleased

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        try {
            if (tipoConta) {
                ContaCorrente conta = new ContaCorrente(Long.parseLong(jTextFieldNumConta.getText()), Double.parseDouble(jTextFieldSaldo.getText()), Double.parseDouble(jTextFieldTaxaLimite.getText()));
                JFrameAplicacao.getBanco().inserir(conta);
            } else {
                ContaPoupanca conta = new ContaPoupanca(Long.parseLong(jTextFieldNumConta.getText()), Double.parseDouble(jTextFieldSaldo.getText()), Double.parseDouble(jTextFieldTaxaLimite.getText()));
                JFrameAplicacao.getBanco().inserir(conta);
            }
            //JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!", "SUCESSO", JOptionPane.PLAIN_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, prencha todos os campos!\nApenas NÚMEROS!", "ERRO", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido!" + e.toString(), "ERRO", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void desbloquearCadastro() {
        if (numero && saldo && taxaLim) {
            jButtonCadastrar.setEnabled(true);
        } else {
            jButtonCadastrar.setEnabled(false);
        }

        String aux = "<html>";

        if (!numero) {
            aux += "Insira o número da conta";
        }

        if (!saldo) {
            aux += "<br>Insira o saldo da conta";
        }

        if (!taxaLim) {
            aux += "<br>Insira a taxa/limite da conta";
        }

        aux += "</html>";

        jButtonCadastrar.setToolTipText(aux);
    }

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
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroConta().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc="">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupConta;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTaxaLim;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JRadioButton jRadioButtonContCorrente;
    private javax.swing.JRadioButton jRadioButtonContPoupanca;
    private javax.swing.JTextField jTextFieldNumConta;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldTaxaLimite;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
