package funcionarios;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<Funcionario>list = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static String opcoes[] = { "1. = Cadastrar", "2. Listar todas", "3. Alterar", "4. Excluir", "5. Buscar por nome", "6. Buscar por matricula", "7. Buscar por nascimento", "8. Sair" };
	static int menu = 0;
	
	public static void itens(String[] itens) {
		for(String i : itens)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		while(menu != 8) {
			itens(opcoes);
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				criar();
				break;
				
			case 2:
				listar();
				break;
				
			case 3:
				alterar();
				break;
				
			case 4:
				excluir();
				break;
				
			case 5:
				buscarPorNome();
				break;
				
			case 6:
				buscarPorMatricula();
				break;
			}
		}
		
	}

}
