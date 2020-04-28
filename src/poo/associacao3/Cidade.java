package poo.associacao3;

import java.util.LinkedList;

public class Cidade {
	private String nome;
	private String estado;
	private LinkedList<Responsavel> responsaveis = new LinkedList<Responsavel>(); 
	
	public Cidade(String nome, String estado) {
		this.nome = nome;
		this.estado = estado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	public LinkedList<Responsavel> getResponsaveis() {
		return responsaveis;
	}
	public void setResponsaveis(LinkedList<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}
	
	public void imprimir() {
		System.out.println("Cidade: " + nome + " estado: " + estado);
	}
	
}
