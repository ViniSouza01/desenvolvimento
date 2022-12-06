package sangue;

public class Doador {
	private String nome;
	private int idade;
	private char sexo;
	private float peso;
	
	public Doador(String nome, String idade, char sexo, String peso){
		this.nome = nome;
		this.sexo = sexo;
		try {
			this.idade = Integer.parseInt(idade);
			this.peso = Float.parseFloat(peso);
		} catch (Exception e) {
			System.out.println("Ops, algo deu errado");
		}
	}
	
	public String toString() {
		return String.format("%s\t");
	}
}