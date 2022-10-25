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

public float lucroporcent() {
	return (float) (lucrodin() / (faturamento() * 0.01));
}

public String toString() {
	return String.format("%s  \tR$%.2f    \tR$%.2f    \tR$%.2f    \t%.1f%%", produtos, investimento(), faturamento(), lucrodin(), lucroporcent());
}
}