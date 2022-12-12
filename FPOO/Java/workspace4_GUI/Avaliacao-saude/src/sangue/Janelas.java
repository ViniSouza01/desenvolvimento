package sangue;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janelas extends JFrame implements ActionListener{
	JPanel window;
	JButton enviar, limpar;
	JLabel lNome, lIdade, lSexo, lPeso, lResultado;
	JTextField fNome, fIdade, fSexo, fPeso;
	JTextArea resultado;
	
	Janelas() {
		setTitle("Doação de Sangue");
		setBounds(650,300,500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		window = new JPanel();
		setContentPane(window);
		setLayout(null);
		
		/* labels */
		lNome = new JLabel("Nome:");
		lNome.setBounds(20,10,50,50);
		window.add(lNome);
		
		lIdade = new JLabel("Idade:");
		lIdade.setBounds(20,40,50,50);
		window.add(lIdade);
		
		lSexo = new JLabel("Sexo:");
		lSexo.setBounds(20,70,50,50);
		window.add(lSexo);
		
		lPeso = new JLabel("Peso:");
		lPeso.setBounds(240,70,50,50);
		window.add(lPeso);
		
		lResultado = new JLabel("Resultado:");
		lResultado.setBounds(20,100,80,50);
		window.add(lResultado);
		
		/* texts fields */
		fNome = new JTextField();
		fNome.setBounds(80,20,400,30);
		window.add(fNome);
		
		fIdade = new JTextField();
		fIdade.setBounds(80,50,400,30);
		window.add(fIdade);
		
		fSexo = new JTextField();
		fSexo.setBounds(80,80,150,30);
		window.add(fSexo);
		
		fPeso = new JTextField();
		fPeso.setBounds(290,80,190,30);
		window.add(fPeso);
		
		/* buttons */
		enviar = new JButton("Enviar");
		enviar.setBounds(290,110,90,30);
		window.add(enviar);
		enviar.addActionListener(this);
		
		limpar = new JButton("Limpar");
		limpar.setBounds(390,110,90,30);
		window.add(limpar);
		limpar.addActionListener(this);
		
		/* text area */
		resultado = new JTextArea();
		resultado.setBounds(20,150,460,200);
		window.add(resultado);
	}

	public static void main(String[] args) {
		new Janelas().setVisible(true);
		System.out.println("in operation");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == enviar) {
			Doador pessoa = new Doador(fNome.getText(),fIdade.getText(),fSexo.getText(),fPeso.getText());
			resultado.setText(pessoa.toString());
		}
		if(e.getSource() == limpar) {
			resultado.setText("");
		}
	}
}
