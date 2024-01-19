package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGenioSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenioSwing frame = new TelaGenioSwing();
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
	public TelaGenioSwing() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 482);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 160));
		contentPane.setBackground(new Color(236, 236, 234));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrase = new JLabel("Frase");
		lblFrase.setForeground(new Color(0, 0, 160));
		lblFrase.setFont(new Font("Monospaced", Font.BOLD, 17));
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBounds(155, 47, 202, 111);
		contentPane.add(lblFrase);
		lblFrase.setText("<html>Vou pensar em um numero entre <strong>1 e 5</strong> tente adivinhar!</html>");
		
		
		JLabel lblGenio = new JLabel("");
		lblGenio.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenio.setBounds(-3, 203, 169, 240);
		lblGenio.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\Projeto genio Advinhação\\Genio.png"));
		contentPane.add(lblGenio);
		
		JLabel lblBalao = new JLabel("");
		lblBalao.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\Projeto genio Advinhação\\Balão.png"));
		lblBalao.setBounds(138, 12, 254, 240);
		contentPane.add(lblBalao);
		
		JLabel lblNewLabel_3 = new JLabel("Valor para Palpite");
		lblNewLabel_3.setForeground(new Color(128, 0, 64));
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(164, 296, 160, 14);
		contentPane.add(lblNewLabel_3);
		
		JSpinner txtVal = new JSpinner();
		txtVal.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtVal.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		txtVal.setBounds(332, 293, 50, 20);
		contentPane.add(txtVal);
		
		JButton btnPalp = new JButton("Palpite");
		btnPalp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 5 + Math.random() * (6 - 1);
				int valor = (int)n;
				
				int num = Integer.parseInt(txtVal.getValue().toString());
				
				String f1 = "<html>Acertou!</html>";
				String f2 = "<html>ERROU! Eu pensei nesse valor: " + valor + "</html>";
				
				String res = (valor == num)? f1 : f2;
				lblFrase.setText(res);


				
				
			}
		});
		btnPalp.setForeground(new Color(128, 0, 64));
		btnPalp.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnPalp.setBounds(196, 334, 128, 34);
		contentPane.add(btnPalp);
	}

}
