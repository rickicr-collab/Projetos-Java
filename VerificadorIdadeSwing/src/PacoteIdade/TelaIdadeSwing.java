package PacoteIdade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaIdadeSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdadeSwing frame = new TelaIdadeSwing();
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
	public TelaIdadeSwing() {
		setBackground(new Color(128, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monospaced", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 88, 139, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 221, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situação");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 290, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		TextField txtAno = new TextField();
		txtAno.setBounds(163, 80, 65, 22);
		contentPane.add(txtAno);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(198, 221, 30, 14);
		contentPane.add(lblIdade);
		
		JLabel lblsituacao = new JLabel("<vazio>");
		lblsituacao.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 12));
		lblsituacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblsituacao.setBounds(105, 289, 123, 14);
		contentPane.add(lblsituacao);
		
		JButton btnCalc = new JButton("Calcular Idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2024 - ano;
				lblIdade.setText(Integer.toString(idade));
				String sit = ((idade >= 16 && idade < 18) || (idade > 70))? " É Opcional " : " Não é Opcional ";
				lblsituacao.setText(sit);
				
			}
		});
		btnCalc.setFont(new Font("Monospaced", Font.BOLD, 11));
		btnCalc.setBounds(70, 130, 139, 31);
		contentPane.add(btnCalc);
		
		JTextArea txtrSistemaDeVerificao = new JTextArea();
		txtrSistemaDeVerificao.setForeground(new Color(255, 255, 0));
		txtrSistemaDeVerificao.setBackground(new Color(128, 128, 255));
		txtrSistemaDeVerificao.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 14));
		txtrSistemaDeVerificao.setText("  Sistema de verificação para votação ");
		txtrSistemaDeVerificao.setBounds(73, 11, 321, 22);
		contentPane.add(txtrSistemaDeVerificao);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\voto.png"));
		lblNewLabel_3.setBounds(234, 44, 256, 260);
		contentPane.add(lblNewLabel_3);
	}
}
