package caua.dev.collections;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {

	public static void main(String[] args) {
		String[] dados = { "A", "B", "C", "D", "E", "A", "D" };
		
		Map<String, Integer> contagem = new HashMap<String, Integer>();
		
		for (String d : dados) {
			contagem.put(d, contagem.getOrDefault(d, 0) + 1);
		}
		
		System.out.println(contagem);
		
	}

}
