package sangue;

import javax.swing.JOptionPane;

public class Doador {
	private String nome;
	private int idade;
	private char sexo;
	private float peso;

	public Doador(String nome, String idade, String sexo, String peso) {
		this.nome = nome;
		this.sexo = sexo.charAt(0);
		try {
			this.idade = Integer.parseInt(idade);
			this.peso = Float.parseFloat(peso);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
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