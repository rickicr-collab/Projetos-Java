
public class OperadoresA {
	
	/*
	 * operação simples usando variaveis com valores
	 * atribuios e impressos na tela.
	 */

	public static void main(String[] args) {
		// Exemplo 1
		int n1 = 5;
		int n2 = 2;
		float m = (n1 + n2) / 2;
		
		System.out.println("A média da operação acima é :" +  m);
		
		
		// Operadores ternarios 
		System.out.println("--------- Operadores ternários --------- ");
		// Exemplo 2 
		int numero = 5;
		numero++;
		System.out.println("O resultado é : " + numero);
		
		//Exemplo 3
		// a variavel num não está incrementada 
		int num = 10;
		int valor = 2 + num++;
		System.out.println("O resultado é : " + valor);
		
		//Exemplo 4 
		// exemplo a variavel num2 já está  incrementada 
		int num2 = 5;
		int valor2 = 5 + ++num2;
		System.out.println("O resultado é : " + valor2);
		System.out.println("imprimindo o numero : " + num2);
		
		// Exemplo 5
		// pós incremento utilizando o sinal de subtração
		int num3 = 10;
		int valor3 = 4 + num3--;
		System.out.println("O resultado é : " + valor3);
		System.out.println("imprimindo o numero : " + num3);
		
		// Exemplo 6
		// pré incremento utilizando o sinal de subtração
		int num4 = 20;
		int valor4 = 2 + --num4;
		System.out.println("O resultado é : " + valor4);
		System.out.println("imprimindo o numero : " + num4);
		
		// operadores de Attribuição 
		System.out.println("------ Operadores de Atribuição ------");
		
		// Exemplo 1
		int x = 4;
		x += 2; // x = 4 + 2
		System.out.println("O Resultado é : " + x);
		
		// Exemplo 2
		int z = 6;
		z -= 2;
		System.out.println("O resultado é : " + z);
		
		// Exemplo 3
		int a = 2;
		a *= 10;
		System.out.println("O resultado é : " + a);
		
		// Exemplo 4
		int b = 10;
		b /= 5;
		System.out.println("O resultado é : " + b);
		
		// Exemplo 5
		
		int c = 5;
		c %= 10;
		System.out.println("O resultado é : " + c);
		
		System.out.println(" ----------- Arrendondamento ----------- ");
		
		// Exemplo 1
		float y = 8.9f;
		int ar = (int)Math.floor(y);
		System.out.println("O arrendondamento floor será : " + ar);
		
		// Exemplo 2
		float d = 9.1f;
		int br = (int)Math.ceil(d);
		System.out.println("O arrendondamento ceil será : " + br);
		
		// Exemplo 3
		float e = 5.5f;
		int cr = (int)Math.round(e);
		System.out.println("O arrendondamento round será : " + cr);
		
		
		System.out.println(" -------- Numeros Aleatórios ---------");
		
		// Exemplo 1
		// numeros aleatorios padrão do método de 0 a 1
		double ale = Math.random();
		System.out.println("Numeros aleatórios padrão : " + ale);	
		
		// Exemplo 2
		// colocando intervalo de 5 a 10 
		double ran = 5 + Math.random() * (10-5);
		System.out.println("Numeros aleatórios de 5 a 10 :" + (int)ran);
		
		// Exemplo 3
		// Colocando Intervalo de 15 a 50
		double ran2 = 15 + Math.random() * (50-15);
		System.out.println("Numeros aleatórios de 15 a 50:" + (int)ran2);
		
		
		
		
		
		
	}

}
