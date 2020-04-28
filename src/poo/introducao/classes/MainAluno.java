package poo.introducao.classes;

public class MainAluno {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Ze";
		a1.nota1 = 7;
		a1.nota2 = 9;
		a1.calcularMedia();
		
		System.out.println(a1.nome + " teve média de " 
						  + a1.media + " e foi " + a1.situacao());
		
	}
}
