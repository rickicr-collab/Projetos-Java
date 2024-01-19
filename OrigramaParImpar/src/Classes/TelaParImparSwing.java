package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaParImparSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaParImparSwing frame = new TelaParImparSwing();
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
	public TelaParImparSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setForeground(new Color(0, 0, 160));
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 30, 74, 22);
		contentPane.add(lblNewLabel);
		
		TextField txtValor = new TextField();
		txtValor.setBounds(90, 30, 74, 22);
		contentPane.add(txtValor);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(128, 0, 64));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblResultado.setBounds(38, 150, 145, 14);
		contentPane.add(lblResultado);
		lblResultado.setVisible(false);
		
		JButton brnVerificar = new JButton("Verificar");
		brnVerificar.setForeground(new Color(128, 0, 64));
		brnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setVisible(true);
				
				int valor = Integer.parseInt(txtValor.getText());
				if (valor % 2 == 0) {
					lblResultado.setText("Numero é Par!");
				}else {
					lblResultado.setText("Numero é Impar!");
				}
			}
			});
		brnVerificar.setFont(new Font("Monospaced", Font.BOLD, 13));
		brnVerificar.setBounds(38, 82, 126, 33);
		contentPane.add(brnVerificar);
	}
}
