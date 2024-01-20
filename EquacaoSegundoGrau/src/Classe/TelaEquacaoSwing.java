package Classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEquacaoSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEquacaoSwing frame = new TelaEquacaoSwing();
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
	public TelaEquacaoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>&Delta = </html>");
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 99, 54, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(new Color(255, 0, 0));
		lblB.setFont(new Font("Monospaced", Font.BOLD, 24));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(115, 101, 46, 27);
		contentPane.add(lblB);
		
		JLabel lblpotencia = new JLabel("<html><sup>2</sup>-4.</html>");
		lblpotencia.setFont(new Font("Monospaced", Font.BOLD, 24));
		lblpotencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblpotencia.setBounds(144, 82, 54, 51);
		contentPane.add(lblpotencia);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(255, 0, 0));
		lblA.setFont(new Font("Monospaced", Font.BOLD, 24));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(185, 101, 46, 27);
		contentPane.add(lblA);
		
		JLabel lblNewLabel_4 = new JLabel(".");
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 24));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(208, 101, 46, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(255, 0, 0));
		lblC.setVerticalAlignment(SwingConstants.TOP);
		lblC.setFont(new Font("Monospaced", Font.BOLD, 24));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(233, 98, 46, 27);
		contentPane.add(lblC);
		
		
		JLabel lblNewLabel_1 = new JLabel("<html>X<sup>2</sup> + </html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(96, 34, 54, 23);
		contentPane.add(lblNewLabel_1);
		
		JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		txtB.setBounds(160, 41, 46, 23);
		contentPane.add(txtB);
		
		JLabel lblNewLabel_2 = new JLabel("X + ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(219, 39, 46, 23);
		contentPane.add(lblNewLabel_2);
		
		JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		txtC.setBounds(263, 42, 46, 22);
		contentPane.add(txtC);
		
		JLabel lblNewLabel_3 = new JLabel("= 0");
		lblNewLabel_3.setFont(new Font("Monospaced", Font.PLAIN, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(319, 41, 54, 18);
		contentPane.add(lblNewLabel_3);
		
		JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});
		txtA.setBounds(46, 41, 46, 23);
		contentPane.add(txtA);
		
		JPanel panVisual = new JPanel();
		panVisual.setBounds(12, 272, 481, 103);
		contentPane.add(panVisual);
		panVisual.setLayout(null);
		panVisual.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("<html>Valor de &Delta</html>");
		lblNewLabel_5.setForeground(new Color(128, 0, 64));
		lblNewLabel_5.setFont(new Font("Monospaced", Font.BOLD, 17));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(12, 12, 111, 21);
		panVisual.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tipos de Raizes");
		lblNewLabel_6.setForeground(new Color(128, 0, 64));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Monospaced", Font.BOLD, 17));
		lblNewLabel_6.setBounds(12, 59, 158, 31);
		panVisual.add(lblNewLabel_6);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(new Color(0, 0, 255));
		lblDelta.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblDelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelta.setBounds(374, 6, 95, 31);
		panVisual.add(lblDelta);
		
		JLabel lblRaiz = new JLabel("0");
		lblRaiz.setForeground(new Color(0, 0, 255));
		lblRaiz.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblRaiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaiz.setBounds(195, 58, 274, 31);
		panVisual.add(lblRaiz);
		
		JButton btnCalc = new JButton("<html>Calcular &Delta</html>");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panVisual.setVisible(true);
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				
				double d = Math.pow(b, 2) - 4 * a * c;
				lblDelta.setText(String.format("%.1f",d ));
				
				if (d < 0) {
					lblRaiz.setText("Não Existem Raizes Reais");
				}else {
					lblRaiz.setText("Existem Raizes Reais");
				}	
			}
		});
		btnCalc.setForeground(new Color(128, 0, 64));
		btnCalc.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnCalc.setBounds(139, 172, 158, 36);
		contentPane.add(btnCalc);
	}
}
