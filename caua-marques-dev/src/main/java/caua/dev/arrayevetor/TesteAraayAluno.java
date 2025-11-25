package caua.dev.arrayevetor;

public class TesteAraayAluno {
	
	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno("Ana", 20, "15/10/1985");
		alunos[1] = new Aluno("Bruno", 22, "15/10/1988");
		alunos[2] = new Aluno("Carlos", 99, "15/10/1985");
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
