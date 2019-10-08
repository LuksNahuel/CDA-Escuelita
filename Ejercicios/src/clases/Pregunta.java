package clases;
import java.lang.Math;
import java.util.Scanner;

public class Pregunta {
	private int respuesta;
	private String[] operandos = {"+", "-", "*", "/"};
	
	private String generarUnaPregunta() {
		int numA = (int) ((Math.random() * 10) + 1);
		int numB = (int) ((Math.random() * 10) + 1);
		int operando = (int) ((Math.random() * 3) + 1);
		String operador = operandos[operando];
		
		switch(operador) {
		case "+":
			respuesta = numA + numB;
			break;
		case "-":
			respuesta = numA - numB;
			break;
		case "*":
			respuesta = numA * numB;
			break;
		case "/":
			respuesta = (int) numA / numB;
			break;
		}
		return "¿Cuánto es " + numA + operandos[operando] + numB + "?";
	}
	
	
	
	public void preguntar() {
		Scanner input = new Scanner(System.in);
		char seguir = ' ';
		do {
			String pregunta = this.generarUnaPregunta();
			System.out.println(pregunta);
			int respuestaUsuario = input.nextInt();
		
			if(respuesta == respuestaUsuario) {
				System.out.println("Respuesta correcta.");
			} else {
				System.out.println("Respuesta incorrecta. La respuesta es " + respuesta);
			}
			System.out.println("¿Querés seguir respondiendo? (s/n)");
			
			seguir = Character.toLowerCase(input.next().charAt(0));
		}  while (seguir == 's');
		
		input.close();
	}
}
