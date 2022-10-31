package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Venda;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Venda> vendas = new ArrayList<>();
	static int menu = 0;

	public static void main(String[] args) {

		while (menu != 5) {
			System.out.println("1.Cadastrar venda");
			System.out.println("2.Consultar venda");
			System.out.println("3.Alterar venda");
			System.out.println("4.Excluir venda");
			System.out.println("5.Terminar programa");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Produto\tQuantidade\tPreco");
				create();
				break;
			case 2:
				System.out.println("Produto\tQuantidade\tPreco\tSubTotal:");
				read();
				break;
			case 3:
				System.out.println("Digite qual o indice que deseja alterar:");
				update(scan.nextInt());
				break;
			case 4:
				System.out.println("Digite qual o indice que deseja excluir:");
				delete(scan.nextInt());
				break;
			case 5:
				break;
			default:
				System.out.println("Opcao invalida\n");
				break;
			}
		}
		System.out.println("Programa encerrado.");
	}

	public static void create() {
		Venda v = new Venda();
		v.setProduto(scan.next());
		v.setQuantidade(scan.nextInt());
		v.setPreco(scan.nextFloat());
		vendas.add(v);
	}

	public static void read() {
		float total = 0;
		for(Venda v: vendas) {
			System.out.println(v.toString());
			total += v.subTotal();
		}
		System.out.printf("Total = %.2f\n",total);
	}

	public static void update(int indice) {
		if (indice >= 0 || indice <= vendas.size()) {
			System.out.println(vendas.get(indice).toString());
			Venda v = new Venda();
			v.setProduto(scan.next());
			v.setQuantidade(scan.nextInt());
			v.setPreco(scan.nextFloat());
			vendas.set(indice, v);
			System.out.println("Venda alterada");
		} else
			System.out.println("Item invalido");
	}

	public static void delete(int indice) {
		if (indice >= 0 || indice <= vendas.size()) {
			vendas.remove(indice);
			System.out.println("Venda excluida");
		} else
			System.out.println("Item invalido");
	}
}
