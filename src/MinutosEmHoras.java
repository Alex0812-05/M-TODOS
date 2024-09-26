public class MinutosEmHoras {
	
	//Método que recebe números em horas e os converte para minutos
	public static String converterMinutosParaHoras(int totalMinutos) {
		int horas = totalMinutos / 60;
		int minutos = totalMinutos % 60;
		
		//Retorna com horas e minutos
		return horas + " horas e " + minutos + "minutos";
		
	}

}
