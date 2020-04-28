package poo.construtor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta c = new Conta();
		//peça para o usuário digitar o seu nome e o numero
		//da conta e depois imprima estes valores
		
		System.out.println("Digite o nome:");
		c.correntista = sc.nextLine();
		
		System.out.println("Digite o número da conta");
		c.numero = Integer.parseInt(sc.nextLine());
		
		//System.out.println("Digite o saldo da conta");
		//c.saldo = Double.parseDouble(sc.nextLine());
		
		c.depositar(1000);
		c.sacar(200);
		c.sacar(500);
		c.sacar(350);
		 
		
		c.imprimir();
		
	}
}
