package Venda02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Venda produtos[] = new Venda[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do produto, a quantidade comprada, a quantidade vendida, o preco da compra e o preco da venda:");
		for(int i = 0; i < 10; i++) {
			produtos[i] = new Venda();
			produtos[i].produtos = scan.next();
			produtos[i].qtdComprada = scan.nextInt();
			produtos[i].qtdVendida = scan.nextInt();
			produtos[i].precoCompra = scan.nextFloat();
			produtos[i].precoVenda = scan.nextFloat();
		}
		
		System.out.printf("Produto    \tInvestimento  \tFaturamento    \tLucro(R$)    \tLucro(%%)\n\n");
		for(int i = 0; i < 10; i++) {
			System.out.println(produtos[i].toString());
		}
	}

}
