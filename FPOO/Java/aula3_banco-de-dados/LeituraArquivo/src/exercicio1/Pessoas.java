package exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pessoas {

	static BufferedReader br;

	public static void Main(String args[]) {
		try {
			String linha = br.readLine();
			while (linha != null) {
				br = new BufferedReader(new FileReader("./banco-de-dados/nomes.txt"));
				String vetor[] = linha.split(linha);
				System.out.println(vetor);
				linha = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nao foi possivel localizar o arquivo, erro " + e);
		} catch (IOException e) {
			System.out.println("Nao foi possivel ler o arquivo, erro " + e);
		}
	}
}
