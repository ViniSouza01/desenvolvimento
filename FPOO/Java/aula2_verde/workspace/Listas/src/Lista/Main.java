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
		lista.add("Antonio");
		lista.add("Maria");
		
		System.out.println("O comprimento da lista e: "+lista.size()); // show the size of list to the user
		System.out.println(lista); // show the contents (names) inside the list
		
		System.out.printf("\n\n");
		
		// loop "forEache" to loop through the list
		lista.add("Roberto Carlos"); //adding items on the list
		System.out.println("O comprimento da lista com mais um nome e: "+lista.size());
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		System.out.printf("\n\n");
		
		//removing items on the list
		lista.remove(1); // remove the 4th item from the list
		System.out.println("O comprimento da lista com o item 2 removido e: "+lista.size());
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.printf("\n\n");
		
		// change an element from the list
		lista.set(0, "Uellington");
		System.out.println("O comprimento da lista com o elemento 1 alterado e: "+lista.size());
		for(String list: lista)
			System.out.println(list);
		
		System.out.printf("\n\n");
		
		// delete all the list
		lista = new ArrayList<>();
		lista.add("Leticia");
		System.out.println("O comprimento da lista depois de excluída e com apenas 1 item e: "+lista.size());
		for(String list: lista)
		System.out.println(list);
		}
	}

