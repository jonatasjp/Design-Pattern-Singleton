package implementacao;

public class Configuracao {
	
	private static Configuracao instancia;

	private Configuracao() {
		// l� as configura��es
	}

	public static Configuracao getInstancia() {
		if (instancia == null)
			instancia = new Configuracao();
		return instancia;
	}

}