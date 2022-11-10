package funcionarios;

import java.util.Calendar;

public class Funcionario {
	int matricula;
	String nome;
	Calendar nascimento;
	
	void funcionario(){}
	void funcionario(int matricula, String nome, Calendar nascimento) {
		this.matricula = matricula;
		this.nascimento = nascimento;
		this.nome = nome;
	}
	
}
