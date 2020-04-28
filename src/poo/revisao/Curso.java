package poo.revisao;

import java.util.LinkedList;

public class Curso {
	private String nome;
	private LinkedList<Professor> professores = new LinkedList<Professor>();
	private LinkedList<Aluno> alunos = new LinkedList<Aluno>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setProfessores(LinkedList<Professor> professores) {
		this.professores = professores;
	}
	public LinkedList<Professor> getProfessores() {
		return professores;
	}
	
	public void setAlunos(LinkedList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public LinkedList<Aluno> getAlunos() {
		return alunos;
	}
	
}
