package caua.dev.execao;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Erro não tratado na aplicação: " + e.getMessage());
		e.printStackTrace();

	}

}
