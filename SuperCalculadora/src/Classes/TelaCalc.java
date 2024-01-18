package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class TelaCalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalc frame = new TelaCalc();
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
	public TelaCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 164, 261, 153);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resto da divisão por 2");
		lblNewLabel.setBounds(10, 22, 185, 14);
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 13));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elevado ao Cubo");
		lblNewLabel_1.setBounds(10, 47, 131, 14);
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 13));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Raiz Quadrada");
		lblNewLabel_2.setBounds(10, 72, 131, 14);
		lblNewLabel_2.setForeground(new Color(128, 0, 64));
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 13));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz Cúbica");
		lblNewLabel_3.setBounds(10, 97, 131, 14);
		lblNewLabel_3.setForeground(new Color(128, 0, 64));
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 13));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Valor Absoluto");
		lblNewLabel_4.setBounds(10, 122, 131, 14);
		lblNewLabel_4.setForeground(new Color(128, 0, 64));
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 13));
		panel.add(lblNewLabel_4);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setBounds(205, 22, 46, 14);
		lblResto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResto.setHorizontalAlignment(SwingConstants.CENTER);
		lblResto.setForeground(new Color(0, 0, 160));
		panel.add(lblResto);
		
		JLabel lblCubo = new JLabel("0");
		lblCubo.setBounds(193, 47, 58, 14);
		lblCubo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCubo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCubo.setForeground(new Color(0, 0, 160));
		panel.add(lblCubo);
		
		JLabel lblRaizQ = new JLabel("0");
		lblRaizQ.setBounds(193, 72, 58, 14);
		lblRaizQ.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRaizQ.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaizQ.setForeground(new Color(0, 0, 160));
		panel.add(lblRaizQ);
		
		JLabel lblRaizC = new JLabel("0");
		lblRaizC.setBounds(193, 97, 58, 14);
		lblRaizC.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRaizC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaizC.setForeground(new Color(0, 0, 160));
		panel.add(lblRaizC);
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setBounds(193, 122, 58, 14);
		lblAbs.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAbs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbs.setForeground(new Color(0, 0, 160));
		panel.add(lblAbs);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setModel(new SpinnerNumberModel(1, -50, 50, 1));
		txtNum.setBounds(168, 120, 77, 20);
		contentPane.add(txtNum);
		
		JLabel lblNewLabel_10 = new JLabel("Informe um valor");
		lblNewLabel_10.setForeground(new Color(128, 0, 64));
		lblNewLabel_10.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNewLabel_10.setBounds(12, 123, 142, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.setForeground(new Color(128, 0, 64));
		btnCalc.setBackground(new Color(192, 192, 192));
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());
				
				// RESTO DA DIVISÃO POR 2
				int r = num % 2;
				lblResto.setText(Integer.toString(r));
				
				//ELEVADOR AO CUBO
				double c = Math.pow(num, 3);
				lblCubo.setText(Double.toString(c));
				
				//RAIZ QUADRADA
				double q = Math.sqrt(num);
				lblRaizQ.setText(String.format(" %.2f" , q)); // FORMATANDO COM A FUNÇÃO STRING.FORMAT
				
				//RAIZ CUBICA
				double rc = Math.cbrt(num);
				lblRaizC.setText(String.format(" %.2f" , rc));
				
				//VALOR ABSOLUTO
				int abs = Math.abs(num);
				lblAbs.setText(Integer.toString(abs));
				
				
				
				
				
				
			}
		});
		btnCalc.setFont(new Font("Monospaced", Font.BOLD, 12));
		btnCalc.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\calculator_3534.png"));
		btnCalc.setBounds(302, 70, 200, 47);
		contentPane.add(btnCalc);
		
		JLabel Imagem = new JLabel("");
		Imagem.setHorizontalAlignment(SwingConstants.CENTER);
		Imagem.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\calculadora(1).png"));
		Imagem.setBounds(313, 143, 200, 174);
		contentPane.add(Imagem);
		
		JTextArea txtrSuperCalculadora = new JTextArea();
		txtrSuperCalculadora.setBackground(new Color(255, 255, 0));
		txtrSuperCalculadora.setForeground(new Color(128, 0, 64));
		txtrSuperCalculadora.setWrapStyleWord(true);
		txtrSuperCalculadora.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 14));
		txtrSuperCalculadora.setText("           Super Calculadora ");
		txtrSuperCalculadora.setBounds(96, 12, 323, 25);
		contentPane.add(txtrSuperCalculadora);
	}
}
