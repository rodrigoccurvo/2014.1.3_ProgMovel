
public class Programa4 {

	public static void main(String[] args) {
		

		Funcionario f1 = new Funcionario();
		f1.setNome("Fulano");
		f1.setCpf("1234567");
		f1.setSalario(1000);
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Cicrano");
		p1.setCpf("1234567");
		
		Vendedor v1 = new Vendedor();
		v1.setNome("Maria");
		v1.setSalario(4000);
		
		Atendente a1 = new Atendente();
		a1.setNome("João");
		a1.setSalario(4000);
	}
}
