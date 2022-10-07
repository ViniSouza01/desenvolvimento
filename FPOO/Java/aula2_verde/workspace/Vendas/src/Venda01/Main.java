package Venda01;

public class Main {
	// instances of class Venda
	static Venda v1, v2, v3, v4;
	
	public static void main(String[] args) {
		// objects
		v1 = new Venda();
		v2 = new Venda();
		v3 = new Venda();
		v4 = new Venda();
		v1.produto = "Camiseta";
		v1.preco = 19.9f;
		v1.quantidade = 5;
		v2.produto = "Bermuda";
		v2.preco = 39.9f;
		v2.quantidade = 2;
		v3.produto = "Tenis";
		v3.preco = 60.4f;
		v3.quantidade = 3;
		v4.produto = "Meia";
		v4.preco = 10.0f;
		v4.quantidade = 5;
		System.out.println("Vendas");
		System.out.println("[Produto][Preco][Qtd.][Subtotal]");
		System.out.printf("[%s][%.2f][%d][%.2f]\n",v1.produto,v1.preco,v1.quantidade,v1.subtotal());
		System.out.printf("[%s][%.2f][%d][%.2f]\n",v2.produto,v2.preco,v2.quantidade,v2.subtotal());
		System.out.printf("[%s][%.2f][%d][%.2f]\n",v3.produto,v3.preco,v3.quantidade,v3.subtotal());
		System.out.printf("[%s][%.2f][%d][%.2f]\n",v4.produto,v4.preco,v4.quantidade,v4.subtotal());
		System.out.printf("[Total] [%.2f]", v1.subtotal() + v2.subtotal() + v3.subtotal() + v4.subtotal());
	}
}