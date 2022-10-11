package Pack;

import java.util.Scanner;

public class Diagnostico {
	String[] pacientes;
	float[] pesos;
	float[] alturas;
}

float imc() {
	return pesos[i] / (alturas[i] * alturas[i]);
}

String nomes() {
	Scanner scan = new Scanner(System.in);
	for(int i = 0; i < 10; i++) {
		System.out.printf("Digite o nome do %d paciente",i+1);
		pacientes[i] = scan.next();
	}
}