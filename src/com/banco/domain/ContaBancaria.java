package com.banco.domain;

import javax.swing.JOptionPane;

public abstract class ContaBancaria {
	
	private Long numeroConta;
	private Double saldo;
	
	public ContaBancaria() {
		super();
	}
	public ContaBancaria(Long numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}
	public ContaBancaria(Long numeroConta, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public Long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public  void transferir(Double valor, ContaBancaria contaDe, ContaBancaria contaPara) {
		if (this.getSaldo() < valor) {
			JOptionPane.showMessageDialog(null, "Saldo abaixo do valor transferível", "SALDO ABAIXO",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			contaDe.setSaldo(contaDe.getSaldo() - valor);
			contaPara.setSaldo(contaPara.getSaldo() + valor);
			JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!",
					JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public abstract void sacar(Double valor);
	public abstract void depositar(Double valor);
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "Conta bancária número: " + this.numeroConta + "\n"
                + "Saldo: " + this.saldo;
    }

	
	

}
