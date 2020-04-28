package poo.associacao2;

import java.util.LinkedList;

public class Cidade {
	private String nome;
	private String uf;
	private LinkedList<Pessoa> pessoas = new LinkedList<>(); 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getUf() {
		return uf;
	}
	
	public void setPessoas(LinkedList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public LinkedList<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void imprimeCidade() {
		System.out.println(nome + "/" + uf);
	}
	public void imprimePessoas() {
		for (int i=0; i<pessoas.size(); i++) {
			System.out.print(i+"-");
			pessoas.get(i).imprimePessoa();
		}
	}
	
	
}
