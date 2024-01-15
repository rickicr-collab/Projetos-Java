import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	public void compraAvista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorparcelas());
	}
	
	@Test
	public void compraParcelado() {
		Compra d = new Compra(4, 250);
		assertEquals(4, d.getNumeroParcelas());
		assertEquals(1000, d.getValorTotal());
		assertEquals(250, d.getValorparcelas());	
	}

}
