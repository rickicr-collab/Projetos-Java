
// ecemplos de trabalho com exncapsulamento e sua importancia 
import java.sql.Date;
import java.util.Arrays;

public class Atriz {
	private String nome = "fulana de Tal";
	public String getNome() {
		return nome;
	}
	public int idade;
	public void GeradorDeIdade(int idade) {
		if(idade >= 18)
			System.out.println(" A pessoa de Nome " + getNome() + " com Idade de " + idade + " tem 18 anos ou mais ");
		else
			System.out.println(" A pessoa de Nome " + getNome() + " com Idade de " + idade + " tem menos de 18 anos");
	}
	private String segredo;
	private Ator amante;
	public Ator getAmante() {
		Ator at = new Ator();
		// copia informações amante
		return at;
	}
	public String getNomeAmante() {
		return amante.getNome();	
	}
	public int getIdadeAmante() {
		return amante.getIdadeAmante();
	}
	
	private String[] premios;
	public String[] getPremios() {
		String[] copia = Arrays.copyOf(premios,premios.length);
		return copia;
	}
	
	public String getPremio(int i) {
		return premios[i];
	}
	private Date nasc;
	public double getIdade1() {
		long hoje = System.currentTimeMillis();
		long dif = hoje = nasc.getTime();
		return(int) dif / 1000 / 60 / 60 / 24 / 365.25;
	}
	
	
}
