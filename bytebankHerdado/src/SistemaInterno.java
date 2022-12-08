public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) { // Recebe um funcionárioautenticavel
		boolean autenticou = fa.autentica(this.senha); // Testa pra ver se passou na autenticação
		if(autenticou) {
			System.out.println("Bem vindo ao sistema");
		} else {
			System.out.println("Você nao pode entrar no sistema.");
		}
	}
}