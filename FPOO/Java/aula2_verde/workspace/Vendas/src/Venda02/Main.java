package Venda02;

public class Main {

	public static void main(String[] args) {
		Venda vendas[] = new Venda[10];
		vendas[0] = new Venda();
		vendas[0].produto = "Camiseta";
		vendas[0].preco = 19.9f;
		vendas[0].quantidade = 1;
		
		vendas[1] = new Venda();
		vendas[1].produto = "Bermuda";
		vendas[1].preco = 30.5f;
		vendas[1].quantidade = 3;
		
		vendas[2] = new Venda();
		vendas[2].produto = "Calças";
		vendas[2].preco = 22.9f;
		vendas[2].quantidade = 17;
		
		vendas[3] = new Venda();
		vendas[3].produto = "Boné";
		vendas[3].preco = 50.3f;
		vendas[3].quantidade = 4;
		
		vendas[4] = new Venda();
		vendas[4].produto = "Jaqueta";
		vendas[4].preco = 100.0f;
		vendas[4].quantidade = 20;
		
		vendas[5] = new Venda();
		vendas[5].produto = "Meias";
		vendas[5].preco = 10.0f;
		vendas[5].quantidade = 10;
		
		vendas[6] = new Venda();
		vendas[6].produto = "Tenis";
		vendas[6].preco = 44.9f;
		vendas[6].quantidade = 13;
		
		vendas[7] = new Venda();
		vendas[7].produto = "Shorts";
		vendas[7].preco = 22.5f;
		vendas[7].quantidade = 16;
		
		vendas[8] = new Venda();
		vendas[8].produto = "Chinelao";
		vendas[8].preco = 20.5f;
		vendas[8].quantidade = 5;
		
		vendas[9] = new Venda();
		vendas[9].produto = "Blusas";
		vendas[9].preco = 55.9f;
		vendas[9].quantidade = 7;
		
		//repetition
		for(int i = 0; i < 10; i++) {
			System.out.printf("%s    \t%.2f\t%d\t%.2f\n",vendas[i].produto, vendas[i].preco, vendas[i].quantidade, vendas[i].subtotal());
			
		}
		float total = vendas[0].subtotal() + vendas[1].subtotal() + vendas[2].subtotal() + vendas[3].subtotal() + vendas[4].subtotal() + vendas[5].subtotal() + vendas[6].subtotal() + vendas[7].subtotal() + vendas[8].subtotal() + vendas[9].subtotal();
		System.out.printf("[Total] [%.2f]",total);
	}

}