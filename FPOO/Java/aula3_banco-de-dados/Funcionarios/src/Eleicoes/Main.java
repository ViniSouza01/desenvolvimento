package Eleicoes;

import java.io.BufferedWriter;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Candidato[] candidatos = { new Candidato(13, "Lula"), new Candidato(22, "Bolsonaro"),
			new Candidato(0, "Nulo"), new Candidato("Nulo"), };

	static BufferedWriter bw;
	static int menu = 0;

	public static String buscarCandidato() {
		String nome = "nulo";
		for (Candidato c : candidatos)
			if (c.getNumero() == numero)
				candidatos = c;
	}

	public static void main(String[] args) {
		System.out.println("Digite o numero do candidato ou 1 para branco:");
		System.out.println();
	}

}
