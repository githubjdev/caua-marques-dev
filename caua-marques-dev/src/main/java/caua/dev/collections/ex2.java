package caua.dev.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import caua.dev.composicao.Pedido;

public class ex2 {

	public static void main(String[] args) {

		List<Pedido> pedidos = new ArrayList<Pedido>();

		pedidos.add(new Pedido("p1", "EFETUADO", 200.00));
		pedidos.add(new Pedido("p2", "CANCELADO", 150.00));
		pedidos.add(new Pedido("p3", "PAGO", 50.00));
		pedidos.add(new Pedido("p4", "ESTORNADO", 300.00));
		pedidos.add(new Pedido("p5", "ERRO", 85.00));
		pedidos.add(new Pedido("p6", "CANCELADO", 80.00));
		pedidos.add(new Pedido("p7", "ESTORNADO", 125.00));

		pedidos.sort(
				  Comparator.comparing(Pedido::getStatus)
				  .thenComparing(Comparator.comparing(Pedido::getValor)
						  .reversed())
				);
		
		/*Collections.sort(pedidos, new Comparator<Pedido>() {

			@Override
			public int compare(Pedido p1, Pedido p2) {
				return p1.getId().compareTo(p2.getId()) ;
			}
			
		});*/

		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}

	}

}
