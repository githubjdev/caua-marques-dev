package caua.dev.ddd;

import java.math.BigDecimal;

public class PagamentoService {
	
	
	public void pagar(ContaCorrente origem, ContaCorrente destino, BigDecimal valor) {
		
		origem.debitar(valor);
		destino.depositar(valor);
		
	}

}
