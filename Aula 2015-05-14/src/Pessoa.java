public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void relatorio() {
		System.out.println("\n=== Relatório Pessoa ===");
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.peso);
		System.out.println(this.cpf);
	}
}
