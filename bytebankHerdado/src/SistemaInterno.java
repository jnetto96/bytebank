public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) { // Recebe um funcion�rioautenticavel
		boolean autenticou = fa.autentica(this.senha); // Testa pra ver se passou na autentica��o
		if(autenticou) {
			System.out.println("Bem vindo ao sistema");
		} else {
			System.out.println("Voc� nao pode entrar no sistema.");
		}
	}
}