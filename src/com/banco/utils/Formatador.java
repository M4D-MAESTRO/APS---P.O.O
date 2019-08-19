package com.banco.utils;

/**
 *
 * @author M4ESTRO
 */
public class Formatador {

    //Limita o campo de texto a aceitar apenas números e o . "ponto final" como caracter
    public static void formatarCampoNumerico(java.awt.event.KeyEvent evt) { //Necessita da passagem de um KeyEvent, recomendo o KeyTyped
        
        String caracteres = "0123456789.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    //Limita o campo de texto a aceitar apenas letras, ou seja, não permitir inserção de números
    public static void formatarCampoLetras(java.awt.event.KeyEvent evt) { //Necessita da passagem de um KeyEvent, recomendo o KeyTyped
        String caracteres = "0123456789";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

}