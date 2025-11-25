package arrayevetor;

public class Ex5 {

	public static void main(String[] args) {

		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 8;
		notas[2] = 7;

		// For tradicional

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota na posi��o " + i + ": " + notas[i]);
		}

		// ForEach

		for (int nota : notas) {
			System.out.println("Nota ForEach : " + nota);
		}

	}

}
