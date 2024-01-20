package Classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class TelaFatorial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial frame = new TelaFatorial();
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
	public TelaFatorial() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("                                      Calculo de Fatorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 266);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("verifique aqui");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(27, 75, 128, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(" Fatorial !");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 47, 104, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\Projeto fatorial\\boneco explicando.png"));
		lblNewLabel.setBounds(10, 11, 208, 218);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("! = ");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(276, 47, 40, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblFat = new JLabel("1");
		lblFat.setForeground(new Color(255, 0, 0));
		lblFat.setHorizontalAlignment(SwingConstants.LEFT);
		lblFat.setFont(new Font("Dialog", Font.BOLD, 17));
		lblFat.setBounds(311, 47, 104, 28);
		contentPane.add(lblFat);
		
		JSpinner txtNumero = new JSpinner();
		txtNumero.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		txtNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numero = Integer.parseInt(txtNumero.getValue().toString());
				// PROGRAMANDO PARA CRIAR O FACTORIAL
				int fatorial = 1;
				int contador = numero;
				while(contador >= 1) {
					fatorial *= contador;
					contador--;
				}
				lblFat.setText(Integer.toString(fatorial));
				
			}
		});
		txtNumero.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtNumero.setBounds(228, 47, 52, 28);
		contentPane.add(txtNumero);
	}
}
