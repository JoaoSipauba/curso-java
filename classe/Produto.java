package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto;
	
	Produto(){
		desconto = 0.25;
	}
	
	Produto(String nomeInformado){
		nome = nomeInformado;
	}
	
	double precoComDesconto() {
		return preco*(1-desconto);
	}
}
