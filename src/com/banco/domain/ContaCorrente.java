package com.banco.domain;

import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private Double taxaDeOperacao;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(Long numeroConta, Double saldo) {
        super(numeroConta, saldo);
    }

    public ContaCorrente(Long numeroConta) {
        super(numeroConta);
    }

    public ContaCorrente(Long numeroConta, Double saldo, Double taxaDeOperacao) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public ContaCorrente(Double taxaDeOperacao) {
        super();
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public Double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(Double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(Double valor) {
        if (this.getSaldo() < valor) {
            JOptionPane.showMessageDialog(null, "Saldo abaixo do valor sacável", "SALDO ABAIXO",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            this.setSaldo((this.getSaldo() - valor) - this.taxaDeOperacao);
            JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!",
                    JOptionPane.PLAIN_MESSAGE);
        }

    }

    @Override
    public void depositar(Double valor) {
        this.setSaldo((this.getSaldo() + valor) - this.taxaDeOperacao);
        JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!", JOptionPane.PLAIN_MESSAGE);

    }

    @Override
    public String mostrarDados() {
        return "Conta corrente número " + this.getNumeroConta() + "\nSaldo atual: " + this.getSaldo()
                + "\nTaxa atual: " + this.taxaDeOperacao ;

    }

}
