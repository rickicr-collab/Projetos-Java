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
		setBounds(100, 100, 439, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(232, 232, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("De 1 a 12");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(34, 77, 111, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(" Fatorial !");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNewLabel_1.setBounds(24, 47, 121, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\Projeto fatorial\\boneco explicando.png"));
		lblNewLabel.setBounds(10, 11, 208, 218);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("! = ");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(268, 47, 40, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblFat = new JLabel("1");
		lblFat.setForeground(new Color(255, 0, 0));
		lblFat.setHorizontalAlignment(SwingConstants.LEFT);
		lblFat.setFont(new Font("Dialog", Font.BOLD, 18));
		lblFat.setBounds(300, 47, 121, 28);
		contentPane.add(lblFat);
		
		JLabel lblResultado = new JLabel("Esquema do Tutorial");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblResultado.setBounds(6, 262, 403, 72);
		contentPane.add(lblResultado);
		lblResultado.setVisible(false);
		
		JSpinner txtNumero = new JSpinner();
		txtNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblResultado.setVisible(true);
				int numero = Integer.parseInt(txtNumero.getValue().toString());
				int fatorial = 1;
				int contador = numero;
				
				// MOSTRANDO OS DETALHES DO FATORIAL 
				String detalhe = "";
				
				while(contador >= 1) {
					fatorial *= contador;
					detalhe += contador + "*";
					contador--;
					
				}
				lblFat.setText(Integer.toString(fatorial));
				lblResultado.setText(" N! = " + detalhe + " : " + fatorial);
			}
		});
		txtNumero.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		txtNumero.setBounds(230, 42, 40, 33);
		contentPane.add(txtNumero);
		
		JLabel lblNewLabel_4 = new JLabel("Detalhes do fatorial:");
		lblNewLabel_4.setForeground(new Color(0, 0, 160));
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewLabel_4.setBounds(6, 228, 319, 28);
		contentPane.add(lblNewLabel_4);
	}
}
