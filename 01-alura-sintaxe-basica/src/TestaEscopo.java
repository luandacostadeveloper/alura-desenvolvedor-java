
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("testando escopo");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
			// boolean acompanhado = true;
		} else {
			acompanhado = false;
			// boolean acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {

			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}

	}

}