package Pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Diagnostico pacientes[] = new Diagnostico[10];
		pacientes[0] = new Diagnostico();
		pacientes[1] = new Diagnostico();
		pacientes[2] = new Diagnostico();
		pacientes[3] = new Diagnostico();
		pacientes[4] = new Diagnostico();
		pacientes[5] = new Diagnostico();
		pacientes[6] = new Diagnostico();
		pacientes[7] = new Diagnostico();
		pacientes[8] = new Diagnostico();
		pacientes[9] = new Diagnostico();
		
		for(int i = 0; i < 10; i++) {
		System.out.println(pacientes[i].toString());
		}	
	}
}