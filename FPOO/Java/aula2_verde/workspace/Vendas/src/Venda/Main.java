package Venda;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Venda produtos[] = new Venda[10];
		
		System.out.println("Digite os nomes dos produtos, a quantidade e os precos");
		for(int i = 0; i < 10; i++) { //loop to fill the array
			produtos[i] = new Venda();
			produtos[i].produto = scan.next();
			produtos[i].quantidade = scan.nextInt();
			produtos[i].precos = scan.nextFloat();
		}
		
	}

}
