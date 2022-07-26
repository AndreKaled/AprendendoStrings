/*
 * André Kaled Duarte - Questões 13, 14, 15, 16, 17, 18, 19, 20 e 30
 * Data de publicação: 14/07/2022 
 * obs: foi realizado antes da data mas completado no mesmo.
 * */
public class StringUtils {
	
	// Questão 12
	public static String desacentua(String palavra) {
		String palavraNova = palavra;
		palavraNova = palavraNova.replace('ç','c');
		palavraNova = palavraNova.replace('Ç','C');
		palavraNova = palavraNova.replace('ã','a');
		palavraNova = palavraNova.replace('Ã','A');
		palavraNova = palavraNova.replace('á','a');
		palavraNova = palavraNova.replace('Á','A');
		palavraNova = palavraNova.replace('à','a');
		palavraNova = palavraNova.replace('À','A');
		palavraNova = palavraNova.replace('â','a');
		palavraNova = palavraNova.replace('Â','A');
		palavraNova = palavraNova.replace('é','e');
		palavraNova = palavraNova.replace('É','E');
		palavraNova = palavraNova.replace('è','e');
		palavraNova = palavraNova.replace('È','E');
		palavraNova = palavraNova.replace('ê','e');
		palavraNova = palavraNova.replace('Ê','E');
		palavraNova = palavraNova.replace('í','i');
		palavraNova = palavraNova.replace('Í','I');
		palavraNova = palavraNova.replace('ì','i');
		palavraNova = palavraNova.replace('Ì','I');
		palavraNova = palavraNova.replace('î','i');
		palavraNova = palavraNova.replace('Î','I');
		palavraNova = palavraNova.replace('õ','o');
		palavraNova = palavraNova.replace('Õ','O');
		palavraNova = palavraNova.replace('ô','o');
		palavraNova = palavraNova.replace('Ô','O');
		palavraNova = palavraNova.replace('ó','o');
		palavraNova = palavraNova.replace('Ó','O');
		palavraNova = palavraNova.replace('ò','o');
		palavraNova = palavraNova.replace('Ò','O');
		palavraNova = palavraNova.replace('û','u');
		palavraNova = palavraNova.replace('Û','U');
		palavraNova = palavraNova.replace('ú','u');
		palavraNova = palavraNova.replace('Ú','U');
		palavraNova = palavraNova.replace('ù','u');
		palavraNova = palavraNova.replace('Ù','U');
		palavraNova = palavraNova.replace('ä','a');
		palavraNova = palavraNova.replace('ë','e');
		palavraNova = palavraNova.replace('ï','i');
		palavraNova = palavraNova.replace('ö','o');
		palavraNova = palavraNova.replace('ü','u');
		palavraNova = palavraNova.replace('Ä','A');
		palavraNova = palavraNova.replace('Ë','E');
		palavraNova = palavraNova.replace('Ï','I');
		palavraNova = palavraNova.replace('Ö','O');
		palavraNova = palavraNova.replace('Ü','U');
		palavraNova = palavraNova.replace('ñ','n');
		palavraNova = palavraNova.replace('Ñ','N');
		return palavraNova;
	}
	//meudeus quanta coisa
	
	//Questão 14
	public static String alinhaADireita(String palavra, int quant){
		if(palavra.length() > quant){
			return palavra;
		}else{
			for(int i = 0; palavra.length()!=quant; i++)
				palavra = " ".concat(palavra);
			return palavra;
		}
	}
	public static String alinhaAEsquerda(String palavra, int quant){
		if(palavra.length() > quant){
			return palavra;
		}else{
			for(int i = 0; palavra.length()!=quant; i++)
				palavra = palavra.concat(" ");
			return palavra;
		}
	}

	// Questão 15
	public static String replica(String frase, int rep) {
		String fraseRep = "";

		for (int i = 0; i < rep; i++) {
			fraseRep = fraseRep.concat(frase);
		}

		return fraseRep;
	}

	// questão 16
	public static int conta(String palavra, char letra) {
		int quant = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == letra) {
				quant++;
			}
		}
		return quant;
	}

	// questão 17
	public static String reverte(String palavra) {
		String revertido = "";
		for (int i = palavra.length() - 1; i >= 0; i--)
			revertido += palavra.charAt(i);
		return revertido;
	}

	// Questão 18
	// sobrecarga de métodos com equals
	public static boolean comparaString(String a, String b) {
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean comparaString(String a, String b, String c) {
		if (comparaString(a, b) && comparaString(b, c)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean comparaString(String a, String b, String c, String d) {
		if (comparaString(a, b, c) && comparaString(b, c, d)) {
			return true;
		} else {
			return false;
		}
	}

	// sobrecarga de métodos com equalsIgnoreCase
	public static boolean comparaStringIgnoreCase(String a, String b) {
		if (a.equalsIgnoreCase(b)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean comparaStringIgnoreCase(String a, String b, String c) {
		if (comparaStringIgnoreCase(a, b) && comparaStringIgnoreCase(b, c)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean comparaStringIgnoreCase(String a, String b, String c,
			String d) {
		if (comparaStringIgnoreCase(a, b, c)
				&& comparaStringIgnoreCase(b, c, d)) {
			return true;
		} else {
			return false;
		}
	}

	// Questão 19
	public static int quantasVezes(String arg1, String arg2) {
		int quant = 0;
		int i = 0;
		int aux = (arg1.length() - arg2.length());
		while (i < aux) {
			if (arg1.substring(i, i + arg2.length()).equalsIgnoreCase(arg2)) {
				quant++;
			}
			i++;
		}
		return quant;
	}

	// Questão 20
	public static String retiraVogais(String arg) {
		String semVogal = "";
		for (int i = 0; i < arg.length(); i++) {
			if (arg.charAt(i) == 'a' || arg.charAt(i) == 'A'
					|| arg.charAt(i) == 'e' || arg.charAt(i) == 'E'
					|| arg.charAt(i) == 'i' || arg.charAt(i) == 'I'
					|| arg.charAt(i) == 'o' || arg.charAt(i) == 'O'
					|| arg.charAt(i) == 'u' || arg.charAt(i) == 'U') {

			} else {
				semVogal += arg.charAt(i);
			}
		}
		return semVogal;
	}

	// startWith com IgnoreCase
	public static boolean startsWithIgnoreCase(String arg1, String arg2) {
		String inicial = arg1.substring(0, arg2.length());
		if (inicial.equalsIgnoreCase(arg2))
			return true;
		else
			return false;
	}

	// endsWith com IgnoreCase
	public static boolean endsWithIgnoreCase(String arg1, String arg2) {
		String end = arg1.substring(arg1.length() - arg2.length(),
				arg1.length());
		if (end.equalsIgnoreCase(arg2))
			return true;
		else
			return false;
	}

	// fim da questão, havia duas solicitações na mesma questão

	// Questão 22
	public static boolean palindromaComEspaco(String arg) {
		String contrario = "";
		for (int i = (arg.length() - 1); i >= 0; i--)
			contrario += arg.charAt(i);
		if (contrario.equalsIgnoreCase(arg))
			return true;
		else
			return false;
	}

	public static boolean palindromaSemEspaco(String arg) {
		String contrario = "";
		arg = arg.replace(" ", "");
		for (int i = (arg.length() - 1); i >= 0; i--) {
			contrario += arg.charAt(i);
		}
		if (contrario.equalsIgnoreCase(arg))
			return true;
		else
			return false;
	}

	// Questão 23
	public static String soundex(String arg) {
		String soundex = "";
		arg = arg.toUpperCase();
		soundex += arg.charAt(0);
		for (int i = 1; i < arg.length(); i++) {
			if (arg.charAt(i) == arg.charAt(i - 1))
				continue;
			if (arg.charAt(i) == 'B' || arg.charAt(i) == 'P'
					|| arg.charAt(i) == 'F' || arg.charAt(i) == 'V') {
				soundex += '1';
			} else if (arg.charAt(i) == 'C' || arg.charAt(i) == 'Ç'
					|| arg.charAt(i) == 'S' || arg.charAt(i) == 'G'
					|| arg.charAt(i) == 'J' || arg.charAt(i) == 'K'
					|| arg.charAt(i) == 'Q' || arg.charAt(i) == 'X'
					|| arg.charAt(i) == 'Z') {
				soundex += '2';
			} else if (arg.charAt(i) == 'D' || arg.charAt(i) == 'T') {
				soundex += '3';
			} else if (arg.charAt(i) == 'L') {
				soundex += '4';
			} else if (arg.charAt(i) == 'M' || arg.charAt(i) == 'N') {
				soundex += '5';
			} else if (arg.charAt(i) == 'R') {
				soundex += '6';
			}
			if (i == (arg.length() - 1) && soundex.length() < 4) {
				while (soundex.length() < 4) {
					soundex += '0';
				}
			}
			if (soundex.length() == 4) {
				break;
			}
		}
		return soundex;
	}

	// questão 30
	public static String alfabetoCompleto(String palavra) {
		String alfabetoCompleto = "";
		palavra = palavra.toLowerCase();
		for (int i = 0; i < palavra.length(); i++) {
			String letra = "";
			letra += palavra.charAt(i);
			if (alfabetoCompleto.contains(letra) == false) {
				alfabetoCompleto = alfabetoCompleto.concat(letra);
			}
		}
		return alfabetoCompleto;
	}
	
	//Questão 35
	public static boolean quasePalindroma(String palavra){
		String inverso = "";
		int cont = 0;
		for(int i = (palavra.length()-1); i >= 0; i--){
			inverso += palavra.charAt(i);
		}
		for(int i = 0; i < palavra.length(); i++){
			if(palavra.charAt(i) != inverso.charAt(i))
				cont++;
		}
		if(cont <= 2)
			return true;
		else
			return false;
	}
}