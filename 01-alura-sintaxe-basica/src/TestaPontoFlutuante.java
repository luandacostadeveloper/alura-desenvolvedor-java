
public class TestaPontoFlutuante {

	public static void main(String[] args) {

		double salario = 2500.70;
		System.out.println("meu salario é: " + salario);

		/*
		 * Operações entre dois operandos de tipos iguais irá retornar um valor do tipo
		 * dos operandos. Ex: int + int = int
		 * 
		 * É primeiro feita a avaliação da expressão ao lado direito após isso é feita a
		 * atribuição
		 * 
		 */
		int divisao = 5 / 2;
		System.out.println(divisao);

		double outraDivisao = 5 / 2; // 5 / 2 = 2 ---- int / int = int
		System.out.println(outraDivisao);

		/*
		 * Operações entre tipos diferentes irá retornar um valor do tipo do maior
		 * operando. O operando de menor tipo será promovido ao de maior tipo
		 */
		double outraTentativa = 5.0 / 2;
		System.out.println(outraTentativa);

	}

}
