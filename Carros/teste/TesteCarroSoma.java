import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TesteCarroSoma{
	
	
	@Test
	public void testCarroFreando() {
		CarroDeCorrida c = new CarroSoma("teste", 0, 0);
		c.frear();
		assertEquals(0,c.getVelocidade());
	}
	
	@Test
	public void testCarroParado() {
		CarroDeCorrida c = new CarroSoma("teste", 0, 0);
		assertEquals(0,c.getVelocidade());
	}

	@Test
	public void testAcelerar() {
		CarroDeCorrida c = new CarroSoma("teste", 10, 10);
		c.acelerar();
		assertEquals(10,c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		CarroDeCorrida c = new CarroSoma("teste", 14, 140);                            
		for(int i = 0; i < 14; i++)
			c.acelerar();
		assertEquals(140,c.getVelocidade());
	}
	
	@Test
	public void testCarroAcelerarAteCem() {
		CarroDeCorrida c = new CarroSoma("teste", 10, 100);
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		assertEquals(100,c.getVelocidade());
	}
	
	@Test
	public void testCarroFrearAteChegarZero() {
		CarroDeCorrida c = new CarroSoma("teste", 0, 0);
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0,c.getVelocidade());
	}
}
