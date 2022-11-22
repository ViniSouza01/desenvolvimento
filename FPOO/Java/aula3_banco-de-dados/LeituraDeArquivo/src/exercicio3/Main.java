package exercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	static int contLinhas = 0;
	static BufferedReader br;
	static BufferedWriter bw;
	static String contColunas[];
	static String colunas[];
	static ArrayList<String> lista = new ArrayList();

	public static void main(String[] args) {

		int contLinhas = 0;
		int i = 0;
		float media = 0;
		float maiorValor = 0;
		float menorValor = 900000;
		float preco = 0;
		int maisCaro = 0;
		int maisBarato = 0;
		int maisVelho = 2022, maisNovo = 0;

		try {
			// read the required file
			br = new BufferedReader(new FileReader("./bd/dados2.txt"));
			String linha = br.readLine();
			contColunas = linha.split("	");
			while (linha != null) { // loop to complete the list
				colunas = linha.split("	");
				lista.add(linha);
				contLinhas++;
				linha = br.readLine();
				if (i > 0) {
					media = media + Float.parseFloat(colunas[2]);
					preco = Float.parseFloat(colunas[2]);
					int ano = Integer.parseInt(colunas[1]);
					if(preco > maiorValor) {
						maiorValor = preco;
						maisCaro = i;
					}
					if(preco < menorValor) {
						menorValor = preco;
						maisBarato = i;
					}
					if(ano > maisNovo) {
						maisNovo = i;
					}
					if(ano < maisVelho ) {
						maisVelho = i;
					}
				}
				i++;
			}
			br.close();
			// scroll the content to the user
			for (String l : lista)
				System.out.println(l);
				
			// calculate the average
			media = media / (lista.size() - 1);

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo " + e);
		}
		System.out.printf("O arquivo possui %d linhas e %d colunas\n", contLinhas, contColunas.length);
		System.out.printf("A media de custo de todos os veiculos e: R$%.2f\n", media);
		System.out.println("O veiculo mais caro e: " + lista.get(maisCaro));
		System.out.println("O veiculo mais barato e: " + lista.get(maisBarato));
		System.out.println("Veiculo mais novo: " + lista.get(maisNovo));
		System.out.println("Veiculo mais velho: " + lista.get(maisVelho));
		
		try {
			bw = new BufferedWriter(new FileWriter("./bd/relatorio.txt"));
			bw.write("Veiculos\tAno\tValor\n");
			for (String l : lista)
				System.out.println(l);
			bw.write(String.format("A media de valores dos veiculos e: %.2f\n", media));
			bw.write("O veiculo mais caro e: ");
			bw.write(lista.get(maisCaro) + "\n");
			bw.write("O veiculo mais barato e: ");
			bw.write(lista.get(maisBarato) + "\n");
			bw.write("O veiculo mais novo e: ");
			bw.write(lista.get(maisNovo) + "\n");
			bw.write("O veiculo mais velho e: ");
			bw.write(lista.get(maisVelho));
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever o arquivo " + e);
		}
	}
}