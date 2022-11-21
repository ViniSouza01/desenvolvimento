package exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static BufferedReader br;
	static int contLinha = 0;
	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./bd/dados1.txt"));
			String linha = br.readLine();
			
			while (linha != null) {
				String palavras[] = linha.split(" ");
				System.out.print(linha);
				System.out.print(" - Esta linha possui "  +palavras.length + " palavras");
				System.out.println(" e possui " + linha.length() + " letras");
				linha = br.readLine();
				contLinha++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo " + e);
		}
		System.out.println("\n");
		System.out.printf("O arquivo possui %d linhas", contLinha);
	}

}
