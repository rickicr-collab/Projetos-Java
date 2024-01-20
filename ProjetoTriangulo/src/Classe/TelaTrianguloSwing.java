package Classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTrianguloSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTrianguloSwing frame = new TelaTrianguloSwing();
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
	public TelaTrianguloSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("B");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(505, 97, 33, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("C");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(450, 213, 33, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(398, 97, 27, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblA = new JLabel("0");
		lblA.setForeground(new Color(255, 0, 0));
		lblA.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(255, 42, 33, 22);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("0");
		lblB.setForeground(new Color(255, 0, 0));
		lblB.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(255, 68, 33, 22);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("0");
		lblC.setForeground(new Color(255, 0, 0));
		lblC.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(255, 94, 33, 22);
		contentPane.add(lblC);
		
		JSlider sliA = new JSlider();
		sliA.setMaximum(20);
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
			
		});
		sliA.setValue(0);
		sliA.setBounds(121, 50, 134, 14);
		contentPane.add(sliA);
		
		JSlider sliB = new JSlider();
		sliB.setMaximum(20);
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		sliB.setValue(0);
		sliB.setBounds(121, 76, 134, 14);
		contentPane.add(sliB);
		
		JSlider sliC = new JSlider();
		sliC.setMaximum(20);
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		sliC.setBounds(121, 102, 134, 14);
		contentPane.add(sliC);
		
		JLabel lblNewLabel = new JLabel("Segmento a");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 50, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segmento b");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 76, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Segmento c");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 102, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panVisual = new JPanel();
		panVisual.setBounds(0, 252, 577, 153);
		contentPane.add(panVisual);
		panVisual.setLayout(null);
		panVisual.setVisible(false);
		
		JLabel lblResultado = new JLabel("Forma ou Não ?");
		lblResultado.setForeground(new Color(0, 0, 160));
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(6, 67, 569, 34);
		panVisual.add(lblResultado);
		
		JLabel lblTipo = new JLabel("Tipo de Triangulo ");
		lblTipo.setForeground(new Color(255, 0, 128));
		lblTipo.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(10, 113, 559, 34);
		panVisual.add(lblTipo);
		
		JLabel lblTitulo = new JLabel("Verificador de Triangulos ");
		lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(135, 12, 318, 43);
		panVisual.add(lblTitulo);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\Curso em video Java Basico\\Imagens curos em video\\Projeto Tela Triangulo\\triangulo(1).png"));
		lblNewLabel_3.setBounds(352, 12, 225, 228);
		contentPane.add(lblNewLabel_3);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panVisual.setVisible(true);
				int anguloa = sliA.getValue();
				int angulob = sliB.getValue();
				int anguloc = sliC.getValue();
				if(angulob < anguloa + anguloc && anguloa < angulob + anguloc && anguloc < anguloa + angulob) {
					lblResultado.setText(" Forma um triangulo !");
					if(anguloa == angulob && angulob == anguloc) {
						lblTipo.setText("TIpo Triangulo Equilátero");
					}else if(anguloa != angulob && angulob != anguloc && anguloa != anguloc ) {
						lblTipo.setText("Tipo de Triangulo Escaleno");
					}else {
						lblTipo.setText("Tipo de Triangulo Isosceles ");
					}
				}else {
					lblResultado.setText(" Não forma um Triangulo !");
					lblTipo.setText(" ---- ");
				}
			}
		});
		btnVerificar.setFont(new Font("Monospaced", Font.BOLD, 17));
		btnVerificar.setBounds(89, 157, 149, 37);
		contentPane.add(btnVerificar);
	}
}
