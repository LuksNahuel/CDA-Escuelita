package Polinomio;
import java.util.Scanner;

public class Polinomio {
	private int grado;
	
	private int[] polinomio;
	
	private void pedirGrado(int grado) {
		this.grado = grado;
		this.polinomio = new int[this.grado + 1];
	}
	
	public void ingresarCoeficientes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese el grado del polinomio: ");
		this.pedirGrado(input.nextInt());
		
		for(int i = this.grado; i >= 1; i--) {
			System.out.print("Ingrese el coeficiente de grado " + i + ": ");
			int coeficiente = input.nextInt();
			polinomio[i] = coeficiente;
		}
		
		System.out.print("Ingrese el término independiente: ");
		polinomio[0] = input.nextInt();
		
		System.out.print("Evaluar el polinomio en el grado: ");
		this.evaluarEnX(input.nextInt());
		
		input.close();
	}
	
	private void evaluarEnX(int x) {
		int salida = 0;
		for(int i = this.grado; i >= 0; i--) {
			salida = this.polinomio[i] + (x * salida);
		}
		
		System.out.println("El polinomio evaluado en " + x + " es igual a " + salida + ".");
	}
	
	
}
