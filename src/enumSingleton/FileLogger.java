package enumSingleton;

public enum FileLogger {
	// Cria apenas o campo estático INSTANCE em "Tempo de Compilação"
	// O objeto FileLogger só será criado na JVM no seu primeiro acesso!
	INSTANCE;
	
	public void log(String msg) {
		System.out.println("Registrado no Log: " + msg);
	}
}