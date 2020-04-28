package poo.associacao3;

import java.util.LinkedList;

public class Crianca {
	private String nome;
	private LinkedList<Responsavel> responsaveis = new LinkedList<Responsavel>();
	
	public Crianca(String nome) {
		this.nome = nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public LinkedList<Responsavel> getResponsaveis() {
		return responsaveis;
	}
	public void setResponsaveis(LinkedList<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}
	
	public void imprimir() {
		System.out.println("Criança: " + nome);
	}
}
