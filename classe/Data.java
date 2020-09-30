package classe;

public class Data {
	static String dia;
	String mes;
	String ano;
	
	Data(){
		dia = "1";
		mes = "1";
		ano = "1";
	}
	
	Data(String diaInformado,String mesInformado,String anoInformado){
		dia = diaInformado;
		mes = mesInformado;
		ano = anoInformado;
	}
	String obterDataFormatada() {
		return String.format("%s/%s/%s", dia,mes,ano);
	}
}
