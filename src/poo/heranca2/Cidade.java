package poo.heranca2;

import java.util.LinkedList;

public class Cidade {
	private String nome;
	private String uf;
	private LinkedList<Pessoa> pessoas = new LinkedList<Pessoa>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public LinkedList<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(LinkedList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
}
