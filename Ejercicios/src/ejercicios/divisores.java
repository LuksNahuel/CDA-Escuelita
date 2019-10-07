package ejercicios;

public class divisores {

	public static void main(String[] args) {
		int max = 0;
		int cantidadMax = 0;
		for(int i = 1; i <= 10000; i++) {
			int cantidad = 0;
			for(int j = 1; j <= (i/2); j++) {
				if(i % j == 0) {
					cantidad++;
				}
				if(cantidad>=cantidadMax) {
					max = i;
					cantidadMax = cantidad;
				}
			}
		}
		System.out.println("El número " + max + " tiene " + cantidadMax + " divisores.");
	}
}
