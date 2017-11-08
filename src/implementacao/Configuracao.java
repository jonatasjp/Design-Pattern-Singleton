package implementacao;

public class Configuracao {
	
	private static Configuracao instancia;

	private Configuracao() {
		// lê as configurações
	}

	public static Configuracao getInstancia() {
		if (instancia == null)
			instancia = new Configuracao();
		return instancia;
	}

}