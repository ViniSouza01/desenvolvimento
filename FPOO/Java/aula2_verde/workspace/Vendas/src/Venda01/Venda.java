package Venda01;

public class Venda {
	//attributes
	String produto;
	float preco;
	int quantidade;
	
	// it's a function, but as it's inside the class, it is named as class
	float subtotal() {
		return preco * quantidade;
	}
}