
public class Programa2 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Fulano");
		p1.setIdade(30);
		p1.setCpf("12345678900");
		p1.setPeso(80.5);
		
		
		Conta c1 = new Conta();
		
		c1.setAgencia("1234");
		c1.setNumero("000000009-X");
		c1.deposita(100.50);
		
		c1.setTitular(p1);
		
		c1.relatorio();
		
		p1.setPeso(130);
		
		c1.relatorio();
	}
}
