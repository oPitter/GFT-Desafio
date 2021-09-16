public class COFINS implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		// incide 4 % maior que 12000 , igual ou abaixo de 12000 não tem incidencia
		
		if(valor > 12000) {
			valor = valor * 1.12;
			return valor;

		}else {
		 return 0;
		}
		
		
	}

	 

}
