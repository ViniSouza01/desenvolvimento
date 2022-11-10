package fgts;

public class Funcionario {
	String nome;
	float salario;
	
	public float fgts() {
		return salario * (float) 0.08;
	}
	
	 Funcionario(){}
	 Funcionario(String n, float s) {
		nome = n;
		salario = s;
	}
	
	public String toString() {
		return String.format("%s;%.2f;%.2f",nome, salario, fgts());
	}
}
