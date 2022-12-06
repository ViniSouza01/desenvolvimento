package pacientes;

public class Paciente {
	 private String nome;
	 private float altura;
	 private float peso;
	 private float imc;
	
	Paciente() {
	}

	Paciente(String nome, float altura, float peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
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
	
	public String toString() {
		return String.format("Nome: %s\nAltura: %.2fm\nPeso: %.1fkg\nIMC: %.2f\nDiagnóstico: %s", nome, altura, peso, obterIMC(), obterDiagnostico());
	}

}
