package com.banco.aplicacao;

//@author Henrique

import com.banco.domain.Banco;
import com.banco.domain.ContaBancaria;
import com.banco.gui.CadastroConta;
import com.banco.gui.MovimentarConta;
import com.banco.gui.RelatorioConta;
import com.banco.gui.RemoverConta;
import com.banco.images.FundoTela;
import com.banco.images.Images;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JFrameAplicacao extends javax.swing.JFrame {
    private final Float VERSION = (float) 1.0;
    private static Banco banco = new Banco();
    private static Image icon = Images.getImage(3).getImage();
    
    public static Image getIcon(){
        return icon;
    }

    public static Banco getBanco() {
        return banco;
    }
    
    
    
    public JFrameAplicacao() {
        initComponents();
        ImageIcon imagem = Images.getImageScaled(4, 600, 300);
        jLabelImagem.setIcon(imagem);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FundoTela(1);
        jLabelImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuCriar = new javax.swing.JMenuItem();
        jMenuMovimentar = new javax.swing.JMenuItem();
        jMenuRemover = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema bancário " + VERSION.toString());
        setIconImage(icon);
        setResizable(false);

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/banco/images/Dinheiro(2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuMenu.setText("Conta");

        jMenuCriar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuCriar.setMnemonic(KeyEvent.VK_C
        );
        jMenuCriar.setText("Criar");
        jMenuCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCriarActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuCriar);

        jMenuMovimentar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuMovimentar.setText("Movimentar");
        jMenuMovimentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMovimentarActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuMovimentar);

        jMenuRemover.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuRemover.setText("Remover");
        jMenuRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRemoverActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuRemover);

        jMenuBar1.add(jMenuMenu);

        jMenuRelatorio.setText("Relatório");
        jMenuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuRelatorio);

        jMenuSair.setText("Finalizar");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

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

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        JOptionPane.showMessageDialog(null, "Sistema bancário versão " + VERSION + "\nDesenvolvido por: Luís Henrique de C. Corrêa\nAPS - P.O.O", "Créditos", JOptionPane.PLAIN_MESSAGE, null) ;
    }//GEN-LAST:event_jMenuSobreMouseClicked

    private void jMenuCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCriarActionPerformed
        CadastroConta cadastroConta = new CadastroConta();
        cadastroConta.setEnabled(true);
        cadastroConta.setVisible(true);
        cadastroConta.toFront();
    }//GEN-LAST:event_jMenuCriarActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        JOptionPane.showMessageDialog(null, "Aplicação encerrada\n" + "Desenvolvida por: Luís Henrique de C. Corrêa", "A P S", JOptionPane.PLAIN_MESSAGE, null);
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        JOptionPane.showMessageDialog(null, "Aplicação encerrada\n" + "Desenvolvida por: Luís Henrique de C. Corrêa", "A P S", JOptionPane.PLAIN_MESSAGE, null);
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuMovimentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMovimentarActionPerformed
        MovimentarConta movimentarConta = new MovimentarConta();
        movimentarConta.setEnabled(true);
        movimentarConta.setVisible(true);
        movimentarConta.toFront();
    }//GEN-LAST:event_jMenuMovimentarActionPerformed

    private void jMenuRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRemoverActionPerformed
        RemoverConta removerConta = new RemoverConta();
        removerConta.setEnabled(true);
        removerConta.setVisible(true);
        removerConta.toFront();
    }//GEN-LAST:event_jMenuRemoverActionPerformed

    private void jMenuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRelatorioMouseClicked
        RelatorioConta relatorioConta = new RelatorioConta();
        relatorioConta.setEnabled(true);
        relatorioConta.setVisible(true);
        relatorioConta.toFront();
    }//GEN-LAST:event_jMenuRelatorioMouseClicked

/*for (ContaBancaria conta : banco.getContas()) {
            System.out.println(conta.getNumeroConta());
        }*/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        
        //<editor-fold defaultstate="collapsed" desc=" TEMA (DEFAULT COLOR - RED) ">
         UIManager.put("nimbusBase", new Color(119,136,153));
         UIManager.put("nimbusBlueGrey", new Color(0,139,139));
         UIManager.put("control", new Color(0,191,255));
        //</editor-fold>
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAplicacao().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc="">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCriar;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JMenuItem jMenuMovimentar;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMenuRemover;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
