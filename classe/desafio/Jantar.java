package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		var p1 = new Pessoa(70, "João");
		var pesoInicial = p1.peso;
		
		var c1 = new Comida(1, "Macarrão");
		p1.comer(c1.peso, c1.nome);
		
		var c2 = new Comida(0.5, "Salada");
		p1.comer(c2.peso, c2.nome);
		
		System.out.println();
		System.out.printf("%s pesava %s Kg. Seu novo peso é de %s Kg.",p1.nome, pesoInicial ,p1.peso);
		System.out.println();
		System.out.printf("%s engordou %s Kg",p1.nome, p1.peso-pesoInicial);
	}
}
