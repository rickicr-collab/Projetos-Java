import java.util.Scanner;

public class Cprimitivas {

	public static void main(String[] args) {
		
		/*
		 * forma de declaração de tipos primitivos 
	     * usando a função scanner para gerar entrada de dados 
	     * usando os varios metodos de print para mostrar dados em tela 
	     */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do Aluno:");
		String nome = teclado.nextLine();
		System.out.println("Digite a nota do Aluno:");
		float nota = teclado.nextFloat();
		
		System.out.println("----------------------");
		System.out.println("A nota do " + nome + " é : " + nota);	
		System.out.println("A nota de " + nome + " declarada é : " + nota);
		System.out.format("Sua nota é: %.1f \n", nota);
		System.out.format("A nota de %s é : %.1f", nome, nota);
	}

}
