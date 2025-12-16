package caua.dev.heranca;

public class MainVeiculo {
	
	public static void main(String[] args) {
		
		Veiculo carro = new Carro("Monza",50.00);
		Veiculo moto = new Moto("Honda Biz", 10.00);
		
		
		
		System.out.println("--------------Carro----------------");
		
		carro.ligar();
		carro.mover();
		carro.freiar();
		carro.desligar();
		System.out.println(carro.getValor());
		
		System.out.println("---------------Moto---------------");
		
		moto.ligar();
		moto.mover();
		moto.freiar();
		moto.desligar();
		System.out.println(moto.getValor());

		
	}

}
