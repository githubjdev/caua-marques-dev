package caua.dev.encapsulamento;

public class Conta {

	private double saldo;

	public Conta(Double saldo) throws Exception {

		if (saldo <= 0) {
			throw new Exception("Valor do saldo inválido");
		}

		this.saldo = saldo;
	}

	public double depositar(double valor) throws Exception {

		if (valor <= 0) {
			throw new Exception("Valor do depósito inválido");
		}

		return saldo += valor;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) throws Exception {

		this.saldo = saldo;
	}

	public double sacar(double valor) throws Exception {
		
		if (valor > saldo) {
			throw new Exception("Saldo insuficiente");
		}

		return saldo -= valor;
	}

}
