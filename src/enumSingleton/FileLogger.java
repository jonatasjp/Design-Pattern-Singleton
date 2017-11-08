package enumSingleton;

public enum FileLogger {
	// Cria apenas o campo est�tico INSTANCE em "Tempo de Compila��o"
	// O objeto FileLogger s� ser� criado na JVM no seu primeiro acesso!
	INSTANCE;
	
	public void log(String msg) {
		System.out.println("Registrado no Log: " + msg);
	}
}