package aplicacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Vacina> lista = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int quantidade = 0;

	public static void main(String[] args) {
		int opcao = 0;
		while (opcao != 8) {
			System.out.println("\n[1] - Cadastrar vacina");
			System.out.println("[2] - Listar todas");
			System.out.println("[3] - Alterar dados");
			System.out.println("[4] - Excluir registro");
			System.out.println("[5] - Pesquisar por pet");
			System.out.println("[6] - Pesquisar por veterinario");
			System.out.println("[7] - Pesquisar por vacina");
			System.out.println("[8] - Finalizar programa");
			opcao = scan.nextInt();
			switch (opcao) {

			case 1:
				create();
				break;

			case 2:
				read();
				break;

			case 3:
				System.out.println("Digite o numero do indice que deseja exlcuir:");
				update(scan.nextInt());
				break;

			case 4:
				delete(opcao);
				break;

			case 5:
				pesqPet();
				break;

			case 6:
				pesqVeterinario(null);
				break;

			case 7:
				pesqVacina(null);
				break;
				
			case 8:
				break;
				
			default:
				System.out.println("Opcao invalida");
				break;
			}
		}
		System.out.println("Programa encerrado");
	}
	// crud

	public static void create() { // register a vaccine
		System.out.println("Digite quantas vacinas deseja cadastrar:");
		quantidade = scan.nextInt();
		System.out.println("\nDigite o nome do pet, do veterinario, da vacina e a data:");
		for (int i = 0; i < quantidade; i++) { // loop to complete the list with the informations
			lista.add(new Vacina(scan.next(), scan.next(), scan.next(), scan.next()));
		}
	}

	public static void read() {
		System.out.printf("\n\n");
		System.out.println("Pet\t\t\tVeterinario\tVacina\t\tData\n");
		for (int i = 0; i < lista.size(); i++) { // return
			System.out.printf("%d: %s\n", i, lista.get(i));
		}
	}

	public static void update(int indice) { // update an information
		if(indice >= 0 || indice <= lista.size()) {
		System.out.println(lista.get(indice).toString() + "\n");
		System.out.println("Digite o nome do pet, veterinario, vacina e a data:");
		lista.set(indice, new Vacina(scan.next(), scan.next(), scan.next(), scan.next())); // read the new info
		// the user will
		// write
		System.out.println("Alterado com sucesso!\n");
		} else System.out.println("Indice invalido");
	}

	public static void delete(int excluir) { // delete an object
		
		excluir = scan.nextInt();
		if(excluir >= 0 || excluir <= lista.size()) {
		System.out.println(lista.get(excluir).toString());
		lista.remove(excluir);
		System.out.println("Excluido com sucesso\n");
		}else { 
			System.out.println("Numero invalido");
		}
	}
	
	public static void pesqPet() {
		System.out.println("Digite o nome do pet a ser consultado:");
		String pesquisa = scan.next();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNomePet(pesquisa).contains(pesquisa)) {
				System.out.println(lista.get(i).toString());
			}
		}
	}
	
	public static void pesqVeterinario(String pesquisa) {
		System.out.println("Digite o nome do veterinario a ser consultado:");
		pesquisa = scan.next();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getVeterinario().contains(pesquisa)) {
				System.out.println(lista.get(i).toString());
			}
		}
	}
	
	public static void pesqVacina(String pesquisa) {
		System.out.println("Digite o nome da vacina a ser consultado:");
		pesquisa = scan.next();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNomeVacina().contains(pesquisa)) {
				System.out.println(lista.get(i).toString());
			}
		}
	}
}