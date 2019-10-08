package ejercicios;

import java.util.Scanner;
import java.lang.Math;

public class Quiz {
	private int cantidad = 10;
	private String[] operandos = {"+", "-", "*", "/"};
	private String[] preguntas = new String[cantidad];
	private int[] respuestas = new int[cantidad];
	
	public Quiz(int cantPreguntas) {
		this.cantidad = cantPreguntas;
	}
	
	public Quiz() {}
	
	public void generarPreguntas() {
		for(int i = 0; i < preguntas.length; i++) {
			int numA = (int) ((Math.random() * 10) + 1);
			int numB = (int) ((Math.random() * 10) + 1);
			int operando = (int) ((Math.random() * 3) + 1);
			String operador = operandos[operando];
			
			preguntas[i] = "¿Cuánto es " + numA + operador + numB + "?";
			switch(operador) {
				case "+":
					respuestas[i] = numA + numB;
					break;
				case "-":
					respuestas[i] = numA - numB;
					break;
				case "*":
					respuestas[i] = numA * numB;
					break;
				case "/":
					int respuesta = (int) numA / numB;
					respuestas[i] = respuesta;
					break;
			}
		}		
	}
	
	public void preguntar() {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < preguntas.length; i++) {
			
			System.out.println(preguntas[i]);
			
			int respuesta = input.nextInt();
			
			if(respuesta == respuestas[i]) {
				System.out.println("Respuesta correcta.");
			} else {
				System.out.println("Respuesta incorrecta. La respuesta es " + respuestas[i]);
			}
		}
		
		input.close();
	}
	
}