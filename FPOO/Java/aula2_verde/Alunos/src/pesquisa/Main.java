package pesquisa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		int interessados;
		
		//ask how much people you want to register
		System.out.println("Quantas pessoas interessadas deseja cadastrar?");
		interessados = scan.nextInt();
		
		//read the informations of people
		System.out.println("Digite o nome, o sobrenome e a idade da pessoa abaixo:");
		for(int i = 0; i < interessados; i++) {
			pessoa.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
		}
		
		//show the informations of each person and if the the person is a child, teen, adult or old
		for(Pessoa pessoas: pessoa) {
			System.out.println(pessoas);
		}
	}
}