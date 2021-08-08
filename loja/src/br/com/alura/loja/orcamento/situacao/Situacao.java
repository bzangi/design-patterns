package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.situacao.exception.DomainException;

public abstract class Situacao {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento){
		throw new DomainException("Orçamento não pôde ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento){
		throw new DomainException("Orçamento não pôde ser reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pôde ser finalizado!");
	}
}
