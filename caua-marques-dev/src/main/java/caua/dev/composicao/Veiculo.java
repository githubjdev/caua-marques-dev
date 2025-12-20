package caua.dev.composicao;

public class Veiculo {

	/* Composição */
	private Motor motor = new Motor();
	private boolean ligado = false;

	public void ligarCarro() {
		if (!ligado) { /* Desligado */
			motor.ligar();
			ligado = true;
		}
	}

	public void acelerar() {
		if (ligado) {
			motor.acelerar();
		}
	}

}
