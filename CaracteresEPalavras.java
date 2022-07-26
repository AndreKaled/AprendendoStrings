/*
 * André Kaled Duarte - Questão 3
 * Data: 19/07/2022
 * */
import java.util.Scanner;

public class CaracteresEPalavras {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite alguma coisa: ");
		String entrada = s.nextLine();
		int caracter = entrada.length();
		int palavra = 1;
		for(int i = 0; i < entrada.length(); i++){
			if(entrada.charAt(i)==' '){
				palavra++;
				caracter--;
			}
		}
		System.out.println("Quantidade de caracteres: " +caracter);
		System.out.println("Quantidade de palavras: " +palavra);
	}

}
