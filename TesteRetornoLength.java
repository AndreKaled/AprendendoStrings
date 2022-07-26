
public class TesteRetornoLength {

	public static void main(String[] args) {
		String a,b,c;
		a = new String("Cadeia de caracteres");
		b = new String("\n\n");
		c = new String("");
		System.out.println("Tamanho da String a: " +a.length());//retorna 20
		System.out.println("Tamanho da String b: " +b.length());//retorna 2
		System.out.println("Tamanho da String c: " +c.length());//retorna 0
		//portanto a resposta correta é a letra a
	}

}
