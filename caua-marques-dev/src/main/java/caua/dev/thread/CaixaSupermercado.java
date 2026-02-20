package caua.dev.thread;

public class CaixaSupermercado {

	public static void main(String[] args) {

		/* Simulação de muitos caixas de supermecarcado atendendo ao mesmo tempo */
		/*
		 * QUantos mais caixas, mais rapido será o atendimento/processamento das filas
		 */
		/* Simulação com 200 itens na fila */

		Runnable caixa1 = () -> {
			for (int i = 0; i < 33; i++) {
				System.out.println("Caixa 1 atendendo o cliente: " + i);
				tempoProcessamento();
			}
		};
		
		Runnable caixa2 = () -> {
			for (int i = 0; i < 33; i++) {
				System.out.println("Caixa 2 atendendo o cliente: " + i);
				tempoProcessamento();
			}
		};
		
		Runnable caixa3 = () -> {
			for (int i = 0; i < 33; i++) {
				System.out.println("Caixa 3 atendendo o cliente: " + i);
				tempoProcessamento();
			}
		};
		
		
		Runnable caixa4 = () -> {
			for (int i = 0; i < 33; i++) {
				System.out.println("Caixa 4 atendendo o cliente: " + i);
				tempoProcessamento();
			}
		};
		
		
		Runnable caixa5 = () -> {
			for (int i = 0; i < 33; i++) {
				System.out.println("Caixa 5 atendendo o cliente: " + i);
				tempoProcessamento();
			}
		};
		
		
		Runnable caixa6 = () -> {
			for (int i = 0; i < 33; i++) {
				System.out.println("Caixa 6 atendendo o cliente: " + i);
				tempoProcessamento();
			}
		};
		
		
		new Thread(caixa1).start();
		new Thread(caixa2).start();
		new Thread(caixa3).start();
		new Thread(caixa4).start();
		new Thread(caixa5).start();
		new Thread(caixa6).start();
		
		System.out.println("Fim");

	}
	
	
	private static void tempoProcessamento()  {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
