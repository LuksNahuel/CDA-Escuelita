package ejercicios;

public class Fibonacci {
	int numero_N(int n) {
		int salida = 0;
		
		if(n <= 2) {
			salida = 1;
		} else {
			salida = numero_N(n - 1) + numero_N(n - 2);
		}
		
		return salida;
	}
}
