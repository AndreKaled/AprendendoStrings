import java.util.Scanner;

public class NumerosEmString {
	public static void main(String[] args) {

		// variavel inteira a ser lida
		int num;
		// instanciando objeto de entrada de dados
		Scanner s = new Scanner(System.in);

		// leitura de dados, no caso um inteiro
		System.out.print("Digite um número: ");
		num = s.nextInt();

		// passando o inteiro para String com valueOf
		String numC = String.valueOf(num);

		// recebendo tamanho da string
		int contTamanho = numC.length();

		char c;
		int i = 0;
		while (i < contTamanho) {
			c = numC.charAt(i);
			if (c == '1') {
				System.out.print("Um");
			}
			if (c == '2') {
				System.out.print("Dois");
			}
			if (c == '3') {
				System.out.print("Três");
			}
			if (c == '4') {
				System.out.print("Quatro");
			}
			if (c == '5') {
				System.out.print("Cinco");
			}
			if (c == '6') {
				System.out.print("Seis");
			}
			if (c == '7') {
				System.out.print("Sete");
			}
			if (c == '8') {
				System.out.print("Oito");
			}
			if (c == '9') {
				System.out.print("Nove");
			}
			if (c == '0') {
				System.out.print("Zero");
			}
			i++;
			if (i < contTamanho)
				System.out.print(", ");
			else
				System.out.print(".");
		}
	}
}