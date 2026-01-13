package caua.dev.collections;

import java.util.ArrayList;
import java.util.List;

import caua.dev.composicao.Pedido;

public class Ex1 {
	
	public static void main(String[] args) {
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		pedidos.add(new Pedido("p1", "EFETUADO", 200.00));
		pedidos.add(new Pedido("p2", "CANCELADO", 150.00));
		pedidos.add(new Pedido("p3", "PAGO", 50.00));
		pedidos.add(new Pedido("p4", "ESTORNADO", 300.00));
		pedidos.add(new Pedido("p5", "ERRO", 85.00));
		pedidos.add(new Pedido("p6", "CANCELADO", 150.00));
		
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
		
		
		System.out.println("================================================");
		
		pedidos.removeIf(p -> "CANCELADO".equals(p.getStatus()));
		
		
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
		
		
	}

}
