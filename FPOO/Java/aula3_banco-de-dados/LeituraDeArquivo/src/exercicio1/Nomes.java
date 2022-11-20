package exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nomes {
	static BufferedReader br;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("./banco-de-dados/dados.txt"));
			String linha = br.readLine();
			while (linha != null) {
				String vetor[] = linha.split(linha);
				System.out.println(vetor);
				linha = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nao foi possivel localizar o arquivo, erro: " + e);
		} catch (IOException e) {
			System.out.println("Nao foi possivel ler o arquivo, erro: " + e);
		}
	}
}
