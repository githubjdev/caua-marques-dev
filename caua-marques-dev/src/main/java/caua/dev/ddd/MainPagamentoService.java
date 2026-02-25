package caua.dev.ddd;

import java.math.BigDecimal;

public class MainPagamentoService {
	
	public static void main(String[] args) {
		
		PagamentoService pagamentoService = new PagamentoService();
		
		
		ContaCorrente origem = new ContaCorrente("87877-77", BigDecimal.valueOf(500), new Pessoa("Alex"));
		ContaCorrente destino = new ContaCorrente("74477-11", BigDecimal.valueOf(100), new Pessoa("Caua"));
		pagamentoService.pagar(origem, destino, BigDecimal.valueOf(50));
		
		
		System.out.println("Conte origem Saldo: " + origem.getSaldo());
		System.out.println("Conte destino Saldo: " + destino.getSaldo());
		
	}

}
