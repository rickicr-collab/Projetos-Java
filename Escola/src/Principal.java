
public class Principal {

	public static void main(String[] args) {
		Aluno guerra = new Aluno();
		guerra.bim1 = 70;
		guerra.bim2 = 60;
		guerra.bim1 = 80;
		guerra.bim4 = 90;
		
		// chamando diretamente as funções da classe Aluno
		System.out.println(" A média do Aluno será : "+guerra.media());
		System.out.println(" A situação do Aluno ficou : "+guerra.PassouDeAno());
	}
	
	
	
	
	
	
}
