package Classe;

public class Contador01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXEMPLO 01
		//ESTRUTURAS DEREPETIÇÃO - TRABALHANDO COM A  - ESTRUTURA WHILE
		int cc = 0;
		while (cc < 4) {
			// PARA COLOCAR DE FORMA ORDENADA O NUMERO DAS CAMBALHOTAS COLOCA CC ENTRE PARENTESES COM +1
			System.out.println(" Cambalhotas nº " + (cc + 1));
			cc++;
		}
		System.out.println(" ----- Fim do Primeiro Programa ---- ");
		
		//EXEMPLO 02
		// TRABALHANDO COM FUNÇÃO - CONTINUE
		int numero = 0;
		while (numero <= 15) {
			numero++;
			if(numero == 5 || numero == 7 || numero == 9) {
				continue;
			}
			//TRABALHANDO COMA FUNÇÃO BREAK
			if(numero == 12) {
				break;
			}
			System.out.println(" Cambalhotas nº: " + (numero));
		}
		System.out.println(" ----- Fim do Segundo Programa ----- ");
		
		

	}

}
