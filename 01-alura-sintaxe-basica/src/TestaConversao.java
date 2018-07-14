import java.math.BigDecimal;

public class TestaConversao {

	public static void main(String[] args) {

		double salario = 1240.60;
		int teste = (int) salario;

		System.out.println(teste);

		// o double não é recomendado para variaveis de necessitem de uma alta precisão

		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);

		BigDecimal value1 = new BigDecimal("0.2");
		BigDecimal value2 = new BigDecimal("0.1");
		BigDecimal sum = value1.add(value2);
		System.out.println(sum);

		// outros tipos primitivos numericos

		byte numeroBemPequeno = 127;
		short numeroPequeno = 32_000;
		int numero = 2_000_000_000;
		long numeroGigantesco = 9_000_000_000_000_000_000L;

		System.out.println(numeroBemPequeno);
		System.out.println(numeroPequeno);
		System.out.println(numero);
		System.out.println(numeroGigantesco);

		float numeroPontoFlutuantePequeno = 13201310.5F;
		double numeroPontoFlutuanteGrande = 13201310.5;

		System.out.println(numeroPontoFlutuantePequeno);
		System.out.println(numeroPontoFlutuanteGrande);

	}
}