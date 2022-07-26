/*
 * André Kaled Duarte - Questão 7
 * Data: 20/07/2021 18:40
 * */
import java.util.Scanner;

public class RealOuNao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite algo para saber se é um número real(use ponto ao invés de vírgula)!");
		System.out.print("--> ");
		String entrada = s.nextLine();
		int verifica = 0;
		for(int i = 0; i < entrada.length(); i++){
			if(entrada.charAt(i) >= '0'&&entrada.charAt(i) <= '9'||entrada.charAt(i)=='.'||entrada.charAt(i) <= '-'){
				verifica++;
			}
		}
		if(verifica == entrada.length())
			System.out.println(entrada +" -> é um número real.");
		else
			System.out.println(entrada +" -> não é um número real.");
	}

}
