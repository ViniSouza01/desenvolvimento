package ex1.b;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JPanel painel;
	JButton btn_enviar, limpar;
	JLabel labelNome, labelIdade, labelResultado;
	String resultado = "", faseDaVida;
	JTextArea areaResult;
	JTextField campoNome, campoIdade;
	int idade;

	Formulario() {
		setTitle("Entrada Processamento e Saida");
		setBounds(650, 300, 500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		labelNome = new JLabel("Nome: ");
		labelNome.setBounds(20, 50, 50, 30);
		painel.add(labelNome);

		labelIdade = new JLabel("Idade: ");
		labelIdade.setBounds(20, 80, 50, 30);
		painel.add(labelIdade);

		labelResultado = new JLabel("Resultado: ");
		labelResultado.setBounds(20, 110, 70, 30);
		painel.add(labelResultado);

		/* button to process the form */
		btn_enviar = new JButton("Processar");
		painel.add(btn_enviar);
		btn_enviar.setBounds(100, 290, 120, 50);
		btn_enviar.addActionListener(this);

		limpar = new JButton("Limpar");
		painel.add(limpar);
		limpar.setBounds(250, 290, 120, 50);
		limpar.addActionListener(this);

		campoNome = new JTextField();
		campoNome.setBounds(120, 50, 200, 30);
		painel.add(campoNome);

		campoIdade = new JTextField();
		campoIdade.setBounds(120, 80, 200, 30);
		painel.add(campoIdade);

		areaResult = new JTextArea();
		areaResult.setBounds(120, 115, 200, 80);
		painel.add(areaResult);
	}

	public static void main(String args[]) {
		System.out.println("Este programa esta funcionando");
		new Formulario().setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_enviar) {
			areaResult.setText(resultado);
			/* Age */
			resultado += campoNome.getText() + "\t";
			resultado += campoIdade.getText() + "\t";
			idade = Integer.parseInt(campoIdade.getText());
			if (idade < 10)
				faseDaVida = "Criança";
			else if (idade < 22)
				faseDaVida = "Jovem";
			else if (idade < 60)
				faseDaVida = "Adulto";
			else faseDaVida = "Idoso";
			
			areaResult.setText(campoNome.getText() + " - " + faseDaVida);
			
		}
		if(e.getSource() == limpar) {
			resultado = "";
			areaResult.setText(resultado);
		}
	}
}