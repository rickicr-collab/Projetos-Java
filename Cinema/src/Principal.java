
public class Principal {
	public static void main(String[] args) {
		// nova atriz
		Atriz a = new Atriz();
		a.GeradorDeIdade(16);
		a.GeradorDeIdade(18);
		
		System.out.println("-----------------------------");
		// novo ator 
		Ator b = new Ator();
		b.nome = "Marcos";
		b.GeradorDeIdade(32);
		b.VerificadorDeAmante(32);
		

	}

}
