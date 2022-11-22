package exercicio4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	static BufferedReader br;
	static ArrayList<String> lista;
	static String vetor[];

	public static void main(String[] args) {
		lista = new ArrayList();
		try {
			br = new BufferedReader(new FileReader("./bd/eleicao.csv"));
			String linha = br.readLine();
			vetor = linha.split(";");
			while (linha != null) {
				lista.add(linha);
				linha = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Aquivo nao encontrado, " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo, " + e);
		}
	}

}
