package poo.construtor;

public class Conta {
	String correntista;
	int numero;
	double saldo;
	double limite;
	
	public Conta() {
		limite = 100;
	}
	
	public void depositar(double quantidade) {
		saldo = saldo + quantidade;
	}
	public void sacar(double quantidade) {
		if (quantidade < saldo+limite) {
			saldo = saldo - quantidade;
		} else {
			System.out.println("Limite insuficiente");
		}
	}
	
	public void imprimir() {
		System.out.println("Correntista: " + correntista);
		System.out.println("Numero: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
	}
}
