package poo.introducao.estacionamento;

public class Carro {
	//atributos
	String cor;
	String placa;
	int ano;
	String modelo;
	String marca;
	double preco;
	
	//método
	double calcularIPVA() {
		double ipva = 0;
		if (ano > 1980) {
			ipva = preco * 4 / 100;
		}
		
		return ipva;
	}
	
	//suponha que uma pessoa irá comprar o carro
	//pagando 30% de entrada e dividindo o restante
	//em 36 parcelas com um juros 'simples' mensal de 2.5%
	//crie um método que imprima o valor da parcela
	
	
	
	void imprimir() {
		System.out.println("Modelo: " + modelo
				+ "\n Marca: " + marca 
				+ "\n Placa: " + placa
				+ "\n Ano: " + ano 
				+ "\n Cor: " + cor
				+ "\n Preço: " + preco
				+ "\n IPVA: " + calcularIPVA());
	}
}
