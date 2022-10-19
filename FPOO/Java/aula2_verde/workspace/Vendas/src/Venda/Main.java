package Venda;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Venda produtos[] = new Venda[10];
		float totVendas = 0, media = 0;
		float maisBarato = 100000, maisCaro = 0;
		int caro = 0, barato = 0;
		System.out.println("Digite os nomes dos produtos, a quantidade e os precos");
		for(int i = 0; i < 10; i++) { //loop to fill the array
			produtos[i] = new Venda(); //validate the array
			produtos[i].produto = scan.next(); // scan the products names
			produtos[i].quantidade = scan.nextInt(); // scan the quantity of each product
			produtos[i].precos = scan.nextFloat(); // scan the products prices
			totVendas = totVendas + produtos[i].precos; // calculate the total of products prices
			media = totVendas / 10;
		}
		
		for(int i = 0; i < 10; i++) { // look for the cheapest product
			if(produtos[i].precos < maisBarato) {
				maisBarato = produtos[i].precos;
				barato = i;	
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(produtos[i].precos > maisCaro) {
				maisCaro = produtos[i].precos;
				caro = i;
			}
		}
		for(int i = 0; i < 10; i++) {	
			System.out.println(produtos[i].toString());
		}
		
			System.out.printf("O preço total dos produtos e de: %.2f\n",totVendas);
			System.out.printf("A media das vendas e de: %.2f\n",media);
			System.out.printf("O produto mais barato e: %s",produtos[barato].toString());
			System.out.printf("O produto mais caro e: %s\n",produtos[caro].toString());
	}
}
