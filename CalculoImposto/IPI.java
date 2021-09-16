public class IPI implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		// incide 5% desde que seja abaixo de 20000
		if (valor < 20000) {
			valor = valor * 0.05;

			// incide 11%
		} else if (valor >= 20000) {
			// 11%
			valor = valor * 0.11;
		}

		return valor;

	}
}
