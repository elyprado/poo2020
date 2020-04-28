package poo.introducao.estacionamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//instancie 2 carros
		//atribua valor a todos os seus atributos
		//e imprima seus valores
		
		Carro c1 = new Carro();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o modelo: ");
		c1.modelo = input.nextLine();
		
		System.out.println("Digite a marca: ");
		c1.marca = input.nextLine();
		
		System.out.println("Digite a placa: ");
		c1.placa = input.nextLine();
		
		System.out.println("Digite o ano:");
		c1.ano = Integer.parseInt(input.nextLine());
		
		System.out.println("Digite a cor: ");
		c1.cor = input.nextLine();
		
		System.out.println("Digite o preço: ");
		c1.preco = Double.parseDouble(input.nextLine());
		
		c1.imprimir();
		//peça para o usuário digitar o percentual de entrada
		//e a quantidade de parcelas. imprima o valor da parcela
	}
	
	
}
