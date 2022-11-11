package fgts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static Funcionario funcionario = new Funcionario();

	public static void main(String[] args) {
		System.out.println("Digite o nome do funcionario e o seu salario");
		funcionario.nome = scan.next();
		funcionario.salario = scan.nextFloat();

		System.out.println("Nome \t Salario\tValor(FGTS)");
		System.out.println(funcionario.toString());

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./banco-de-dados/fgts.csv",true));
			bw.write(funcionario.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
