package ricardocunha.olamundo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class OlaMundoJava extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoJava frame = new OlaMundoJava();
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
	public OlaMundoJava() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblMensagem = new JLabel("A mensagem Aparece aqui !");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblMensagem, 48, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblMensagem, -38, SpringLayout.EAST, contentPane);
		lblMensagem.setForeground(new Color(255, 32, 25));
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		contentPane.add(lblMensagem);
		
		JButton btnBotao = new JButton("Clique em Min");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBotao, 222, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBotao, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblMensagem, -89, SpringLayout.NORTH, btnBotao);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBotao, 152, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBotao, -148, SpringLayout.EAST, contentPane);
		contentPane.add(btnBotao);
		btnBotao.setMargin(new Insets(2, 21, 2, 14));
		btnBotao.setLocation(new Point(21, 0));
		btnBotao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Olá, Mundo!");
			}
		});
		btnBotao.setBorder(new CompoundBorder());
		btnBotao.setAlignmentY(10.0f);
		btnBotao.setAlignmentX(10.0f);
		btnBotao.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
	}

}



