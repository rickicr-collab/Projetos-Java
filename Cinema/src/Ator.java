
public class Ator extends Atriz {
	String nome;
	public int idade;
	public void VerificadorDeAmante(int idade) {
		if(idade > 18 )
			System.out.println(" Amante com nome "+ nome +" maior de idade");
		else
			System.out.println(" Amante com nome "+ nome +" menor de idade");
	}
	

}
