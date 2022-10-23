package Venda02;

public class Venda {
	String produtos;
	int qtdComprada, qtdVendida	;
	float precoCompra, precoVenda;

public float investimento() {
	return precoCompra * qtdComprada;
}

public float faturamento() {
	return precoVenda * qtdVendida;
}

public float lucrodin() {
	return faturamento() - investimento();
}

public int lucroporcent() {
	return (int) (faturamento() - investimento());
}

public String toString() {
	return String.format("%s  \tR$%.2f    \tR$%.2f    \tR$%.2f    \t%d%%", produtos, investimento(), faturamento(), lucrodin(), lucroporcent());
}
}