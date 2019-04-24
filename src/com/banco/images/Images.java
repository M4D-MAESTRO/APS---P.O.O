package com.banco.images;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Images {

    private static ImageIcon imagem;

    public static ImageIcon getImage(Integer opcao) {

        switch (opcao) {
            case 1:
                imagem = new ImageIcon(ClassLoader.getSystemResource("com/banco/images/fundo(1).jpg"));
                break;

            case 2:
                imagem = new ImageIcon(ClassLoader.getSystemResource("com/banco/images/fundo(2).jpg"));
                break;

            case 3:
                imagem = new ImageIcon(ClassLoader.getSystemResource("com/banco/images/Dinheiro(1).png"));
                break;

            case 4:
                imagem = new ImageIcon(ClassLoader.getSystemResource("com/banco/images/Dinheiro(2).png"));
                break;
        }

        return imagem;
    }

    public static ImageIcon getImageScaled(Integer opcao, Integer largura, Integer altura) {
        imagem = getImage(opcao);
        imagem.setImage(changeScale(imagem.getImage(), largura, altura));

        return imagem;
    }

    public static Image changeScale(Image srcImg, int largura, int altura) {
        BufferedImage resizedImg = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, largura, altura, null);
        g2.dispose();

        return resizedImg;
    }

}
