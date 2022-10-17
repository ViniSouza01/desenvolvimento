package Pack;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Paciente pacientes[] = new Paciente[10]; //10 objects of the class "Paciente"
		System.out.println("Digite 10 nomes, peso e altura"); //Incoming message
		for(int i = 0; i < 10; i++) { //loop to feel the array
			pacientes[i] = new Paciente(); //create unique object
			pacientes[i].nome = scan.next();
			pacientes[i].peso = scan.nextFloat();
			pacientes[i].altura = scan.nextFloat();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
		}
	}
}