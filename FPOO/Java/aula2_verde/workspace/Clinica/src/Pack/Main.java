package Pack;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt","BR"));
		Scanner scan = new Scanner(System.in);
		Paciente pacientes[] = new Paciente[10]; // 10 objects of the class "Paciente"
		float totImc = 0, totPeso = 0, totAltura = 0;
		int maior = 0, menor = 0, magro = 0, obeso = 0;
		float max = 0, min = 1000, maisObesa = 0, thinner = 1000;
		//input
		System.out.println("Digite 10 nomes, peso e altura"); // incoming message
		for(int i = 0; i < 10; i++) { // loop to scan the array
			pacientes[i] = new Paciente(); // validate the object
			pacientes[i].nome = scan.next(); // put names on the patients
			pacientes[i].peso = scan.nextFloat(); // define a weight
			pacientes[i].altura = scan.nextFloat(); // define a height
		}
		//output
		for(int i = 0; i < 10; i++) {
			System.out.println(pacientes[i].toString());
			totImc += pacientes[i].imc();
			totPeso += pacientes[i].peso;
			totAltura += pacientes[i].altura;
		}
		
		//identify the smaller person
		for(int i = 0; i < 10; i++) {
			if(pacientes[i].altura < min) {
				min = pacientes[i].altura;
				menor = i;
		}
	}
		
		//identify the taller person
		for(int i = 0; i < 10; i++) {
			if(pacientes[i].altura > max) {
				max = pacientes[i].altura;
				maior = i;
		}
	}
		
		//identify the thinner person
				for(int i = 0; i < 10; i++) {
					if(pacientes[i].peso < thinner) {
						thinner = pacientes[i].peso;
						magro = i;
				}
			}
				
		//identify the fattest person
			for(int i = 0; i < 10; i++) {
				if(pacientes[i].peso > maisObesa) {
					maisObesa = pacientes[i].peso;
					obeso = i;
				}
			}
		float mediaImc = totImc / 10f;
		float mediaPeso = totPeso / 10f;
		float mediaAltura = totAltura / 10f;
		System.out.println("Estatísticas:");
		System.out.printf("Média IMC = %.2f\n",mediaImc);
		System.out.printf("Média Peso = %.2f\n",mediaPeso);
		System.out.printf("Média Altura = %.2f\n",mediaAltura);
		System.out.printf("Pessoa mais baixa: %s", pacientes[menor]);
		System.out.printf("Pessoa mais alta: %s", pacientes[maior]);
		System.out.printf("Pessoa mais magra: %s", pacientes[magro]);
		System.out.printf("Pessoa mais obesa: %s", pacientes[obeso]);
	}
}
