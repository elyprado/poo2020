package poo.associacao3;

import java.util.LinkedList;

public class Responsavel {
	private String nome;
	private String logradouro;
	private int numero;
	private String bairro;
	private LinkedList<Crianca> criancas = new LinkedList<Crianca>();
	private Cidade cidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public LinkedList<Crianca> getCriancas() {
		return criancas;
	}
	public void setCriancas(LinkedList<Crianca> criancas) {
		this.criancas = criancas;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public void imprimir() {
		System.out.println("Responsável: " + nome);
		System.out.println("Endereço: " + logradouro + " " + numero + " " + bairro);
	}
}
