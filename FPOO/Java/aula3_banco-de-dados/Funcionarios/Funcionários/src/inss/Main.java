package inss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Funcionario2 funcionario = new Funcionario2();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o nome e o salario do funcionario:");
		funcionario.nome = scan.next();
		funcionario.salario = scan.nextFloat();

		System.out.println(funcionario.toString());

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./banco-de-dados/inss.csv", true));
			bw.write(funcionario.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}