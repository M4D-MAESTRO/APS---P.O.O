package com.banco.images;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author 2017102465
 */
public class FundoTela extends JPanel{
    ImageIcon imagemFundoIcon = null;
    Image imagemFundoImage = null;
    
    public FundoTela(int opcao) {
        ImageIcon imagemFundoIconLocal = null;
        Image imagemFundoImageLocal = null;
        switch (opcao) {

            case 1:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("com/banco/images/fundo(1).jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;
                break;
                
                case 2:
                imagemFundoIconLocal = new ImageIcon(ClassLoader.getSystemResource("com/banco/images/fundo(2).jpg"));
                imagemFundoImageLocal = imagemFundoIconLocal.getImage();
                this.imagemFundoImage = imagemFundoImageLocal;
                break;
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(imagemFundoImage, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}
