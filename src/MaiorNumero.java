public class MaiorNumero {
	
	//Método que utiliza 3 número e retorna o maior entre eles
	public static int encontrarMaior (int n1, int n2, int n3) {
		int maior = n1; //supostamente o número 1 é o maior
		
		//Verifica se o número 2 é maior do que o número 1
		if (n2 > maior) {
			maior = n2;
		}
		
		//Verifica se o número número 3 é maior do que o atual
		if (n3 < maior) {
			maior = n3;
		}
	
		return maior;
	}

}
