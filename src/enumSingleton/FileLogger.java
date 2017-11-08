package enumSingleton;

public enum FileLogger {
	// (1) Cria apenas o campo est�tico INSTANCE em "Tempo de Compila��o"
	// O objeto FileLogger s� ser� criado na JVM no seu primeiro acesso!
	INSTANCE;
	public void log(String msg) {
		// Simula c�digo para fazer o log de mensagens
		System.out.println("Registrado no Log: " + msg);
	}
	// Outros m�todos e v�ri�veis de inst�ncia pr�prios do FileLogger
}