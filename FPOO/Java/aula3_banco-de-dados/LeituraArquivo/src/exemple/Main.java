package exemple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static BufferedReader br;

	public static void main(String[] args) {
		int i = 0;
		float total = 0;
		float caro = 0;
		double barato = 100000;
		float media = 0;
		
		try {
			br = new BufferedReader(new FileReader("./bd/dados.txt"));
			String line = br.readLine();
			while (line != null) {
				String array[] = line.split("-");
				System.out.println(array[0] + "\t" + array[1]);
				if(i != 0) {
					float preco = 0;
					preco = Float.parseFloat(array[1]);
					if(caro < preco) caro = preco;
					if(barato > preco) barato = preco;
					total += preco;
				}
				i++;
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado, erro: " + e);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo, erro: " + e);
		}
		System.out.printf("O produto mais caro e: %.2f\n", caro);
		System.out.printf("O produto mais barato e: %.2f\n", barato);
		System.out.printf("O total da compra e: %.2f\n", total);
		System.out.printf("A media do total da compra e: %.2f", total / i);
	}

}
