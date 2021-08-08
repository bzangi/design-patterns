package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 5);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 2);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento1));
		System.out.println();
		System.out.println(calculadora.calcular(orcamento2));
	}

}
