package arrayevetor;

public class Ex9 {

	public static void main(String[] args) {

		int[] notas = new int[4];
		notas[0] = 100;
		notas[1] = 80;
		notas[2] = 50;
		notas[3] = 40;

		double total = 0;

		for (double n : notas) {
			total += n;
		}

		double media = total / notas.length;

		System.out.println("M�dia = " + media);

	}

}
