package Aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Turma> turmas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas turmas voce deseja cadastrar?");
		int quantos = scan.nextInt();
		
		System.out.println("Digite as informacoes logo abaixo:");
		for(int i = 0; i < quantos; i++) {
			turmas.add(new Turma(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextFloat()));
		}
		
		for(Turma turminha: turmas) {
			System.out.println(turminha);
		}
	}

}
