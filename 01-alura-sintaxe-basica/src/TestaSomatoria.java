
public class TestaSomatoria {

	public static void main(String[] args) {

		int primeiro = 1;
		int ultimo = 10;

		int soma = (primeiro + ultimo) * ultimo / 2;
		System.out.println(soma);

		// -------------

		int total = 0;
		int contador = 1;

		while (contador <= 10) {
			total += contador;
			contador++;
		}

		System.out.println(total);

	}

}
