/*
 * Lists
 * allow the soluction
 * 
 * */


package Lista;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String nomes[] = {"Ana", "Bruno", "Maria", "Marcos"};
		System.out.println("Comprimento do vetor = "+nomes.length );
		//It's not possible to add names in array in the middle of the program
		// but in a list, yes
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Roberto");
		lista.add("Maria");
		
		System.out.println("O comprimento da lista e: "+lista.size()); // show the size of list to the user
		System.out.println(lista); // show the contents (names) inside the list
		}
	}

