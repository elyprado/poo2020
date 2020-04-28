package poo.encapsulamento;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.println("Digite o nome:");
		p.setNome( sc.nextLine() );
		
		System.out.println("Digite a idade:");
		p.setIdade( Integer.parseInt(sc.nextLine()) );
		
		//imprimir os dados
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
	}
}
