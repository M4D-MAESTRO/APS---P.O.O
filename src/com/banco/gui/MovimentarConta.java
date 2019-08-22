package com.banco.gui;

import com.banco.aplicacao.JFrameAplicacao;
import com.banco.db.ContaCorrenteDAO;
import com.banco.db.ContaPoupancaDAO;
import com.banco.db.DAO;
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
public class MovimentarConta extends javax.swing.JFrame {

    private ContaBancaria conta;
    private Integer opcao = 1;
    private DAO dao;

    public MovimentarConta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcao = new javax.swing.ButtonGroup();
        jPanel1 = new FundoTela(1);
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumConta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonLocalizar = new javax.swing.JButton();
        jRadioButtonDepositar = new javax.swing.JRadioButton();
        jRadioButtonSacar = new javax.swing.JRadioButton();
        jRadioButtonTrans = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumContaTrans = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentar Contas");
        setIconImage(JFrameAplicacao.getIcon());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações com Contas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

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

        jLabel4.setText("(insira apenas números)");

        jButtonLocalizar.setText("Localizar");
        jButtonLocalizar.setEnabled(false);
        jButtonLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocalizarActionPerformed(evt);
            }
        });

        buttonGroupOpcao.add(jRadioButtonDepositar);
        jRadioButtonDepositar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonDepositar.setSelected(true);
        jRadioButtonDepositar.setText("Depositar");
        jRadioButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDepositarActionPerformed(evt);
            }
        });

        buttonGroupOpcao.add(jRadioButtonSacar);
        jRadioButtonSacar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonSacar.setText("Sacar");
        jRadioButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSacarActionPerformed(evt);
            }
        });

        buttonGroupOpcao.add(jRadioButtonTrans);
        jRadioButtonTrans.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButtonTrans.setText("Transferir");
        jRadioButtonTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTransActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Informe o valor: ");

        jTextFieldValor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldValor.setEnabled(false);
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("R$: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Número da conta");

        jTextFieldNumContaTrans.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNumContaTrans.setEnabled(false);
        jTextFieldNumContaTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNumContaTransKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumContaTransKeyTyped(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setEnabled(false);
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNumContaTrans, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValor))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonDepositar)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonSacar)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonTrans))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(13, 13, 13))
                    .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonConfirmar))
                            .addComponent(jButtonLocalizar)
                            .addComponent(jLabel4))))
                .addGap(451, 451, 451))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLocalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDepositar)
                    .addComponent(jRadioButtonSacar)
                    .addComponent(jRadioButtonTrans))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumContaTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumContaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaKeyReleased
        if (!jTextFieldNumConta.getText().isEmpty()) {
            jButtonLocalizar.setEnabled(true);
            jButtonLocalizar.setToolTipText("");
        } else {
            jButtonLocalizar.setEnabled(false);
            jButtonLocalizar.setToolTipText("Insira o número da conta primeiro");
        }
    }//GEN-LAST:event_jTextFieldNumContaKeyReleased

    private void jTextFieldNumContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldNumContaKeyTyped

    private void jButtonLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocalizarActionPerformed
        try {
            Long id = Long.parseLong(jTextFieldNumConta.getText());
            dao = new ContaCorrenteDAO();
            this.conta = (ContaCorrente) dao.getByNumeroConta(id);
            if (this.conta == null) {
                dao = new ContaPoupancaDAO();
                this.conta = (ContaPoupanca) dao.getByNumeroConta(id);
            }

            System.out.println(this.conta.toString());
            jTextFieldValor.setEnabled(true);

            System.out.println("Conta: " + conta.getNumeroConta());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, prencha todos os campos!\nApenas NÚMEROS!", "ERRO", JOptionPane.PLAIN_MESSAGE);
            jTextFieldValor.setEnabled(false);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Conta inexistente", "ERRO", JOptionPane.PLAIN_MESSAGE);
            jTextFieldValor.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido!\nContate a T.I e informe o seguinte erro: " + e.toString(), "ERRO", JOptionPane.PLAIN_MESSAGE);
            jTextFieldValor.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonLocalizarActionPerformed

    private void jRadioButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDepositarActionPerformed
        this.opcao = 1;
        jTextFieldNumContaTrans.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonDepositarActionPerformed

    private void jRadioButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSacarActionPerformed
        this.opcao = 2;
        jTextFieldNumContaTrans.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonSacarActionPerformed

    private void jRadioButtonTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTransActionPerformed
        this.opcao = 3;
        jTextFieldNumContaTrans.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonTransActionPerformed

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldValorKeyTyped

    private void jTextFieldNumContaTransKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaTransKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldNumContaTransKeyTyped

    private void jTextFieldValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyReleased
        if (this.opcao != 3) {
            if (!jTextFieldValor.getText().isEmpty()) {
                jButtonConfirmar.setEnabled(true);
                jButtonConfirmar.setToolTipText("");
            } else {
                jButtonConfirmar.setEnabled(false);
                jButtonConfirmar.setToolTipText("Insira o valor primeiro");
            }
        } else {
            jButtonConfirmar.setEnabled(false);
            jButtonConfirmar.setToolTipText("Insira o valor e o número da conta para transferência primeiro");
        }

    }//GEN-LAST:event_jTextFieldValorKeyReleased

    private void jTextFieldNumContaTransKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaTransKeyReleased
        if (!jTextFieldNumContaTrans.getText().isEmpty()) {
            jButtonConfirmar.setEnabled(true);
            jButtonConfirmar.setToolTipText("");
        } else {
            jButtonConfirmar.setEnabled(false);
            jButtonConfirmar.setToolTipText("Insira o número da conta para transferência primeiro");
        }
    }//GEN-LAST:event_jTextFieldNumContaTransKeyReleased

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        switch (this.opcao) {
            case 1: //Deposito
                this.conta.depositar(Double.parseDouble(jTextFieldValor.getText()));
                dao.atualizar(this.conta);
                break;

            case 2: //Saque
                this.conta.sacar(Double.parseDouble(jTextFieldValor.getText()));
                dao.atualizar(this.conta);
                break;

            case 3: //Transferencia
                Double valor = 0.0;
                ContaBancaria contaTrans = null;
                DAO daoTrans = null;
                try {
                    Long id = Long.parseLong(jTextFieldNumContaTrans.getText());
                    daoTrans = new ContaCorrenteDAO();
                    contaTrans = (ContaCorrente) daoTrans.getByNumeroConta(id);
                    if (contaTrans == null) {
                        daoTrans = new ContaPoupancaDAO();
                        contaTrans = (ContaPoupanca) daoTrans.getByNumeroConta(id);
                    }
                    valor = Double.parseDouble(jTextFieldValor.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, prencha todos os campos!\nApenas NÚMEROS!", "ERRO", JOptionPane.PLAIN_MESSAGE);
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Conta inexistente", "ERRO", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro desconhecido!\nContate a T.I e informe o seguinte erro: " + e.toString(), "ERRO", JOptionPane.PLAIN_MESSAGE);
                }

                if (contaTrans != null) {
                    this.conta.transferir(valor, conta, contaTrans);
                    dao.atualizar(this.conta);
                    daoTrans.atualizar(contaTrans);
                } else {
                    JOptionPane.showMessageDialog(null, "Conta inexistente", "ERRO", JOptionPane.PLAIN_MESSAGE);
                }

                break;
        }

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MovimentarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimentarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimentarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimentarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentarConta().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc="">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOpcao;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLocalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDepositar;
    private javax.swing.JRadioButton jRadioButtonSacar;
    private javax.swing.JRadioButton jRadioButtonTrans;
    private javax.swing.JTextField jTextFieldNumConta;
    private javax.swing.JTextField jTextFieldNumContaTrans;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
