package com.banco.gui;

import com.banco.aplicacao.JFrameAplicacao;
import com.banco.db.ContaCorrenteDAO;
import com.banco.domain.ContaCorrente;
import com.banco.images.FundoTela;
import com.banco.utils.Formatador;
import javax.swing.JOptionPane;

/**
 *
 * @author M4ESTRO
 */
public class RemoverConta extends javax.swing.JFrame {
    
    public RemoverConta() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FundoTela(1);
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumConta = new javax.swing.JTextField();
        jButtonRemover = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Contas");
        setIconImage(JFrameAplicacao.getIcon());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remover Conta", 1, 0, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

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

        jButtonRemover.setText("Remover");
        jButtonRemover.setEnabled(false);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemover))
                    .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemover)
                    .addComponent(jButton2))
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

    private void jTextFieldNumContaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaKeyReleased
        if (!jTextFieldNumConta.getText().isEmpty()) {
            jButtonRemover.setEnabled(true);
            jButtonRemover.setToolTipText("");
        } else {
            jButtonRemover.setEnabled(false);
            jButtonRemover.setToolTipText("Insira o número da conta primeiro");
        }
    }//GEN-LAST:event_jTextFieldNumContaKeyReleased

    private void jTextFieldNumContaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumContaKeyTyped
        Formatador.formatarCampoNumerico(evt);
    }//GEN-LAST:event_jTextFieldNumContaKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
        Integer opcao = JOptionPane.showConfirmDialog(null, "Tem certeza?\nEsta operação NÃO PODERÁ SER DESFEITA!", "CERTEZA?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if ((opcao == JOptionPane.CLOSED_OPTION) || (opcao == JOptionPane.NO_OPTION)) {
            return;
        } else {
            try {
                JFrameAplicacao.getBanco().remover(Long.parseLong(jTextFieldNumConta.getText()));
                ContaCorrenteDAO dao = new ContaCorrenteDAO();
                dao.deletar(new ContaCorrente(Long.parseLong(jTextFieldNumConta.getText())));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, prencha todos os campos!\nApenas NÚMEROS!", "ERRO", JOptionPane.PLAIN_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Conta inexistente", "ERRO", JOptionPane.PLAIN_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido!\nContate a T.I e informe o seguinte erro: " + e.toString(), "ERRO", JOptionPane.PLAIN_MESSAGE);
            }
        }
        

    }//GEN-LAST:event_jButtonRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverConta().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc="">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumConta;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
