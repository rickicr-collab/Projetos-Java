package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDeTela {

	public static void main(String[] args) {
		// Resolução de Tela
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolução da tela do seu computador é :" + d.width +" X " + d.height);

	}

}
