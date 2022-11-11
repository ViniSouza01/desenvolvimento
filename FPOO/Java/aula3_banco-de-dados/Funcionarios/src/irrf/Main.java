package irrf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Funcionario pessoa = new Funcionario();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o nome do funcionario e o salario:");
		pessoa.nome = scan.next();
		pessoa.salario = scan.nextFloat();
		System.out.println(pessoa.toString());

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./banco-de-dados/irrf.csv", true));
			bw.write(pessoa.toString());
			bw.close();
			System.out.println("Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
