package caua.dev.encapsulamento;

public class ContaMain {

	public static void main(String[] args) throws Exception {
		
		Conta conta = new Conta(5.0);
		
		System.out.println("1º Saldo atual: " + conta.depositar(100));
		
		System.out.println("2º Saldo atual: " + conta.depositar(200));
		
		System.out.println("3º Saldo atual: " + conta.depositar(100));
		
		System.out.println("Saldo final: " + conta.getSaldo());
		
		System.out.println("Saldo após saque: " + conta.sacar(100.0));
		
		
		String s = new String("Alex");
		System.out.println("Conteém A : " + s.contains("A"));
		
		Integer integer = new Integer(38);
		System.out.println("Em Double: " + integer.doubleValue());

	}

}
