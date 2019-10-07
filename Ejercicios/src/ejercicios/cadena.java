package ejercicios;
import java.util.Scanner;

public class cadena {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = input.nextLine();
		input.close();
		for(int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
		}
	}

}
