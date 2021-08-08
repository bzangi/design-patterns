package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisDeCincoItens(
				new DescontoValorMaisDeQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}
 
}