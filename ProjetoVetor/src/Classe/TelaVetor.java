package Classe;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TelaVetor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//CRIANDO UM VETOR USANDO CLASSE LISTA DEFAULT E ADICIONADO A BLIBLIOTECA 
	
	int vetor[] = new int[5];
	DefaultListModel lista = new DefaultListModel();
	int selecionado = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVetor frame = new TelaVetor();
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
	public TelaVetor() {
		setTitle("          Programa    -  Vetor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecionado = new JLabel("[0]");
		lblSelecionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecionado.setBounds(308, 28, 57, 16);
		contentPane.add(lblSelecionado);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(10, 26, 57, 20);
		contentPane.add(txtNum);
		
		JLabel lblNewLabel = new JLabel("Vetor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblNewLabel.setBounds(243, 29, 67, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(205, 54, 160, 218);
		contentPane.add(scrollPane);
		scrollPane.setVisible(false);
		
		JList lstVetor = new JList();
		lstVetor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecionado = lstVetor.getSelectedIndex();
				lblSelecionado.setText("[" + selecionado + "]");
			}
		});
		lstVetor.setModel(lista);
		scrollPane.setViewportView(lstVetor);
	
		
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 13));
		scrollPane.setColumnHeaderView(lblResultado);
		
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(true);
				vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
				// REMOVENDO ITENS DA LISTA
				lista.removeAllElements();
				
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnAdd.setFont(new Font("Monospaced", Font.BOLD, 13));
		btnAdd.setBounds(77, 23, 108, 26);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = 0;
				lista.removeAllElements();
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnRemove.setFont(new Font("Monospaced", Font.BOLD, 13));
		btnRemove.setBounds(77, 60, 108, 26);
		contentPane.add(btnRemove);
		
		JButton btnOrdem = new JButton("Ordenar");
		btnOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vetor);
				lista.removeAllElements();
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnOrdem.setFont(new Font("Monospaced", Font.BOLD, 13));
		btnOrdem.setBounds(77, 97, 108, 26);
		contentPane.add(btnOrdem);
	}
}
