package caua.dev.arrayevetor;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] nota = new int[5];
		nota[0] = 5;
		nota[1] = 9;
		nota[2] = 7;
		nota[3] = 8;
		nota[4] = 10;

        
		int soma = 0;
		
		for (int n : nota) {
			soma += n;
		}
		
		System.out.println("Média das notas : " + soma / nota.length);

	}

}
