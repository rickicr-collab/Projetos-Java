
public class TesteTipos {

	public static void main(String[] args) {
		/* Tratamento de imcompatibilidade de classes no java 
		 * convertendo valores inteiros em string e vice-versa
		 * Reealizando com valores reasi
		 */
		
		// Exemplo 1
		int numero = 60;
		String valor = Integer.toString(numero);
		System.out.println(valor);
		
		// Exemplo 2
		String palavra = "30";
		int idade = Integer.parseInt(palavra);
		System.out.println(idade);
		
		// Exemplo 3 
		String num = "15.5f";
		float nota = Float.parseFloat(num);
		System.out.println(nota);

	}

}
