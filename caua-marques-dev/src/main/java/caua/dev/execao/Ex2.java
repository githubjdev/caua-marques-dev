package caua.dev.execao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = null;
		try {

			sc = new Scanner(System.in);

			System.out.println(sc.next());

		} finally { /* Sempre vai ser executado */
			if (sc != null) {
				sc.close();
			}
		}

	}

}
