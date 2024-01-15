import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteCarroMult {
	@Test
	public void testCarroFreando() {
		CarroDeCorrida c = new CarroMult("teste", 1.5, 100);
		c.frear();
		assertEquals(0,c.getVelocidade());
	}
	
	@Test
	public void testCarroParado() {
		CarroDeCorrida c = new CarroMult("teste", 1.5, 100);
		assertEquals(0,c.getVelocidade());
	}

	@Test
	public void testAcelerarUmaVez() {
		CarroDeCorrida c = new CarroMult("teste", 1.5, 100);
		c.acelerar();
		assertEquals(10,c.getVelocidade());
	}
	
	@Test
	public void testAcelerarDuasVezes() {
		CarroDeCorrida c = new CarroMult("teste", 1.5, 100);
		c.acelerar();
		c.acelerar();
		assertEquals(15,c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		CarroDeCorrida c = new CarroMult("teste",1.5,100);
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		CarroDeCorrida c = new CarroMult("teste", 1.5, 100);
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		CarroDeCorrida  c = new CarroMult("teste", 1.5, 100);
		for(int i=0; i < 14; i++)
			c.acelerar();
		assertEquals(100, c.getVelocidade());
	}
	
}
