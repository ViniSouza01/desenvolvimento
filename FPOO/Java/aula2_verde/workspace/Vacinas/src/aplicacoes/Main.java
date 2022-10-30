package aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Vacina> lista = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite quantas vacinas deseja cadastrar:");
		int quantidade = scan.nextInt();
		int indice, excluir, opcao = 0, alterar = 0;
		char continuar = 'N';

		
		System.out.println("Digite o nome do pet, do veterinario, nome da vacina e a data:"); // quantity of objects
		for(int i = 0; i < quantidade; i++) { // loop to complete the list with the informations
			lista.add(new Vacina(scan.next(), scan.next(), scan.next(), scan.next()));
		}
		System.out.printf("\n\n");
		System.out.println("Pet\t\t\tVeterinario\tVacina\t\tData\n");
			for(int i = 0; i < lista.size(); i++) { // return
				System.out.printf("[%d]: %s\n",i, lista.get(i));
			}
			do {
				do {
				
				System.out.println("[1] - Alterar algum indice\n[2] - Excluir algum indice\n[3] - Pesquisar Pet");
				opcao = scan.nextInt();
				}while(opcao <= 0 || opcao > 3);
		switch(opcao) {
		
		case 1: // change the info of some pet if the user want
			System.out.println("Digite o numero do indice que deseja alterar"); //choose which info-pet the user want to change
			indice = scan.nextInt();
			System.out.println("Digite o nome do pet, veterinario, vacina e a data:");
			lista.set(indice, new Vacina(scan.next(), scan.next(), scan.next(), scan.next())); // read the new info the user will write
			for(int i = 0; i < lista.size(); i++) {
				System.out.printf("[%d]: %s\n",i,lista.get(i)); //show to the user the list with info changed
			}
			
		case 2: 
			//System.out.println("Deseja excluir algum indice?\n[0. Nao]\t[1. Sim]");
			System.out.println("Digite o numero do indice que deseja exlcuir:");
			excluir = scan.nextInt();
			lista.remove(excluir);
		}
		System.out.println("Você deseja encerrar o programa?\nS ou N");
        continuar = scan.next().toUpperCase().charAt(0);
		}while(continuar != 'S');
	}
}
