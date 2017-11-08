package enumSingleton;

public enum FileLogger {
	// (1) Cria apenas o campo estático INSTANCE em "Tempo de Compilação"
	// O objeto FileLogger só será criado na JVM no seu primeiro acesso!
	INSTANCE;
	public void log(String msg) {
		// Simula código para fazer o log de mensagens
		System.out.println("Registrado no Log: " + msg);
	}
	// Outros métodos e váriáveis de instância próprios do FileLogger
}