package Classe;


public class RepetiçãoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Primeiro Exemplo -----");
		//UTILIZANDO A ESTRUTURA FOR PARA CRIAR UM LAÇO DE REPETIÇÃO
		for(int cc = 0;cc <= 3;cc++) {
			System.out.println("Cambalhota" + (cc));
		}
		System.out.println("----- Segundo Exemplo -----");
		//EXEMPLO 02
		for(int num = 0 ;num <= 10;num++) {			
			System.out.println("Numero digitado foi: " + (num));	
		}
		
		System.out.println("----- Terceiro Exemplo ----- ");
		//EXEMPLO 3
		for(int n = 15;n >= 5;n-=1) {
			System.out.println("Numero impresso: " + (n));
		}
		//EXEMPLO 4
		System.out.println("----- Quarto Exemplo ------");
		for(int c = 5;c <= 15;c+=2) {
			System.out.println("Numero impresso: " + (c));
		}
		
		System.out.println("------ Quinto Exemplo ------");
		//EXEMPLO 5
		for(int numero = 0;numero <= 100;numero+=10) {
			System.out.println("Numero impresso: " + (numero));
		}
		
		System.out.println("------ Sexto Exemplo ------- ");
		//EXEMPLO 6
		for(int i = 1;i <= 3;i++) {
			System.out.println("Valor de i: " + i);
			for(int j = 0;j <= 2;j+=2) {
				System.out.println("Valor de j: " + j);
			}
		}
		

	}

}
