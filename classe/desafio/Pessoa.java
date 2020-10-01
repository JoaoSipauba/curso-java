package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(double peso, String nome){
		this.peso = peso;
		this.nome = nome;
	}
	
	void comer(Comida comida){
		if(comida != null) {			
			this.peso += comida.peso;
			System.out.println("Comeu "+ comida.nome);
		}
	}
}
