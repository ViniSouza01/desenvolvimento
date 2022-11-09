package exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main1 {

	public static void main(String[] args) {
		Random r = new Random();
		String alunos[] = {"Juquinha","Joãozinho","Aninha","Flavinho"};
		float prova = r.nextFloat() * 10;
		float trabalho = r.nextFloat() * 10;
		float atividades = r.nextFloat() * 10;
		float media = (prova + trabalho + atividades) / 3;
		String saida = String.format("%s;%.1f;%.1f;%.1f;%.1f\r\n",
				alunos[r.nextInt(4)], prova, trabalho, atividades, media); // the return of the program
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./bd/Notas.csv",true)); // creates an archive .csv
			bw.write(saida);
			bw.close();
			System.out.println("Arquivo criado com sucesso"); // present a message to the user if the archive was created
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
