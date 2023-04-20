package modelo.servicos;

public class ServicoImpostoBr implements ServicoImposto {
	
	public double calculaImposto(double valor) {
		if (valor <= 100.0) {
			return valor * 0.2;
		}
		else {
			return valor * 0.15;
		}
	}
}
