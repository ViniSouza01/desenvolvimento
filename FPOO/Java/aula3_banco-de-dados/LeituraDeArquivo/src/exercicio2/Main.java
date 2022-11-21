package exercicio2;

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
		try {
			br = new BufferedReader(new FileReader("./bd/dados2.txt"));
			String linha = br.readLine();
			String contColunas[] = linha.split("	");
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
				contLinhas++;
			}
			System.out.println("\n");
			br.close();
			System.out.printf("O programa possui %d linhas e %s colunas", contLinhas, contColunas.length);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo " + e);
		}
	}
}
