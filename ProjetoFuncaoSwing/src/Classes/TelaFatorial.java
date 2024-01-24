package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

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
		setTitle("Gerador de Fatorial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(10, 34, 52, 20);
		contentPane.add(txtNum);
		
		JLabel lblFormula = new JLabel("Formula: ");
		lblFormula.setForeground(new Color(0, 0, 160));
		lblFormula.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormula.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblFormula.setBounds(10, 81, 170, 33);
		contentPane.add(lblFormula);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(255, 0, 0));
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblResultado.setBounds(190, 81, 63, 33);
		contentPane.add(lblResultado);
		
		JButton btnFator = new JButton("Fatorial !");
		btnFator.setForeground(new Color(128, 0, 128));
		btnFator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getValue().toString());
				Fatorial f = new Fatorial();
				f.setValor(n);
				lblFormula.setText(f.getFormula());
				lblResultado.setText(Integer.toString(f.getFatorial()));
				
			}
		});
		btnFator.setFont(new Font("Monospaced", Font.BOLD, 13));
		btnFator.setBounds(89, 32, 137, 23);
		contentPane.add(btnFator);
	}
}
