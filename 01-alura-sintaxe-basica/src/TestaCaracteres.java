
public class TestaCaracteres {

	public static void main(String[] args) {

		char letra = 'a';
		System.out.println(letra);

		char valor = 65; // numero da tabela unicode
		System.out.println(valor);

		valor = (char) (valor + 1);
		System.out.println(valor);

		String frase = "alura cursos online de tecnologia";
		System.out.println(frase);

		frase = frase + " " + 2020;
		System.out.println(frase);

	}

}
