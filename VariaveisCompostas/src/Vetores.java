import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EXEMPLO 01
		
		System.out.println("------- Primeiro Exemplo com vetores -------- ");
		int n[] = {3, 4, 5, 8, 5, 6};
		
		//METODOS DE N
		System.out.println("O total de indices de N: " + n.length);
		//IMPRIMINDO UM VETOR NA TELA
		//APLICANDO O ATRIBUTO LENGTH DENTRO DA CONIÇÃO DO FOR 
		for(int c = 0; c <= n.length-1;c++) {
			System.out.println(" Na posição " + c + " Temos " + n[c]);
		}
		
		//EXEMPLO 2
		System.out.println("--------- Segundo Exemplo com vetores -------- ");
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", 
				"Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int tot[] = {31, 28, 31, 30, 31, 30,
				31, 31, 31, 30, 31, 30, 31 };
		for (int c = 0; c < mes.length; c++) {
			System.out.println(mes[c] + " tem " + tot[c] + " dias.");
			
		}
		
		//EXEMPLO 3 
		// UTILIZANDO O METODO FOR IT
	    // REALIZANDO UM BUSCA DENTRO DE UM VETOR
		System.out.println("-------- Terceiro Exemplo com vetores --------- ");
		int num[] = {3, 5, 1, 8, 4};
		// CRIANDO UMA VARIAVEL PARA REALIZAR A FUNÇÃO DE BUSCA NO ARRAY
		int pos = Arrays.binarySearch(num, 1);
		int p = Arrays.binarySearch(num, 6);
		System.out.println("O valor encontra-se na posição : " + pos);
		//CASO A CHAVE NÃO EXISTE ELE EXIBI COM O VALOR NEGATIVO
		System.out.println("O valor buscado que não existe é : " + p);
		// COLOCANDO UM ARRAYS EM ORDEM
		Arrays.sort(num);
		for(int valor: num) {
			System.out.println("temos o valor " + valor);
		}
		
		System.out.println("--------- Quarto Exemplo com Vetores ----------- ");
		
		//EXEMPLO 4
		
		double v[] = {3.5, 2.75, 9, -4.5 };
		Arrays.sort(v);
		System.out.println("Array de forma ordenada: ");
		for(double valor: v) {
			System.out.print(valor + " ");
			
		}
		System.out.println("");
		
		System.out.println("-------- Quinto exemplo com Vetores ------------- ");
		
		int numero[] =  new int[5];
		//PREENCHENDO OS VALORE NO VETORES USANDO A FUNÇÃO FILL
		Arrays.fill(numero, 8);
		for(int valor: numero) {
			System.out.print(valor + " ");
		}
	}

}
