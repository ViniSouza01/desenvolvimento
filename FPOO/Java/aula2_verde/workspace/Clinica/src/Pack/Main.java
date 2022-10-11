package Pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String pacientes[] = new String[10];
		float pesos[] = new float[10];
		float alturas[] = new float[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o nome do %d paciente:\n",i + 1);
			pacientes[i] = scan.next();
			System.out.printf("Agora digite o peso de %s:\n",pacientes[i]);
			pesos[i] = scan.nextFloat();
			System.out.printf("Agora digite a altura de %s:\n",pacientes[i]);
			alturas[i] = scan.nextFloat();
		}
		
	}
}