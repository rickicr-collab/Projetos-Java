import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		float nota1 = teclado.nextFloat();
		System.out.println("Primeira nota :" + nota1);
		float nota2 = teclado.nextFloat();
		System.out.println("Segunda Nota : " + nota2);

		float media = (nota1 + nota2) / 2;
		System.out.println(" ----- Situação do Aluno -------- ");
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("A média do aluno é : " + media);
		if(media>7) {
			System.out.println("Aprovado!");
		}
	}

}
