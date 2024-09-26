public class Principal {
	public static void main (String[] args) {
		
		//Número para qual o fatorial será calculado
		int numero = 3;
		int resultado = Fatoracao.calcularFatorial(numero);
		
		//Imprime o resultado
		System.out.println("O fatorial de " + numero + " é: " + resultado);
	}

}
