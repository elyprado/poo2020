package poo.introducao.classes;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	double media;
	
	void calcularMedia() {
		media = (nota1+nota2)/2;
	}
	
	String situacao() {
		if (media > 7) {
			return "aprovado";
		} else {
			return "reprovado";
		}
	}
	
}
