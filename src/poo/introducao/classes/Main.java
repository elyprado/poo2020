package poo.introducao.classes;

public class Main {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "ze";
		p1.idade = 20;
		p1.telefone = "92992-2929";
		p1.cpf = "123.123.123-12";
		
		p2.nome = "Maria";
		p2.idade = 17;
		p2.telefone = "98828-9292";
		p2.cpf = "321.321.321-32";
		p2.fazerAniversario();
		p2.fazerAniversario();
		
		System.out.println(p1.nome + " tem " + p1.idade + " anos");
		System.out.println(p2.nome + " tem " + p2.idade + " anos");
	}
}
