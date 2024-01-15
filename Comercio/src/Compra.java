
public class Compra {
	int ValorTotal;
	int numeroParcelas;
	
	//a Vista
	public Compra(int valor) {
		ValorTotal = valor;
		numeroParcelas = 1;
	}
	
	//a prazo
	public Compra(int  qtdparcelas, int ValorParcela) {
		numeroParcelas = qtdparcelas;
		ValorTotal = ValorParcela * qtdparcelas;	
	}
	
	public int getValorTotal() {
		return ValorTotal;
	}
	
	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public int getValorparcelas() {
		return ValorTotal/numeroParcelas;
	}
		
	
	

}
