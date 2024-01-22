package Classe;

import javax.swing.JOptionPane;
public class ExercicioRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int soma = 0;
		do {
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"<html>Informe um Número: <br><em>(valor 0 → para interromper)</em></html>"));
		soma += numero;
		}while(numero != 0);
		JOptionPane.showMessageDialog(null, "<html> - Resultado Final-<hr><br>Somátorio vale : " + soma + "</html>");
	}
}
