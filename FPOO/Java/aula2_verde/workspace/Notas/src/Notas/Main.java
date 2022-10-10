package Notas;

public class Main {
	
	public static void main(String[] args) {
		Boletim	boletins[] = new Boletim[5];
		
		boletins[0] = new Boletim("Marquinhos", 2.0f, 6.8f, 4.8f);
		boletins[1] = new Boletim("Mateuzinho", 8.4f, 10f, 1f);
		boletins[2] = new Boletim("Toninho", 9.5f, 7.4f, 8f);
		boletins[3] = new Boletim("Fernandinho", 8, 2.4f, 10);
		boletins[4] = new Boletim("Fabinho", 7, 6, 4);
		
		for(int i = 0; i < 5; i++) {
		System.out.println(boletins[i].toString());
		}

	}
}
