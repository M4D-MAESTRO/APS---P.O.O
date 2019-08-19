package com.banco.domain;

import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

	private Double limite;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Long numeroConta, Double saldo) {
		super(numeroConta, saldo);
	}
        
        public ContaPoupanca(Long numeroConta, Double saldo, Double limite) {
		super(numeroConta, saldo);
                this.limite = limite;
	}

	public ContaPoupanca(Long numeroConta) {
		super(numeroConta);
	}

	public ContaPoupanca(Double limite) {
		super();
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(Double valor) {
		if (this.getSaldo() < valor) {
			if ((this.limite + this.getSaldo()) < valor) {
				JOptionPane.showMessageDialog(null, "Saldo abaixo do valor sacável e do limite disponível",
						"SALDO ABAIXO", JOptionPane.PLAIN_MESSAGE);
			} else {
				this.setSaldo(this.getSaldo() - valor);
				JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!",
						JOptionPane.PLAIN_MESSAGE);
			}
		} else {
			this.setSaldo(this.getSaldo() - valor);
			JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!",
					JOptionPane.PLAIN_MESSAGE);
		}

	}

	@Override
	public void depositar(Double valor) {
		this.setSaldo(this.getSaldo() + valor);
		JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!", JOptionPane.PLAIN_MESSAGE);

	}

	@Override
	public String mostrarDados() {
		return "Conta poupança número " + this.getNumeroConta() + "\nSaldo atual: " + this.getSaldo()
								+ "\nLimite disponível: " + this.limite;

	}

}
