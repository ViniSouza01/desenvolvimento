package eleitores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Urna candidatos[] = { new Urna("Lula", 13), new Urna("Bolsonaro", 22), new Urna("Branco", 0) };

	static int menu = 0;
	static BufferedWriter bw;
	static Scanner scan = new Scanner(System.in);

	public static Urna buscarCandidato(int numero) {
		Urna candidato = new Urna("Nulo", numero);
		for (Urna c : candidatos) {
			if (c.getNumero() == numero) {
				candidato = c;
			}
		}
		return candidato;
	}
	public static void main(String[] args) {
		Urna voto = new Urna();
		while (menu != 1) {
			System.out.println("Digite o nome do candidato ou 0 para branco:");
			voto = buscarCandidato(scan.nextInt());
			System.out.println(voto);
			System.out.println("1. Confirmar, 0. Nao confirmar");
			menu = scan.nextInt();
		}
		try {
			bw = new BufferedWriter(new FileWriter("./banco-de-dados/eleicao.csv",true));
			bw.write(voto.toString());
			bw.close();
			System.out.println("Voto registrado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}