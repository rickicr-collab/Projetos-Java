package Classe;

public class FuncoesETestes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ANALISE
		char c = 'c';
		int inteiro = 10;
		double d = 10;
		long l = 1;
		String s = "Hello";
		
		// CODIGO NÃO COMPILA POR SER TIPOS IMCOMPATIVEIS CHAR(CHARACTERE) E INT(INTEIRO)
		//c = c + i;
		
		// CÓDIGO COMPILA POR SER TIPOS COMPATIVEIS STRING E INTEIRO (CORRETO)
		
		s += inteiro;
		
		// CODIGO NAO COMPILA POIS O INTEIRO ESTÁ PREDESCENDENTO O STRING POR SER INCOMPATIVEL
		//i += s;
		
		// CODIGO NÃO COMPILA POIS A CLASSE STRING E CHAR SÃO INCOMPATIVEIS 
		//C += S;
		
		// CODIGO COMPILA POIS AS DUAS CLASSES SÃO COMPATIVEIS (CORRETO)
		inteiro += l;
		
		System.out.println(" ----- EXEMPLO DE ESTRUTURAS DE REPETIÇÃO ----- ");
		
		// APLICAÇÃO DE ESTRUTRAS DE REPETIÇÃO USANDO METODO WHILE
		int i = 1;
		int a = 1;
		while(i < 10) {
			++a;
			i = i + 1;
			if (a > 6) ++i;		
		}
		
		System.out.println("Valor de i: " + i);
		System.out.print("Valor de a: " + a);
		

	}

}
