import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Checkbox;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class teste {

	private JFrame frame;
	private JTextField c_nome;
	private JButton btn_enviar;
	private JRadioButton bot_masc;
	private String idade = "";
	private String sexo = "";
	private String senha = "";
	private JPasswordField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste window = new teste();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 */
	public teste() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_enviar = new JButton("Cadastrar");
		btn_enviar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btn_enviar, "Seu nome é: "+ c_nome.getText() +"\n" + idade + "\nSeu sexo é: " + sexo, "Informações",JOptionPane.INFORMATION_MESSAGE);
				 confirm();
			}
		});
		btn_enviar.setBounds(192, 208, 89, 23);
		frame.getContentPane().add(btn_enviar);
		
		c_nome = new JTextField();
		c_nome.setBounds(124, 71, 214, 20);
		frame.getContentPane().add(c_nome);
		c_nome.setColumns(10);
		
		JLabel label_nome = new JLabel("Nome:");
		label_nome.setBounds(80, 74, 46, 14);
		frame.getContentPane().add(label_nome);
		
		bot_masc = new JRadioButton("Masculino");
		bot_masc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bot_masc.isSelected())
					sexo = "Masculino";
				else
					sexo = "Feminino";
			}
		});
		buttonGroup.add(bot_masc);
		bot_masc.setBounds(124, 155, 71, 23);
		frame.getContentPane().add(bot_masc);
		
		JRadioButton bot_fem = new JRadioButton("Feminino");
		buttonGroup.add(bot_fem);
		bot_fem.setBounds(197, 155, 67, 23);
		frame.getContentPane().add(bot_fem);
		
		JLabel lblNewLabel = new JLabel("Sexo:");
		lblNewLabel.setBounds(80, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chb_idade_1 = new JCheckBox("Maior de idade"); //checkbox
		chb_idade_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chb_idade_1.isSelected())
					idade = "Você é de maior";
				else
					idade = "Você é de menor";
			}
		});
		chb_idade_1.setBounds(124, 129, 97, 23);
		frame.getContentPane().add(chb_idade_1);
		
		password = new JPasswordField(); // password
		password.setBounds(124, 102, 214, 20);
		frame.getContentPane().add(password);
		senha = password.getText();
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(80, 105, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "SwingAction_2");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
	private void confirm() {
		if(c_nome.getText().equals("Vinicius") && password.getText().equals("hamster007") && sexo == "Masculino" && idade == "Você é de maior")
			JOptionPane.showMessageDialog(null, "Usuário correto");
		else
			JOptionPane.showMessageDialog(null, "Usuário incorreto");
	}
	
}
