package arrayevetor;

public class Ex7 {

	public static void main(String[] args) {

		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 8;
		notas[2] = 7;

		int soma = 0;

		for (int n : notas) {
			soma += n;
		}

		System.out.println("Soma total = " + soma);

	}

}
