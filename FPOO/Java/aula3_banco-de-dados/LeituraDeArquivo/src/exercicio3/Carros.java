package exercicio3;

public class Carros {
	String veiculo;
	String ano;
	double valor;
	String valor1;
	
	public String toString(int i) {
		i = 0;
		if(i == 0)
		return String.format("%s\t%s\t%s", veiculo, ano, valor1);
		else return String.format("%s\t%s\t%.2f", veiculo, ano, valor);
	}
}
