import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial extends TesteContaCorrente {
	

	
	
	@Test
	public void saqueMaiorQueSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo,200);
		assertEquals(valorSacado, 0);
		
	}
	
	@Test
	public void saqueMaiorQueSaldoLimite() {
		ContaEspecial cc = new ContaEspecial(100);
		cc.depositar(200);
		int ValorSacado = cc.sacar(250);
		assertEquals(cc.saldo, -50);
		assertEquals(ValorSacado,250);
	}
}
