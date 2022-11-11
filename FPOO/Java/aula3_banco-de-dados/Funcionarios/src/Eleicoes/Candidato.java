package Eleicoes;

public class Candidato {
	 int numero;
	private String nome;

	Candidato() {
	}

	Candidato(int numero, String nome) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
}
	
	public String toString() {
		return String.format("%s\t%d", nome, numero);
	}
}
