
public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * OPERADORES RELACIONAIS
		 * >  MAIOR QUE : 5 > 2 TRUE
		 * <  MENOR QUE : 4 < 1 FALSE
		 * >= MAIOR OU IGUAL : 8 >= 3 TRUE
		 * <= MENOR OU IGUAL : 6 <= 6 TRUE
		 * == IGUAL A : 9 == 8 FALSE
		 * != DIFERENTE DE : 10 != 8 TRUE
		 */
		
		/*
		 * OPERADORES LÓGICOS
		 * && .E. : TRUE && FALSE = FALSE
		 * || .OU. : FALSE || TRUE = TRUE
		 * ^ .XOU. : TRUE ^ FALSE = FALSE
		 * ! .NAO. : ! FALSE = TRUE		 * 
		 */
		
		
		System.out.println(" ------ Operadores ternários ---------");
		int n1,n2,r;
		n1 = 14;
		n2 = 18;
		
		// EXEMPLO 1 
		r = (n1 > n2)?0:1;
		System.out.println("O resultado da condição é: " + r);
		r = (n1 < n2)?0:1;
		System.out.println("O resultado da condição é: " + r);
		
		// EXEMPLO 2
		r = (n1 > n2)? n1 +n2:n1 - n2;
		System.out.println("O resultado da condição é : " + r);
		r = (n1 < n2)? n1 + n2: n1 - n2;
		System.out.println("O resultado da condição é : " + r);
		
		
		System.out.println(" ---------- Comparação de Strings ----------");
		
		String nome1 = "Ricardo";
		String nome2 = "Ricardo";
		String nome3 = new String("Ricardo");
		
		// EXEMPLO 1
		String resposta = (nome1 == nome2)?" Igual" : " Diferente ";
		System.out.println("O resultado da comparação é : " + resposta);
		
		// EXEMPLO 2 
		String resposta1 = (nome1 == nome3)? " Igual " : " Diferente " ;
		System.out.println("O resultado da comparação é :" + resposta1);
		
		// EXEMPLO 3
		String resposta2 = (nome1.equals(nome3))? " Igual " : " Diferente ";
		System.out.println("O resultado da comparação é : " + resposta2);
		
		
		

	}

}
