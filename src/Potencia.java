public class Potencia {
    public static double calcularPotencia(double a, int b) {
	double resultado = 1;

    // Verifica se o expoente é 0
    if (b == 0) {
        return 1; // qualquer número elevado a 0 é 1
    }

    // Caso o expoente seja positivo
    if (b > 0) {
        for (int i = 1; i <= b; i++) {
            resultado *= a;
        }
    } 
    // Caso o expoente seja negativo
    else {
        for (int i = 1; i <= -b; i++) {
            resultado *= a;
        }
        resultado = 1 / resultado; // Inverte o resultado se o expoente for negativo
    }

    return resultado;
}

   
}


