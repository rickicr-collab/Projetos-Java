
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroA",10,160));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroB",8,140));
		corridaDaAmizade.adicionaCarro(new CarroSoma("CarroC",10,110));
		corridaDaAmizade.adicionaCarro(new CarroMult("CarroD",1.7,130));
		corridaDaAmizade.adicionaCarro(new CarroMult("CarroE",1.4,150));
		corridaDaAmizade.umDoisTresEja();
	}

}
