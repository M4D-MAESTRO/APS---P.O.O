package com.banco.domain;

public class Relatorio {
	
	public String gerarRelatorio(Imprimivel obj) {
		return obj.mostrarDados();
	}

}
