package poo.heranca2;

public class Main {
	
	
	public static void main(String[] args) {
				
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Ze");
		pf.setCpf("123.123.123-12");
		pf.setEndereco("Rua X, 123");
		
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Microsoft");
		pj.setCnpj("12.123.939/0001-12");
		pj.setEndereco("Rua Y, 312");
		
		Cidade c = new Cidade();
		c.setNome("SS Paraiso");
		c.setUf("MG");
		
		c.getPessoas().add(pf);
		pf.setCidade(c);
		
		c.getPessoas().add(pj);
		pj.setCidade(c);
				
	}
}
