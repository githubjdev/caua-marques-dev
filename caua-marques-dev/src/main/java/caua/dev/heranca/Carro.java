package caua.dev.heranca;

public class Carro extends Veiculo {

	public Carro(String modelo, double valor) {
		super(modelo, valor);
	}
	
	
	@Override
	public void mover() {
		System.out.println(modelo + " está correndo na rodovia.");
	}
	
	
	
	

	

}
