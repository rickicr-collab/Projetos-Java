package Funcao;

public class Funcao01 {

	public static void main(String[] args) {
		//EXEMPLO ATRIBUINDO UM OBJETO 
		Fatorial f = new Fatorial();
		f.setValor(5);
		f.getFatorial();
		f.getFormula();
		
		//IMPRIMINDO DADOS NA TELA 
		System.out.print("A formula é: " + f.getFormula());
		System.out.println(f.getFatorial());
	}

}
