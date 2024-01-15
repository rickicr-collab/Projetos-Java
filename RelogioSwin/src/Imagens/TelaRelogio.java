package Imagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaRelogio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Desktop\\calendar-icon\\calendar-icon-128x128.png"));
		lblNewLabel.setBounds(10, 11, 345, 148);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data e Horas Atuais ");
		lblNewLabel_1.setFont(UIManager.getFont("MenuItem.font"));
		lblNewLabel_1.setBounds(150, 46, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblhora = new JLabel("Clique no Botão ");
		lblhora.setForeground(new Color(128, 128, 128));
		lblhora.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 14));
		lblhora.setBounds(150, 71, 205, 14);
		contentPane.add(lblhora);
		
		JButton btnh = new JButton("Clique Aqui ");
		btnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lblhora.setText(relogio.toString());
				
			}
		});
		btnh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnh.setBounds(150, 96, 97, 23);
		contentPane.add(btnh);
	}
}
