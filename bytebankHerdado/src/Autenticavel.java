
public abstract class Autenticavel extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) { // Entrada de dados: int senha.
		
		if(this.senha == senha) { // Processamento: verificar se a senha informada � igual a this.senha
			return true;
		} else {
			return false; // Saida de dados: retorna true caso ok, else false.
		}
	}

}
