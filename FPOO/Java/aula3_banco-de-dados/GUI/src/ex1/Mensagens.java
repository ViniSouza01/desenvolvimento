package ex1;

import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String args[]) {
		System.out.println("Teste");
		// input
		String texto = JOptionPane.showInputDialog("Digite seu nome completo:");
		// processing
		String nomes[] = texto.split(" ");
		texto = "Seu primeiro nome possui " + nomes[0].length() + " letras\n";
		texto += "Seu último nome possui " + nomes[nomes.length - 1].length() + " letras\n";
		if(nomes.length > 2) {
			texto += "Seu nome do meio possui " + nomes[1].length()+" letras";
		}else
			texto += "Você não possui nome do meio";
		// output
		JOptionPane.showMessageDialog(null, texto);
	}
}
