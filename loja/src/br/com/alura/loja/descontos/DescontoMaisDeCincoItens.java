package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoMaisDeCincoItens extends Desconto{
	
	public DescontoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));

	}

	@Override
	public boolean aplicavel(Orcamento orcamento) {
		
		return orcamento.getQuantidadeItens() >= 5;
	}
	

}
