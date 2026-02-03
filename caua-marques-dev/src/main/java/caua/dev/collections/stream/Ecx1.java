package caua.dev.collections.stream;

import java.util.List;

import caua.dev.collections.Produto;

public class Ecx1 {

	public static void main(String[] args) {

		List<Produto> produtos = List.of(new Produto("Teclado", "Informática", true, 50.0),
				                         new Produto("Mouse", "Informática", false, 80.00), 
				                         new Produto("Monitor", "Informática", true, 900.0));

		List<Produto> ativos = produtos.stream().filter(Produto::getAtivoProd).toList();
		
		
		List<String> nomes = ativos.stream().map(Produto::getNome).toList();
		nomes.forEach(System.out::println);
		
		
		
		//double total = ativos.stream().mapToDouble(Produto::getValorProd).sum();
        
        
        double total =  produtos.stream() /*Pega o Stram*/
        		                    .filter(Produto::getAtivoProd) /*Filtra por ativo*/
        		                    .mapToDouble(Produto::getValorProd) /*Indica o campo a ser somado*/
        		                    .sum(); /*Efetua a soma*/
        
        double total2 = 0;
        for (Produto p : produtos) {
			if (p.getAtivoProd()) {
				total2 += p.getValorProd();
			}
		}
        
        System.out.println("Soma total dos ativos: " + total2);
		

	}

}
