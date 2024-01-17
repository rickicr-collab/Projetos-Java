package OperadoreSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaValores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaValores frame = new TelaValores();
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
	public TelaValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField txtNum = new TextField();
		txtNum.setBounds(112, 10, 78, 22);
		contentPane.add(txtNum);
		
		TextField txtDen = new TextField();
		txtDen.setBounds(112, 57, 78, 22);
		contentPane.add(txtDen);
		
		Label label = new Label("Numerador");
		label.setForeground(new Color(0, 0, 0));
		label.setBackground(new Color(192, 192, 192));
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Monospaced", Font.PLAIN, 13));
		label.setBounds(10, 10, 92, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Denominador");
		label_1.setBackground(new Color(192, 192, 192));
		label_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(10, 57, 92, 22);
		contentPane.add(label_1);
		
		Label lblDiv = new Label("0");
		lblDiv.setForeground(new Color(255, 0, 0));
		lblDiv.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDiv.setAlignment(Label.CENTER);
		lblDiv.setBounds(139, 145, 51, 22);
		contentPane.add(lblDiv);
		
		Label lblResto = new Label("0");
		lblResto.setForeground(new Color(255, 0, 0));
		lblResto.setAlignment(Label.CENTER);
		lblResto.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblResto.setBounds(139, 183, 51, 22);
		contentPane.add(lblResto);
		
		
		Button btnDividir = new Button("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getText());
				int d = Integer.parseInt(txtDen.getText());
				float div = n / d;
				float res = n % d;
				lblDiv.setText(Float.toString(div));
				lblResto.setText(Float.toString(res));
				
				
			}
		});
		btnDividir.setForeground(new Color(64, 0, 64));
		btnDividir.setBackground(new Color(192, 192, 192));
		btnDividir.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		btnDividir.setBounds(38, 97, 87, 22);
		contentPane.add(btnDividir);
		
		Label label_2 = new Label("Divisão");
		label_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(10, 145, 92, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Resto");
		label_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(10, 183, 92, 22);
		contentPane.add(label_3);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\calculadora(1).png"));
		lblNewLabel.setBounds(231, 10, 181, 152);
		contentPane.add(lblNewLabel);
		
		TextField textField_2 = new TextField();
		textField_2.setBackground(new Color(128, 128, 128));
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textField_2.setText(" Calculadora de Divisão Criado por Ricardo Rosendo");
		textField_2.setBounds(10, 229, 414, 22);
		contentPane.add(textField_2);
	}
}
