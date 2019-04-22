package com.banco.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Banco {

    private List<ContaBancaria> contas = new ArrayList<>();

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void inserir(ContaBancaria obj) {
        contas.add(obj);
        JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!", "SUCESSO", JOptionPane.PLAIN_MESSAGE);
    }

    public void remover(Long numero) {
        ContaBancaria contaBancaria = procurarConta(numero);
        if (contaBancaria == null) {
            JOptionPane.showMessageDialog(null, "Conta inexistente!", "INEXISTENTE", JOptionPane.PLAIN_MESSAGE);
        } else {
            contas.remove(contaBancaria);
            JOptionPane.showMessageDialog(null, "Conta removida com sucesso!", "SUCESSO", JOptionPane.PLAIN_MESSAGE);
        }

    }

    public ContaBancaria procurarConta(Long numeroConta) {
        ContaBancaria contaBancaria = new ContaCorrente(numeroConta);
        Integer index;

        index = contas.indexOf(contaBancaria);

        if (index != -1) {
            return contas.get(index);
        } else {
            contaBancaria = new ContaPoupanca(numeroConta);
            index = contas.indexOf(contaBancaria);
        }

        if (index != -1) {
            return contas.get(index);
        } else {
            return null;
        }

    }

    /*public static void main(String a[]) {
		Banco banco = new Banco();
		banco.contas.addAll(Arrays.asList(
				new ContaCorrente(Long.valueOf(1)), 
				new ContaPoupanca(Long.valueOf(2)),
				new ContaCorrente(Long.valueOf(3)), 
				new ContaPoupanca(Long.valueOf(4)))
				);
		
		banco.procurarConta(Long.valueOf(3));
		//banco.remover(Long.valueOf(2));
		//banco.remover(Long.valueOf(3));
		banco.remover(Long.valueOf(1000));
		for(int i = 0; i < banco.contas.size(); i++) {
			System.out.println(banco.contas.get(i).getNumeroConta());
		}
		System.out.println("Terminado");

	}*/
}
