package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(double peso, String nome){
		this.peso = peso;
		this.nome = nome;
	}
	
	void comer(double peso, String nome){
		this.peso += peso;
		System.out.println("Comeu "+ nome);
	}
}
