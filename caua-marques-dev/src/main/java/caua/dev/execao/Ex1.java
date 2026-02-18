package caua.dev.execao;

public class Ex1 {

	public static void main(String[] args) throws Exception {

		int a = 10;
		int b = 0;

		if (b <= 0) {
			throw new Exception("Valor não pode ser dividido por zero ou negativo. ");
		}

		int resultado = a / b;

		System.out.println("Resultado: " + resultado);

	}

}
