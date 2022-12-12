package pacientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dao.PacienteDao;


public class Main extends JFrame implements ActionListener{
	ArrayList<String> lista = new ArrayList<>();
	private static final long serialVersionUID = 2L;
	JPanel painel;
	JButton enviar, limpar, listar;
	JLabel nome, peso, altura, resultado;
	static String saidaArquivo = "";
	PacienteDao pd = new PacienteDao();
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
		campoNome.setBounds(70,10,390,30);
		painel.add(campoNome);
		
		campoAltura = new JTextField();
		campoAltura.setBounds(70,40,390,30);
		painel.add(campoAltura);
		
		campoPeso = new JTextField();
		campoPeso.setBounds(70,70,390,30);
		painel.add(campoPeso);
		
		/* Buttons */
		enviar = new JButton("Processar");
		painel.add(enviar);
		enviar.setBounds(360,110,95,25);
		enviar.addActionListener(this);
		
		limpar = new JButton("Limpar");
		painel.add(limpar);
		limpar.setBounds(250,110,95,25);
		limpar.addActionListener(this);
		
		listar = new JButton("Listar");
		painel.add(listar);
		listar.setBounds(140,110,95,25);
		listar.addActionListener(this);
		
		/* JTextArea */
		result = new JTextArea();
		result.setBounds(20,150,440,200);
		painel.add(result);
	}
	
	public static void main(String[] args) {
		System.out.println("Programa em funcionamento");
		new Main().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enviar) {
		if(campoNome.getText().length() > 0 && campoAltura.getText().length() > 0 && campoPeso.getText().length() > 0) {
			Paciente pessoas = new Paciente(campoNome.getText(), campoAltura.getText(), campoPeso.getText());
			lista.add(pessoas.toString());
			saidaArquivo += pessoas.toCSV();
			result.setText(pessoas.toString());
			pd.salvar(saidaArquivo);
		}
		else
			JOptionPane.showMessageDialog(this, "Favor, preencher todos os campos");
		}
		if(e.getSource() == limpar) {
			result.setText("");
			campoNome.setText("");
			campoPeso.setText("");
			campoAltura.setText("");
		}
		if(e.getSource() == listar) {
			for(String l: lista)
				result.append(l);
		}
	}
}