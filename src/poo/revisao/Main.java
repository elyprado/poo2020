package poo.revisao;

public class Main {
	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		p1.setNome("Pitolomeu");
		
		Aluno a1 = new Aluno();
		a1.setNome("José");
		a1.setNota1(80);
		a1.setNota2(50);
		a1.setFaltas(10);
		
		Aluno a2 = new Aluno();
		a2.setNome("Maria");
		a2.setNota1(100);
		a2.setNota2(80);
		a2.setFaltas(8);
		
		Aluno a3 = new Aluno();
		a3.setNome("João");
		a3.setNota1(80);
		a3.setNota2(90);
		a3.setFaltas(30);
		
		Aluno a4 = new Aluno();
		a4.setNome("Pedro");
		a4.setNota1(90);
		a4.setNota2(80);
		a4.setFaltas(4);
		
		Curso c1 = new Curso();
		c1.setNome("Filosofia");
		
		//associação entre objetos
		c1.getProfessores().add(p1);
		p1.setCurso(c1);
		
		
		c1.getAlunos().add(a1);
		a1.setCurso(c1);
		
		c1.getAlunos().add(a2);
		a2.setCurso(c1);
		
		c1.getAlunos().add(a3);
		a3.setCurso(c1);

		c1.getAlunos().add(a4);
		a4.setCurso(c1);

		//imprimir os alunos aprovados no curso de filosofia
		System.out.println("ALUNOS APROVADOS: ");
		for (Aluno a: c1.getAlunos()) {
			if (a.isAprovado()) {
				a.imprimir();
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("ALUNOS REPROVADOS: ");
		for (Aluno a: c1.getAlunos()) {
			if (! a.isAprovado()) {
				a.imprimir();
			}
		}
		
		
	}
}
