package caua.dev.arrayevetor;

public class Aluno {

	String nome;
	int nota;
	String dataNascimento;
	
	

	public Aluno(String nome, int nota, String data) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.dataNascimento = data;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", nota=" + nota + ", dataNascimento=" + dataNascimento;
	}

}
