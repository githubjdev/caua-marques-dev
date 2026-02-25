package caua.dev.ddd;

import java.math.BigDecimal;

public class ContaCorrenteMain {
	
	 public static void main(String[] args) {
		
		 
		 ContaCorrente contaCorrente = new ContaCorrente("504544-40", 
				                       BigDecimal.valueOf(100), new Pessoa("Alex Fernando Egidio"));
		 
		 contaCorrente.debitar(BigDecimal.valueOf(10));
		 
		 System.out.println("Após debitar R$ 10: -> " + contaCorrente.getSaldo());
		 
		 contaCorrente.depositar(BigDecimal.valueOf(500));
		 
		 System.out.println("Após depositar R$ 500: ->  " + contaCorrente.getSaldo());
		 
		 
	}

}
