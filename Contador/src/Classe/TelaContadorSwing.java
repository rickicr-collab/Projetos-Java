package Classe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContadorSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContadorSwing frame = new TelaContadorSwing();
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
	public TelaContadorSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contagem");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 24, 77, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblContagem = new JLabel("");
		lblContagem.setFont(new Font("Monospaced", Font.PLAIN, 18));
		lblContagem.setBounds(97, 24, 240, 29);
		contentPane.add(lblContagem);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc = 0;
				String contagem = "";
				while(cc < 10) {
					contagem += (cc + 1) + " ";
					cc++;
				}
				lblContagem.setText(contagem);
			}
		});
		btnContar.setForeground(new Color(128, 0, 128));
		btnContar.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnContar.setBounds(97, 71, 123, 29);
		contentPane.add(btnContar);
	}
}
