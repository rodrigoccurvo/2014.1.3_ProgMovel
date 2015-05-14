
public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setIdade(30);
		p1.setCpf("12345678900");
		p1.setPeso(80.5);
		
		Pessoa p3 = null;
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Cicrano");
		p2.setIdade(40);
		p2.setCpf("00000000000");
		p2.setPeso(90.7);
		
		p3 = p2;
		
		p1.relatorio();
		p2.relatorio();
		
		p2.setNome("Maria");
		
		p3.relatorio();	
		p2.relatorio();
	}

}
