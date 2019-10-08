package ejercicios;
import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		
		String nombre = input.nextLine();
		
		System.out.println("Bienvenido " + nombre);		
		
		input.close();
	}

}

