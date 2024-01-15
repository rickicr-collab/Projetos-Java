import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	
	
	@Test
	public void deposito() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	public void saque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(100);
		assertEquals(cc.saldo,100);
		
	}
	
	@Test
	public void DepositoComsaque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(500);
		cc.depositar(200);
		int valorSacado = cc.sacar(350);
		assertEquals(cc.saldo,350);
		
	}
}
