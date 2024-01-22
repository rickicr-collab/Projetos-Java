package Classe;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExercicioRe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCICIO ADICIONAL PROPOSTO USANDO REPETICAO E BÇIBLIOTECA JOPTION
		// TRABALHANDO COM POPUPS DE INFORMACOES 
		int numero;
		int soma = 0;
		int par = 0;
		int impar = 0;
		float media;
		int contador = 0;
		int acimadecem = 0;
	
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"<html>Informe um Número: <br><em>(valor 0 → para interromper)</em></html>"));
			
			if(numero % 2 == 0 && numero !=0) {
				par++;
			}
			if(numero % 2 == 1 && numero != 0) {
				impar++;
			}
			if(numero > 100) {
				acimadecem++;
			}
			if(numero != 0) {
				contador++;
			}
			soma += numero;
			
		}while(numero != 0);
		DecimalFormat num = new DecimalFormat("#");
		media = soma / contador;
		JOptionPane.showMessageDialog(null,"--------------------------- \n" + 
										   "\n Total de valores : " + contador +
										   "\n Total de Pares : " + par +
										   "\n Total de Impares : " + impar +
										   "\n Soma dos Valores : " + soma +
										   "\n Acima de Cem: " + acimadecem +
										   "\n Media dos Valores : " +num.format(media),"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
