
public class Principal {
	public static void main(String[] args) {
		// empilhando
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("Ricardo");
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[2] = "Outros";
		
		//desempilhando 
		System.out.println("-------------------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		
		System.out.println(p.getElementos().length);

	}

}
