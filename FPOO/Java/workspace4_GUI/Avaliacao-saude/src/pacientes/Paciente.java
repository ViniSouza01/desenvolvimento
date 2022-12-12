package pacientes;

import javax.swing.JOptionPane;

public class Paciente {
	// attributes
	 private String nome;
	 private float altura;
	 private float peso;
	 private float imc;

	Paciente(String nome, String altura, String peso) {
		this.nome = nome;
		try {
			this.altura = Float.parseFloat(altura);
			this.peso = Float.parseFloat(peso);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public float obterIMC() {
		imc = peso / (altura * altura);
		return imc;
	}
	public String obterDiagnostico() {
	if(imc < 16.0)
		return "Baixo peso (grau I)";
	else if(imc <= 16.99)
		return "Baixo peso (grau II)";
	else if(imc <= 18.49)
		return "Baixo peso (grau III)";
	else if(imc <= 24.99)
		return "Peso adequado";
	else if(imc <= 29.99)
		return "Sobrepeso";
	else if(imc <= 34.99)
		return "Obesidade (grau I)";
	else if(imc <= 39.99)
		return "Obesidade (grau II)";
	else return("Obesidade (grau III)");
	}
	
	public  String toString() {
		return String.format("%s - %.2fm - %.1fkg - IMC: %.2f - %s\n", nome, altura, peso, obterIMC(), obterDiagnostico());
	}
	
	public String toCSV() {
		return String.format("%s;%.2f;%.1f;IMC:%.2f;%s\n", nome, altura, peso, obterIMC(), obterDiagnostico());
	}
}