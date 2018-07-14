
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadeDePessoas = 2;

		if (idade >= 18) {
			System.out.println("você é maior da idade");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("você não tem 18 mas pode entrar, pois está acompanhado");
			} else {
				System.out.println("infelizmente você não pode entrar");
			}
		}

	}

}
