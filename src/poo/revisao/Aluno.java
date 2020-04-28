package poo.revisao;

public class Aluno {
	private String nome;
	private float nota1;
	private float nota2;
	private int faltas;
	private Curso curso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNota1(float nota1) {
		if (nota1>100) {
			System.out.println("nota inválida!");
		} else {
			this.nota1 = nota1;
		}
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNota2() {
		return nota2;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public int getFaltas() {
		return faltas;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	public float calculaMedia() {
		return (nota1+nota2)/2;
	}
	public boolean isAprovado() {
		if (calculaMedia()>=70 && faltas<20) {
			return true;
		} else {
			return false;
		}
	}
	private String situacao() {
		if (isAprovado()) {
			return "aprovado";
		} else {
			return "reprovado";
		}
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Nota1: " + nota1);
		System.out.println("Nota2: " + nota2);
		System.out.println("Faltas: " + faltas);
		System.out.println("Média: " + calculaMedia());
		System.out.println("Situação: " + situacao());
		
	}
}
