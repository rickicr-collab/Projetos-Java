package Classes;

public class Metodos {
	
	//PRIMEIRO EXEMPLO USANDO METODOS
	static void soma(int a , int b) {
		int soma = a + b;
		System.out.println("A soma é : " + soma);
	}
	
	//SEGUNDO EXEMPLO USANDO MÉTODOS 
	static int subtracao(int a , int b ) {
		int sb = a - b;
		return sb;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("----- Primeiro Exemplo usando métodos ----- ");
		soma(10, 5);
		System.out.println("----- Segundo Exemplo usando métodos ----- ");
		int sub = subtracao(10, 5);
		System.out.println("A subtração é : " + sub);
		System.out.println("----- Terceito Exemplo usando métodos ----- ");
		System.out.println("Vai comecar a contagem: ");
		System.out.println(Metodos01.contador(1, 5));


	}

}
