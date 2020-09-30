package fundamentos;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		double calculo1 = 6*(3+2);
		calculo1 = Math.pow(calculo1, 2)/(3*2);		
		double calculo2 = Math.pow(((1-5)*(2-7))/2,2);
		double calculo = calculo1-calculo2;
		calculo = Math.pow(calculo, 3)/Math.pow(10, 3);
		System.out.println("O resultado é: "+calculo);
	}
}
