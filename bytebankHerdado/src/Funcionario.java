// N�o pode instanciar pois � abstrata, conceitual.
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	//m�todo sem corpo e abstrato. � necess�rio fazer o override em todas classes que o usam.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
