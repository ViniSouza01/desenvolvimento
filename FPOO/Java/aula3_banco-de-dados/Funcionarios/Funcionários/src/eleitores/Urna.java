package eleitores;

public class Urna {
	String nome;
	int numeroEleitor;
	
	Urna(){}
	Urna(String nome, int numeroEleitor) {
		this.nome = nome;
		this.numeroEleitor = numeroEleitor;
	}
	
	public int getNumero() {
		return numeroEleitor;
	}
	
	public String toString() {
		return String.format("%d;%s\r\n", numeroEleitor, nome);
	}
}
