package caua.dev.heranca;

public class Veiculo {

	private double valor = 0.0;
	protected String modelo = "";
	

	public Veiculo(String modelo, double valor) {
		this.modelo = modelo;
		this.valor = valor;
	}

	public void mover() {
		System.out.println(modelo + ": Veiculo está se movendo");
	}

	public void freiar() {
		System.out.println(modelo + " : veiculo está freiando");
	}

	public void ligar() {
		System.out.println(modelo + ": veiculo está ligado");
	}

	public void desligar() {
		System.out.println(modelo + " : veiculo está desligado");
	}
	
	
	public double getValor() {
		return valor;
	}

}
