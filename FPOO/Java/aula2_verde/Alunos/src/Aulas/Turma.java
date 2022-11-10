package Aulas;

public class Turma {
	String nomeTurma;
	String periodo;
	String diaDaSemana;
	int numAlunos;
	int horasSemanais;
	float mensalidade;
	
	Turma(){}
	Turma(String nome, String periode, String dia, int alunos, int horas, float mensal){
		nomeTurma = nome;
		periodo = periode;
		diaDaSemana = dia;
		numAlunos = alunos;
		horasSemanais = horas;
		mensalidade = mensal;
	}
	
	public float faturamentoMensal() {
		return numAlunos * (mensalidade * horasSemanais);
	}
	
	public int faturamentoHora() {
		return numAlunos * horasSemanais;
	}
	
	public String toString() {
		return String.format("%s\t%.2f\t%d",nomeTurma, faturamentoMensal(), faturamentoHora());
	}
}
