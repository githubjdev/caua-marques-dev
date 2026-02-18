package caua.dev.execao;

public class MainGlobalError {

	public static void main(String[] args) {
		
		// Intercepta todas as exceções não tratadas
		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
		
		
		
		
		throw new RuntimeException("Erro de teste");

	}

}
