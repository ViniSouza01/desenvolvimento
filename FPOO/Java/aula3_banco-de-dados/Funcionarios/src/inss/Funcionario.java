package inss;
	
public class Funcionario {
	String nome;
	float salario;
	
	Funcionario(){}
	Funcionario(String nome, float salario){
		this.nome = nome;
		this.salario = salario;
	}
		 public float inss() {
			if (salario <= 1212)
				return salario * (float) 0.075;
			else if(salario <= 2427.35)
				return salario * (float) 0.09;
			else if(salario <= 3641.03)
				return salario * (float) 0.12;
			else if(salario < 7087.22) 
				return salario * (float) 0.14;
			else return (float) 7087.22 * (float) 0.14;
		}
		 public String toString() {
			 return String.format("%s;%.2f;%.2f\r\n", nome, salario, inss());
		 }
	}
