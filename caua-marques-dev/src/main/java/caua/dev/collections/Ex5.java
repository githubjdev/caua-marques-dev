package caua.dev.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex5 {

	public static void main(String[] args) {

		List<Produto> produtos = List.of(new Produto("Arroz", "Alimentos"), 
				new Produto("Feijao", "Alimentos"),
				new Produto("Sabao", "Limpeza"), 
				new Produto("Pano", "Limpeza"));

		Map<String, List<Produto>> map = new HashMap<String, List<Produto>>();

		for (Produto produto : produtos) {
			map.computeIfAbsent(produto.getCategoria(), k -> new ArrayList<Produto>()).add(produto);
		}

		for (String key : map.keySet()) {

			System.out.println("=========== " + key + " =======================");
			List<Produto> prod = map.get(key);

			for (Produto p : prod) {
				System.out.println(p.getNome());
			}

		}
		
		Produto feijao = new Produto("Feijão branco", "Alimentos");
		
		map.get("Alimentos").add(feijao);
		
		
		for (String key : map.keySet()) {

			System.out.println("=========== " + key + " =======================");
			List<Produto> prod = map.get(key);

			for (Produto p : prod) {
				System.out.println(p.getNome());
			}

		}

	}

}
