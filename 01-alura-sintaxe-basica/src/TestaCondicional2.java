
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("testando operadores lógicos");

		int idade = 17;
		int quantidadeDePessoas = 2;
		boolean estaAcompanhado = quantidadeDePessoas >= 2;

		// if (idade >= 18 && estaAcompanhado) {
		if (idade >= 18 || estaAcompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}

	}

}
