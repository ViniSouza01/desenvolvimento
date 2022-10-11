package Pack;

public class Diagnostico {
	String nome;
	float peso;
	float altura;

float imc() {
	return peso / (altura * altura);
}
	String diagnosticos() {
		if (imc() < 16)
			return "Subpeso Severo";
		else if(imc() < 20)
			return "Subpeso";
		else if (imc() < 25)
			return "Normal";
		else if(imc() < 30)
			return("Sobrepeso")
	}
}
