package aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Vacina> lista = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite quantas vacinas deseja cadastrar:");
		int quantidade = scan.nextInt();
		
		System.out.println("Digite o nome do pet, do veterinario, nome da vacina e a data:"); // quantity of objects
		for(int i = 0; i < quantidade; i++) { // loop to complete the list with the informations
			lista.add(new Vacina(scan.next(), scan.next(), scan.next(), scan.next()));
		}
		System.out.printf("\n\n");
		System.out.println("Pet\t\tVeterinario\tVacina\t\tData\n");
			for(Vacina l: lista) { // return
				System.out.println(l.toString());
			}			
		int alterar = 0;
		do {
		System.out.println("Deseja alterar o indice de algum pet?\n[0. Nao] [1. Sim]");
		alterar = scan.nextInt();
		}while(alterar < 0 || alterar > 1);
		if(alterar == 1) {
			
		}else System.out.println("Deseja excluir o indice de algum pet?\n[0. Nao] [1. Sim]");
	}
}
