import java.util.Scanner;

public class ProgramaPernas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TRABALHANDO COM A ESTRUTURA CONDICIONAL SWITCH
		System.out.println("Trabalhando com estruturas Condicionais");
		System.out.println(" ------- Estrutura Switch ----------");
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Adivinhe Quantas Pernas?");
		int pernas = teclado.nextInt();
		System.out.print("Isso é um(a)");
		String tipo;
		switch (pernas) {
		case 1:
			tipo = "Saçi";
			break;
		case 2:
			tipo = "Bipede";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		}
		
		System.out.println(tipo);
	}

}
