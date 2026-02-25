package caua.dev.ddd;

import java.math.BigDecimal;

public class ContaCorrente {

	private String numero;
	private BigDecimal saldo;
	private Pessoa pessoa;

	public ContaCorrente(String numero, BigDecimal saldo, Pessoa pessoa) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.pessoa = pessoa;
	}

	public void depositar(BigDecimal valor) {

		if (valor.doubleValue() <= 0) {
			throw new RuntimeException("Deposito invalido");
		}

		saldo = saldo.add(valor);

	}

	public void debitar(BigDecimal valor) {

		if (valor.doubleValue() <= 0) {
			throw new IllegalArgumentException("Valor de débito é invalido");
		}

		/* Se a conta não tem limite de crédito */
		if (saldo.doubleValue() < valor.doubleValue()) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}

		saldo = saldo.subtract(valor);

	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	

}
