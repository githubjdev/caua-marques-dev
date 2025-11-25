package arrayevetor;

public class TesteArrayObjetos {

	public static void main(String[] args) {
		
		
		   Aluno[] alunos = new Aluno[3];

	        alunos[0] = new Aluno("Ana", 20);
	        alunos[1] = new Aluno("Bruno", 22);
	        alunos[2] = new Aluno("Carlos", 19);

	        for (Aluno a : alunos) {
	            a.mostrar();
	        }

	}

}
