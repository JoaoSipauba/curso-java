package classe;

public class DataTeste {
	public static void main(String[] args) {
		var d1 = new Data();
		var d2 = new Data("4","1","4059");

		Data.dia = "12";
		d1.mes = "4";
		d1.ano = "2018";
		String dataFinal1 = d1.obterDataFormatada();
		String dataFinal2 = d2.obterDataFormatada();
		
		System.out.printf("A data informada é: %s",dataFinal1);
		System.out.println();
		System.out.printf("A data informada é: %s",dataFinal2);
	}
}
