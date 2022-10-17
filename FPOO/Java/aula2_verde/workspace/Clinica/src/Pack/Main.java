package Pack;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt","BR"));
		Scanner scan = new Scanner(System.in);
		Paciente pacientes[] = new Paciente[10]; //10 objects of the class "Paciente"
		float totImc = 0, totPeso = 0, totAltura = 0;
		//input
		System.out.println("Digite 10 nomes, peso e altura"); //Incoming message
		for(int i = 0; i < 10; i++) { //loop to feel the array
			pacientes[i] = new Paciente(); //create unique object
			pacientes[i].nome = scan.next();
			pacientes[i].peso = scan.nextFloat();
			pacientes[i].altura = scan.nextFloat();
		}
		//output
		for(int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
			totImc += pacientes[i].imc();
			totPeso += pacientes[i].peso;
			totAltura += pacientes[i].altura;
		}
		float mediaImc = totImc / 10f;
		float mediaPeso = totPeso / 10f;
		float mediaAltura = totAltura / 10f;
		System.out.println("Estatísticas:");
		System.out.printf("Média IMC = %.2f\n",mediaImc);
		System.out.printf("Média Peso = %.2f\n",mediaPeso);
		System.out.printf("Média Altura = %.2f\n",mediaAltura);
	}
}