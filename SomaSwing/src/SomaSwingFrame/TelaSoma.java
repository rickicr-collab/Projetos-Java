package SomaSwingFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class TelaSoma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSoma frame = new TelaSoma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		txtN1.setBounds(87, 89, 49, 23);
		getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		txtN2.setBounds(181, 89, 49, 23);
		getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(147, 89, 24, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSoma = new JLabel("0");
		lblSoma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoma.setBounds(304, 89, 33, 23);
		getContentPane().add(lblSoma);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());	
				int s = n1 + n2;
				lblSoma.setText(Integer.toString(s));
			}
		});
		btnSoma.setBounds(245, 89, 49, 23);
		getContentPane().add(btnSoma);
		
		JTextArea txtrCalculadoraDeNumeros = new JTextArea();
		txtrCalculadoraDeNumeros.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 15));
		txtrCalculadoraDeNumeros.setText("Calculadora de numeros Simples ");
		txtrCalculadoraDeNumeros.setBounds(58, 31, 293, 22);
		getContentPane().add(txtrCalculadoraDeNumeros);
		
		JTextArea txtrCriadoPorRicardo = new JTextArea();
		txtrCriadoPorRicardo.setForeground(new Color(255, 255, 255));
		txtrCriadoPorRicardo.setBackground(new Color(255, 0, 0));
		txtrCriadoPorRicardo.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 15));
		txtrCriadoPorRicardo.setText("           Criado por Ricardo Rosendo");
		txtrCriadoPorRicardo.setBounds(58, 155, 279, 22);
		getContentPane().add(txtrCriadoPorRicardo);
	}
}
