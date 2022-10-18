package Venda;

public class Venda {
	String produto;
	int quantidade;
	float precos;
}

public float subtotal() {
	return precos * quantidade;
}

public String toString() {
	return String.format("%s  \t%");
}