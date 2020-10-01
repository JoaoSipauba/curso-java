package classe;

public class Data {
	String dia;
	String mes;
	String ano;
	
	Data(){
		this.dia = "1";
		this.mes = "1";
		this.ano = "1750";
	}
	
	Data(String dia,String mes,String ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String obterDataFormatada() {
		return String.format("%s/%s/%s", dia,mes,ano);
	}
}
