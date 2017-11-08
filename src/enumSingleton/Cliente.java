package enumSingleton;

public class Cliente {
	public static void main(String[] args) {
		 /*(2) Obt�m inst�ncia do FileLogger Ao acessar pela primeira vez o
		 campo est�tico INSTANCE de Filelloger,
		 a classe Filelloger ser� carregada e inicializada pela JVM. Este
		 processo inicializa o campo est�tico INSTANCE uma vez, de forma
		 pregui�osa!*/
		FileLogger logger = FileLogger.INSTANCE;
		logger.log("Uma mensagem para registrar");

		FileLogger logger02 = FileLogger.INSTANCE;
		if (logger == logger02) {
			System.out.println("Os objetos logger e logger02 s�o a mesma inst�ncia");
		} else {
			System.out.println("O padr�o Singleton falhou!!!");
		}

	}
}