package poo.associacao3;

public class Main {
	/*Instancie objetos que sejam suficientes para implementar o seguinte cenário:
	Tio Patinhas e Donald são responsáveis pelas crianças Luizinho, Huguinho e Zezinho. 
	Donald mora na Rua dos Marinheiros, 300, no bairro Litoral na cidade de Patolândia, 
	no estado de Nova York. 
	Tio Patinhas mora em Patópolis, na Rua 11 de Setembro, número 2001, 
	no bairro Centro do estado da Califórnia.
	Após instanciar todos objetos. 
	Imprima os valores, acessando todos dados pelo objeto do responsável.*/
	
	//Tio Patinhas, Donald: responsáveis
	//Luizinho, Hugo e Ze: crianças
	//Patolandia, Patopolis: Cidade
	
	//Responsavel *  -  * Crianca
	//Responsavel *  -   1 Cidade
	
	public static void main(String[] args) {
		Responsavel pat = new Responsavel();
		pat.setNome("Tio Patinhas");
		pat.setLogradouro("Rua 11 de Setembro");
		pat.setNumero(2001);
		pat.setBairro("Centro");
		
		Responsavel don = new Responsavel();
		don.setNome("Donald");
		don.setLogradouro("Rua dos Marinheiros");
		don.setNumero(300);
		don.setBairro("Litoral");
	
		Crianca c1 = new Crianca("Zezinho");
		Crianca c2 = new Crianca("Luizinho");
		Crianca c3 = new Crianca("Huguinho");		

		Cidade cid1 = new Cidade("Patópolis", "Califórnia");
		Cidade cid2 = new Cidade("Patolândia", "Nova York");
		
		pat.getCriancas().add(c1);
		pat.getCriancas().add(c2);
		pat.getCriancas().add(c3);
		c1.getResponsaveis().add(pat);
		c2.getResponsaveis().add(pat);
		c3.getResponsaveis().add(pat);
		
		don.getCriancas().add(c1);
		don.getCriancas().add(c2);
		don.getCriancas().add(c3);
		c1.getResponsaveis().add(don);
		c2.getResponsaveis().add(don);
		c3.getResponsaveis().add(don);
		
		pat.setCidade(cid1);
		cid1.getResponsaveis().add(pat);
		
		don.setCidade(cid2);
		cid2.getResponsaveis().add(don);
		
		
		//imprimir objeto don
		don.imprimir();
		for (Crianca c : don.getCriancas()) {
			c.imprimir();
		}
		don.getCidade().imprimir();
		
		//imprimiir o objeto pat
		pat.imprimir();
		for (Crianca c : pat.getCriancas()) {
			c.imprimir();
		}
		pat.getCidade().imprimir();
		
		
		
		
	}
	
	
}
