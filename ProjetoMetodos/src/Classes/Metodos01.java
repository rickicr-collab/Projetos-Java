package Classes;

public class Metodos01 extends Metodos {
	protected static String contador(int i , int f) {
		String s = "";
		for(int c = i; c <= f; c++) {
			s += c + " ";
		}
		return s;
	}

}
