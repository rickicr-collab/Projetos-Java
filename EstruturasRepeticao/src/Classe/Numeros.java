package Classe;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//APLICANDO O METODO DO WHILE CRIANDO UM LOOP SE ACORDO COM UMA CONDIÇÃO ESPECIFICA
		
		int numero = 0;
		int soma = 0;
		String resposta;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um numero: ");
			numero = teclado.nextInt();
			soma += numero;
			System.out.print("Deseja continuar? [S/N]");
			resposta = teclado.next();		
		}while(resposta.equals("s"));
		System.out.print("A soma de todos os valores é " + soma);
	}

}
