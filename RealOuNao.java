/*
 * Andr� Kaled Duarte - Quest�o 7
 * Data: 20/07/2021 18:40
 * */
import java.util.Scanner;

public class RealOuNao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite algo para saber se � um n�mero real(use ponto ao inv�s de v�rgula)!");
		System.out.print("--> ");
		String entrada = s.nextLine();
		int verifica = 0;
		for(int i = 0; i < entrada.length(); i++){
			if(entrada.charAt(i) >= '0'&&entrada.charAt(i) <= '9'||entrada.charAt(i)=='.'||entrada.charAt(i) <= '-'){
				verifica++;
			}
		}
		if(verifica == entrada.length())
			System.out.println(entrada +" -> � um n�mero real.");
		else
			System.out.println(entrada +" -> n�o � um n�mero real.");
	}

}
