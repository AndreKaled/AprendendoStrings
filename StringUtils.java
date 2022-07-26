/*
 * Andr� Kaled Duarte - Quest�es 13, 14, 15, 16, 17, 18, 19, 20 e 30
 * Data de publica��o: 14/07/2022 
 * obs: foi realizado antes da data mas completado no mesmo.
 * */
public class StringUtils {
	
	// Quest�o 12
	public static String desacentua(String palavra) {
		String palavraNova = palavra;
		palavraNova = palavraNova.replace('�','c');
		palavraNova = palavraNova.replace('�','C');
		palavraNova = palavraNova.replace('�','a');
		palavraNova = palavraNova.replace('�','A');
		palavraNova = palavraNova.replace('�','a');
		palavraNova = palavraNova.replace('�','A');
		palavraNova = palavraNova.replace('�','a');
		palavraNova = palavraNova.replace('�','A');
		palavraNova = palavraNova.replace('�','a');
		palavraNova = palavraNova.replace('�','A');
		palavraNova = palavraNova.replace('�','e');
		palavraNova = palavraNova.replace('�','E');
		palavraNova = palavraNova.replace('�','e');
		palavraNova = palavraNova.replace('�','E');
		palavraNova = palavraNova.replace('�','e');
		palavraNova = palavraNova.replace('�','E');
		palavraNova = palavraNova.replace('�','i');
		palavraNova = palavraNova.replace('�','I');
		palavraNova = palavraNova.replace('�','i');
		palavraNova = palavraNova.replace('�','I');
		palavraNova = palavraNova.replace('�','i');
		palavraNova = palavraNova.replace('�','I');
		palavraNova = palavraNova.replace('�','o');
		palavraNova = palavraNova.replace('�','O');
		palavraNova = palavraNova.replace('�','o');
		palavraNova = palavraNova.replace('�','O');
		palavraNova = palavraNova.replace('�','o');
		palavraNova = palavraNova.replace('�','O');
		palavraNova = palavraNova.replace('�','o');
		palavraNova = palavraNova.replace('�','O');
		palavraNova = palavraNova.replace('�','u');
		palavraNova = palavraNova.replace('�','U');
		palavraNova = palavraNova.replace('�','u');
		palavraNova = palavraNova.replace('�','U');
		palavraNova = palavraNova.replace('�','u');
		palavraNova = palavraNova.replace('�','U');
		palavraNova = palavraNova.replace('�','a');
		palavraNova = palavraNova.replace('�','e');
		palavraNova = palavraNova.replace('�','i');
		palavraNova = palavraNova.replace('�','o');
		palavraNova = palavraNova.replace('�','u');
		palavraNova = palavraNova.replace('�','A');
		palavraNova = palavraNova.replace('�','E');
		palavraNova = palavraNova.replace('�','I');
		palavraNova = palavraNova.replace('�','O');
		palavraNova = palavraNova.replace('�','U');
		palavraNova = palavraNova.replace('�','n');
		palavraNova = palavraNova.replace('�','N');
		return palavraNova;
	}
	//meudeus quanta coisa
	
	//Quest�o 14
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

	// Quest�o 15
	public static String replica(String frase, int rep) {
		String fraseRep = "";

		for (int i = 0; i < rep; i++) {
			fraseRep = fraseRep.concat(frase);
		}

		return fraseRep;
	}

	// quest�o 16
	public static int conta(String palavra, char letra) {
		int quant = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == letra) {
				quant++;
			}
		}
		return quant;
	}

	// quest�o 17
	public static String reverte(String palavra) {
		String revertido = "";
		for (int i = palavra.length() - 1; i >= 0; i--)
			revertido += palavra.charAt(i);
		return revertido;
	}

	// Quest�o 18
	// sobrecarga de m�todos com equals
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

	// sobrecarga de m�todos com equalsIgnoreCase
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

	// Quest�o 19
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

	// Quest�o 20
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

	// fim da quest�o, havia duas solicita��es na mesma quest�o

	// Quest�o 22
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

	// Quest�o 23
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
			} else if (arg.charAt(i) == 'C' || arg.charAt(i) == '�'
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

	// quest�o 30
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
	
	//Quest�o 35
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