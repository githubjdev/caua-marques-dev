package caua.dev.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {

		List<Object[]> objects = new ArrayList<Object[]>();
		Set<Produto> produtos = new HashSet<Produto>();

		objects.add(new Object[] { "Teclado", 10, 150.00, true, "Asus" });
		objects.add(new Object[] { "Mouse", 15, 50.00, true, "Logi" });
		objects.add(new Object[] { "Monitor", 20, 950.00, false, "AOC" });

		for (Object[] obj : objects) { /* Linhas */

			System.out.println("----------------------------------");

			for (int i = 0; i < obj.length; i++) {
				String nomeProd = (String) obj[0];
				double estoqueProd = Double.parseDouble("" +obj[1]);
				double valorProd = (Double) obj[2];
				boolean ativoProd = (Boolean) obj[3];
				String marcaProd = (String) obj[4];
				
				Produto produto = new Produto(nomeProd, marcaProd, ativoProd, valorProd, estoqueProd);
				produtos.add(produto);
			}

		}
		
		
		for (Produto produto : produtos) {
		   System.out.println(produto.toString());
		}

	}

}
