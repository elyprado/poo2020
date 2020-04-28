package poo.modificadores.acesso;

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	
	//crie um atributo salário privado
	//crie um método alteraSalario capaz de receber um novo salario
	//que não pode ser menor do que 0 e nem maior do que 50000
	//crie outro metodo chamado aumentaSalario capaz de receber
	//um percentual que será aplicado como aumento para o salário
	
	public Pessoa(String novoNome) {
		nome = novoNome;
	}
	
	public void alteraSalario(double novoSalario) {
		if (novoSalario<0 || novoSalario>50000) {
			System.out.println("Salário inválido");
		} else {
			salario = novoSalario;
		}
	}
	public void aumentaSalario(double percentualAumento) {
		salario = salario + (salario * percentualAumento / 100);
	}
	
	public void fazAniversario() {
		idade++;
	}
	
	public void alteraIdade(int novaIdade) {
		if (novaIdade<0 || novaIdade > 200) {
			System.out.println("idade inválida");
		} else {
			idade = novaIdade;
		}
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
	}
	
}
