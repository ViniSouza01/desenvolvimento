package irrf;

public class Funcionario {
	String nome;
	float salario;

	Funcionario() {
	}

	Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public float irrf() {
			if(salario <= 1903.98)
				return 0;
			else if(salario <= 2826.65)
				return (salario * (float) 0.075) - (float) 142.80;
			else if(salario <= 3751.05)
				return salario * (float) 0.15 -(float) 354.80;
			else if(salario <= 4664.68)
				return salario * (float) 0.225 - (float) 636.13;
			else return (salario * (float) 0.275) - 869.36f;
			
		}

	public String toString() {
		return String.format("%s;%.2f;%.2f\r\n", nome, salario, irrf());
	}
}
