package linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {
	// Idioma atual do Sistema
	public static void main(String[] args) {
		Locale idioma = Locale.getDefault();
		System.out.println("O idioma do Sistema é: " + idioma.getDisplayLanguage());
	}

}
