package sangue;

public class Doador {
	private String nome;
	private int idade;
	private String sexo;
	private float peso;

	public Doador(String nome, int idade, String sexo, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
	}
	
	public String obterDiagnostico() {
		if(peso >= 50) {
			if(idade >= 18 && idade <= 69)
				return "Você está apto a doar sangue";
			else return "Você precisa ter entre 18 e 69 anos para doar sangue";
		}else return "Você precisa pesar no mínimo 50kg para a doação";
			
	}

	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %s\nPeso: %.1f\nDiagnóstico: %s",
				nome, idade, sexo, peso, obterDiagnostico());
	}
}