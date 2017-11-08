package enumSingleton;

public class Cliente {
	public static void main(String[] args) {
		 /*(2) Obtém instância do FileLogger Ao acessar pela primeira vez o
		 campo estático INSTANCE de Filelloger,
		 a classe Filelloger será carregada e inicializada pela JVM. Este
		 processo inicializa o campo estático INSTANCE uma vez, de forma
		 preguiçosa!*/
		FileLogger logger = FileLogger.INSTANCE;
		logger.log("Uma mensagem para registrar");

		FileLogger logger02 = FileLogger.INSTANCE;
		if (logger == logger02) {
			System.out.println("Os objetos logger e logger02 são a mesma instância");
		} else {
			System.out.println("O padrão Singleton falhou!!!");
		}

	}
}