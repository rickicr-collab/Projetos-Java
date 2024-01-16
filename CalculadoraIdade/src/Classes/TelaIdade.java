package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNAsc = new JLabel("Ano de Nascimento");
		lblNAsc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNAsc.setBounds(10, 29, 119, 14);
		contentPane.add(lblNAsc);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(1500, 1500, 2025, 1));
		txtAN.setBounds(125, 27, 66, 20);
		contentPane.add(txtAN);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setLabelFor(lblIdade);
		lblIdade.setForeground(new Color(255, 0, 0));
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(61, 135, 22, 14);
		contentPane.add(lblIdade);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2025 - an;
				lblIdade.setText(Integer.toString(id));
			}
		});
		btnCalc.setBackground(SystemColor.activeCaptionBorder);
		btnCalc.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\calculadora.png"));
		btnCalc.setBounds(45, 69, 128, 40);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 134, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel ImgDemo = new JLabel("Imagem");
		ImgDemo.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\usuario-icone.jpg"));
		ImgDemo.setBounds(212, 11, 222, 250);
		contentPane.add(ImgDemo);
	}
}
