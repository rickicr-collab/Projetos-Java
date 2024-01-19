import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		int nascimento = teclado.nextInt();
		int idade = 2024 - nascimento;
		
		System.out.println(" ------ Verificador de Idade ------ ");
		System.out.println("Nome da Pessoa: " + nome);
		System.out.println("Ano de Nascimento: " + nascimento);
		System.out.println("Sua idade é: " + idade);
		
		if(idade >= 18) {
			System.out.println("Maior de idade ! ");
		}else {
			System.out.println("Menor de idade ! ");
		}
		
	}

}
