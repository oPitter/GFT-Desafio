public class ICMS implements Imposto {

	@Override
	public double calculaImposto(double valor) {

		// Incide 24% sobre o valor
		valor = valor * 0.24;
		return valor;
	}

}
