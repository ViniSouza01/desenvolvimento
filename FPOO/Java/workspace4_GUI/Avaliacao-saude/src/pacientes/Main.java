package pacientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JPanel painel;
	JButton enviar, limpar;
	JLabel nome, peso, altura, resultado;
	static String saida = "";
	JTextArea result;
	JTextField campoNome, campoPeso, campoAltura;
	
	Main() {
		setTitle("Avaliação de Saúde");
		setBounds(650, 300, 500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		/* Labels */
		nome = new JLabel("Nome:");
		nome.setBounds(20,10,50,30);
		painel.add(nome);
		
		altura = new JLabel("Altura:");
		altura.setBounds(20,40,50,30);
		painel.add(altura);
		
		peso = new JLabel("Peso:");
		peso.setBounds(20,70,50,30);
		painel.add(peso);
		
		resultado = new JLabel("Resultado:");
		painel.add(resultado);
		resultado.setBounds(20,110,70,30);
		
		
		
		/* Inputs */
		campoNome = new JTextField();
		campoNome.setBounds(70,10,350,30);
		painel.add(campoNome);
		
		campoAltura = new JTextField();
		campoAltura.setBounds(70,40,350,30);
		painel.add(campoAltura);
		
		campoPeso = new JTextField();
		campoPeso.setBounds(70,70,350,30);
		painel.add(campoPeso);
		
		/* Buttons */
		enviar = new JButton("Processar");
		painel.add(enviar);
		enviar.setBounds(320,110,100,25);
		enviar.addActionListener(this);
		
		limpar = new JButton("Limpar");
		painel.add(limpar);
		limpar.setBounds(200,110,100,25);
		limpar.addActionListener(this);
		
		/* JTextArea */
		result = new JTextArea();
		result.setBounds(20,150,400,200);
		painel.add(result);
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Programa em funcionamento");
		new Main().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enviar) {
			Paciente pessoas = new Paciente(campoNome.getText(), Float.parseFloat(campoAltura.getText()), Float.parseFloat(campoPeso.getText()));
			result.setText(pessoas.toString());
		}
		if(e.getSource() == limpar) {
			result.setText("");
		}
		
	}

}
