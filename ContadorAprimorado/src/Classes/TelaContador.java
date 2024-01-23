package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;

public class TelaContador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList lstCont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContador frame = new TelaContador();
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
	public TelaContador() {
		setTitle("Contador ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInicio = new JLabel("0");
		lblInicio.setForeground(new Color(0, 0, 160));
		lblInicio.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setBounds(293, 31, 46, 14);
		contentPane.add(lblInicio);
		
		JLabel lblFim = new JLabel("6");
		lblFim.setForeground(new Color(0, 0, 160));
		lblFim.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblFim.setHorizontalAlignment(SwingConstants.CENTER);
		lblFim.setBounds(293, 56, 46, 14);
		contentPane.add(lblFim);
		
		JLabel lblPasso = new JLabel("1");
		lblPasso.setForeground(new Color(0, 0, 160));
		lblPasso.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblPasso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasso.setBounds(293, 81, 46, 14);
		contentPane.add(lblPasso);
		
		JSlider sliIni = new JSlider();
		sliIni.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i = sliIni.getValue();
				lblInicio.setText(Integer.toString((i)));
			}
		});
		sliIni.setValue(0);
		sliIni.setMaximum(5);
		sliIni.setBounds(83, 32, 200, 20);
		contentPane.add(sliIni);
		
		JSlider sliFim = new JSlider();
		sliFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int m = sliFim.getValue();
				lblFim.setText(Integer.toString(m));
			}
			
		});
		sliFim.setValue(6);
		sliFim.setMaximum(20);
		sliFim.setMinimum(6);
		sliFim.setBounds(83, 56, 200, 20);
		contentPane.add(sliFim);
		
		JSlider sliPasso = new JSlider();
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int p = sliPasso.getValue();
				lblPasso.setText(Integer.toString(p));
			}
		});
		sliPasso.setValue(1);
		sliPasso.setMinimum(1);
		sliPasso.setMaximum(4);
		sliPasso.setBounds(83, 81, 200, 20);
		contentPane.add(sliPasso);
		
		JLabel lblNewLabel_3 = new JLabel("Inicio");
		lblNewLabel_3.setForeground(new Color(128, 0, 64));
		lblNewLabel_3.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 36, 55, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fim");
		lblNewLabel_4.setForeground(new Color(128, 0, 64));
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 60, 55, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Passo");
		lblNewLabel_5.setForeground(new Color(128, 0, 64));
		lblNewLabel_5.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 85, 55, 16);
		contentPane.add(lblNewLabel_5);
		
		lstCont = new JList();
		lstCont.setLayoutOrientation(JList.VERTICAL_WRAP);
		lstCont.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstCont.setValueIsAdjusting(true);
		lstCont.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstCont.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lstCont.setBackground(new Color(233, 233, 233));
		lstCont.setBounds(249, 131, 182, 185);
		contentPane.add(lstCont);
		
		JButton btnNewButton = new JButton("Contar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lstCont.setVisible(true);
				int i = sliIni.getValue();
				int f = sliFim.getValue();
				int p = sliPasso.getValue();
				
				//UTILIZANDO A CLASSE ESPECIAL PARA LISTA DEFAULT LIST MODEL
				DefaultListModel lista = new DefaultListModel();	
					 
			
				for(int c = i; c <= f; c += p) {
					lista.addElement(" Nº:"+(c));
				}
				lstCont.setModel(lista);
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 16));
		btnNewButton.setBounds(58, 127, 134, 28);
		contentPane.add(btnNewButton);
	}
	public JList getLstCont() {
		return lstCont;
	}
}
