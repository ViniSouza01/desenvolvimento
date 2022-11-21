package exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static int contLinhas = 0;
	static BufferedReader br;
	static String contColunas[];
	static int colunas = 0;
	public static void main(String[] args) {

		double preco = 0;
		double maiorValor = 0;
		float media = 0;
		int i = 0;

		try {
			br = new BufferedReader(new FileReader("./bd/dados2.txt"));
			String linha = br.readLine();
			String contColunas[] = linha.split("	");
			while (linha != null) {
				String espaco[] = linha.split("	");
				System.out.println(espaco[0] + "\t" + espaco[1] + "\t" + espaco[2]);
				contLinhas++;
				linha = br.readLine();
				if (i != 0)
					media = media + Float.parseFloat(espaco[2]);
					preco = Double.parseDouble(espaco[2]);
					if(preco > maiorValor) {
						maiorValor = preco;
					}
				i++;
			}
			media = media / (i - 1);
			System.out.println("\n");
			br.close();
			System.out.printf("O programa possui %d linhas e %s colunas\n", contLinhas, contColunas.length);
			System.out.printf("A media de preco dos carros e R$%.2f\n", media);
			System.out.printf("O carro de maior valor custa %.2f\n", maiorValor);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo " + e);
		}
	}
}
