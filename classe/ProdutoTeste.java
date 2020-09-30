package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		var p1 = new Produto("Notebook");
		p1.preco = 4356.89;
		Produto.desconto = 0.25;
		double precoFinal1 = p1.precoComDesconto();
		var frase = String.format("Media do carrinho: RS%.2f.",precoFinal1);
		System.out.println("Desconto de "+Produto.desconto);
		System.out.println(frase);

		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.29;	
		double precoFinal2 = p2.precoComDesconto();
		frase = String.format("Media do carrinho: RS%.2f.",precoFinal2);
		System.out.println("Desconto de "+Produto.desconto);
		System.out.println(frase);
	}
}