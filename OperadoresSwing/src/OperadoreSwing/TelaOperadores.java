package OperadoreSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOperadores frame = new TelaOperadores();
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
	public TelaOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Numerador = new JLabel("Numerador");
		Numerador.setFont(new Font("Monospaced", Font.PLAIN, 13));
		Numerador.setHorizontalAlignment(SwingConstants.CENTER);
		Numerador.setBounds(20, 11, 89, 25);
		contentPane.add(Numerador);
		
		JLabel Denominador = new JLabel("Denominador");
		Denominador.setHorizontalAlignment(SwingConstants.CENTER);
		Denominador.setFont(new Font("Monospaced", Font.PLAIN, 13));
		Denominador.setBounds(20, 47, 96, 25);
		contentPane.add(Denominador);
		
		TextField txtDen = new TextField();
		txtDen.setBounds(119, 47, 89, 22);
		contentPane.add(txtDen);
		
		TextField txtNum = new TextField();
		txtNum.setBounds(119, 11, 89, 22);
		contentPane.add(txtNum);
		
		JLabel lblNewLabel_1 = new JLabel("Divisão");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(21, 153, 69, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Raiz");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(20, 202, 53, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setForeground(new Color(255, 0, 0));
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblRes.setBounds(132, 201, 38, 14);
		contentPane.add(lblRes);
		
		JLabel lblDiv = new JLabel("0");
		lblDiv.setForeground(new Color(255, 0, 0));
		lblDiv.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiv.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblDiv.setBounds(132, 157, 38, 14);
		contentPane.add(lblDiv);
		
		Button bntCalc = new Button("Calcular");
		bntCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getText());
				int den = Integer.parseInt(txtDen.getText());
				float div = num / den;
				float res = (float)Math.sqrt(num);
				lblDiv.setText(Float.toString(div));
				lblRes.setText(Float.toString(res));
			}
		});
		bntCalc.setFont(new Font("Monospaced", Font.PLAIN, 13));
		bntCalc.setBounds(20, 94, 110, 22);
		contentPane.add(bntCalc);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\calculadora.png"));
		lblNewLabel_3.setBounds(273, 11, 114, 95);
		contentPane.add(lblNewLabel_3);
		
		JTextArea txtrCalculadoraTeste = new JTextArea();
		txtrCalculadoraTeste.setText("   Calculadora Teste");
		txtrCalculadoraTeste.setBounds(236, 122, 188, 22);
		contentPane.add(txtrCalculadoraTeste);
		
		JLabel lblNewLabel_4 = new JLabel("Criado Por Ricardo Rosendo");
		lblNewLabel_4.setForeground(new Color(0, 0, 160));
		lblNewLabel_4.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(96, 226, 231, 24);
		contentPane.add(lblNewLabel_4);
		
	}
}
