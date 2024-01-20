package Classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVoto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto frame = new TelaVoto();
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
	public TelaVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNasc = new JLabel("Ano de Nascimento");
		lblNasc.setHorizontalAlignment(SwingConstants.CENTER);
		lblNasc.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNasc.setBounds(10, 30, 155, 14);
		contentPane.add(lblNasc);
		
		TextField txtAno = new TextField();
		txtAno.setBounds(183, 22, 92, 22);
		contentPane.add(txtAno);
		
		JPanel panVisual = new JPanel();
		panVisual.setBackground(new Color(202, 255, 255));
		panVisual.setBounds(10, 123, 293, 143);
		contentPane.add(panVisual);
		panVisual.setLayout(null);
		panVisual.setVisible(false);
		
		JLabel lblAp = new JLabel("Dados Informativos Abaixo :");
		lblAp.setForeground(new Color(0, 0, 160));
		lblAp.setHorizontalAlignment(SwingConstants.CENTER);
		lblAp.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblAp.setBounds(0, 43, 238, 14);
		panVisual.add(lblAp);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblResultado.setForeground(new Color(0, 0, 160));
		lblResultado.setBounds(10, 117, 273, 14);
		panVisual.add(lblResultado);
		
		JLabel lblSistema = new JLabel("Sistema de Situação de voto");
		lblSistema.setBackground(new Color(255, 255, 0));
		lblSistema.setForeground(new Color(128, 0, 0));
		lblSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistema.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 14));
		lblSistema.setBounds(10, 11, 273, 20);
		panVisual.add(lblSistema);
		
		JLabel lblIdade = new JLabel("Idade: ");
		lblIdade.setForeground(new Color(0, 0, 160));
		lblIdade.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblIdade.setBounds(10, 78, 138, 16);
		panVisual.add(lblIdade);
		
		JButton btnVoto = new JButton("Posso Votar ?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panVisual.setVisible(true);
				int Nascimento = Integer.parseInt(txtAno.getText().toString());
				int idade = 2024 - Nascimento;
				lblIdade.setText("Idade : " + idade + " Anos");
				// TRABALHANDO COM ESTRUTURAS CONDICIONAIS E USANDO O ELSE IF
				if(idade < 16) {
					lblResultado.setText("Situação : Voto Proibido");
				}else if((idade >= 16 && idade < 18) || (idade > 70)) {
						lblResultado.setText("Situação: Voto Opcional");
					}else if(idade >= 70) {
						lblResultado.setText("Situação: Voto Obrigatório");
					}
				}
		});
		btnVoto.setBackground(new Color(192, 192, 192));
		btnVoto.setForeground(new Color(128, 0, 64));
		btnVoto.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 13));
		btnVoto.setBounds(65, 78, 153, 23);
		contentPane.add(btnVoto);
	}
}
