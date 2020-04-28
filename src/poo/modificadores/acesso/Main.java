package poo.modificadores.acesso;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome");
		Pessoa p = new Pessoa(sc.nextLine());
		
		
		p.alteraIdade(15);
		p.fazAniversario();
		p.fazAniversario();
		p.fazAniversario();
		
		p.alteraSalario(1500);
		p.aumentaSalario(20);
		
		
		p.imprimir();
		
	}
}
