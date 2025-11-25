package arrayevetor;

public class Aluno {

	String nome;
	int nota;

	public Aluno(String nome, int nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public void mostrar() {
		System.out.println("Nome: " + nome + ", Nota: " + nota);
	}

}
