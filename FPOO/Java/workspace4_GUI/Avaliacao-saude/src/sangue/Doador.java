package sangue;

public class Doador {
	private String nome;
	private int idade;
	private String sexo;
	private float peso;

	public Doador(String nome, String idade, String sexo, String peso) {
		this.nome = nome;
		this.sexo = sexo;
		try {
			this.idade = Integer.parseInt(idade);
			this.peso = Float.parseFloat(peso);	
		} catch (Exception e) {
			System.out.println("Ops, algo deu errado");
		}
	}
	
	public String obterDiagnostico() {
		if(peso == 50 && idade >= 18 || idade <= 69)
			return "Apto para doar sangue";
		else return "Inapto para doar sangue";
	}

	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %s\nPeso: %.1f\nDiagnóstico: %s",
				nome, idade, sexo, peso, obterDiagnostico());
	}

}