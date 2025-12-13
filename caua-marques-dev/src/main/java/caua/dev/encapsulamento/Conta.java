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

		setSaldo(saldo += valor);
		return getSaldo();

	}

	public double getSaldo() throws Exception {
		
		if (saldo < 0) {
			 throw new Exception("Saldo não pode ser negativo");
		 }
		
		return saldo;
	}

	public void setSaldo(double saldo) throws Exception {
		 
		if (saldo < 0) {
			 throw new Exception("Saldo não pode ser negativo");
		 }
		 
		this.saldo = saldo;
	}

	public double sacar(double valor) throws Exception {

		if (valor > getSaldo()) {
			throw new Exception("Saldo insuficiente");
		}

		setSaldo(saldo -= valor);
		return getSaldo();
	}

}
