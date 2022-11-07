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
import javax.swing.AbstractAction;
import javax.swing.Action;

public class teste {

	private JFrame frame;
	private JTextField c_nome;
	private final Action action = new SwingAction();
	private JButton btn_enviar;

	/**
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

	/**
	 * Create the application.
	 */
	public teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn_enviar = new JButton("botao_1");
		btn_enviar.setAction(action);
		btn_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(c_nome.getText());
			}
		});
		btn_enviar.setBounds(169, 113, 89, 23);
		frame.getContentPane().add(btn_enviar);
		
		c_nome = new JTextField();
		c_nome.setBounds(110, 82, 214, 20);
		frame.getContentPane().add(c_nome);
		c_nome.setColumns(10);
		
		JLabel label_nome = new JLabel("Nome:");
		label_nome.setBounds(66, 85, 46, 14);
		frame.getContentPane().add(label_nome);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
