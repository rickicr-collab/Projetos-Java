/**
 * @author Ricardo Rosendo
 */
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------- Operadores Lógicos ----------");
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		boolean resposta;
		boolean resposta1;
		boolean resposta2;
		
		
		System.out.println("  ---- Usando o operador && ---- ");
		
		resposta = (x < z && y < z)? true : false;
		System.out.println("O resuldado é : " + resposta);
		
		resposta = (x > z && y > z)? true : false;
		System.out.println("O resultado é : " + resposta);
		
		resposta = (x < z && y == z)? true : false;
		System.out.println("O resultado é : " + resposta);
		
		System.out.println("  ---- Usando o operador || ---- ");
		
		resposta1 = (x < z || y == z)? true : false;
		System.out.println("O resultado é : " + resposta1);
		
		resposta1 = (x < z || y < z)? true : false;
		System.out.println("O resultado é : " + resposta1);
		
		resposta1 = (x > z || y > z)? true : false;
		System.out.println("O resultado é : " + resposta1);
		
		System.out.println("  ---- Usando o operador ^ ---- ");
		
		resposta2 = (x < z ^ y < z)? true : false;
		System.out.println("O resultado é : " + resposta2);
		
		resposta2 = (x > z ^ y > z)? true : false;
		System.out.println("O resultado é : " + resposta2);
		
		resposta2 = (x < z || y == z)? true : false;
		System.out.println("O resultado é : " + resposta2);
		
	}

}
