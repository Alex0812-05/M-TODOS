public class Fatoracao {
	
	//Método que calcula o fatorial de um número
	public static int calcularFatorial(int numero) {
		int fatorial = 1;
		
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;
			
		}
		
		//Retorna o resultado do fatorial
		return fatorial;
	}
	

}
