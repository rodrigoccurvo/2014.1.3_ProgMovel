public class Conta {
	private Pessoa titular;
	private String agencia;
	private String numero;
	private double saldo;
	
	Conta() {
		this.saldo = 0;
	}
	
	Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void relatorio() {
		System.out.println("\n*** Relatório Conta ***");
		this.titular.relatorio();
		System.out.println("\nAg: " + this.agencia);
		System.out.println(this.numero);
		System.out.println(this.saldo);
	}

}
