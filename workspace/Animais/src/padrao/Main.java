package padrao;

public class Main {

	public static void main(String[] args) {
		Gato gato1 = new Gato(); // object gato1
		Gato gato2 = new Gato(); // object gato2
		Gato gato3 = new Gato(); // object gato3
		Gato gato4 = new Gato(); // object gato4
		
		// set up attributes
		gato1.nome = "Gatão";
		gato1.raca = "Vira Lara";
		gato1.peso = 3.5f;
		
		// use method
		gato1.ronronar();
		gato1.miar();
	}

}