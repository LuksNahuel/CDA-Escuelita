package ejercicios;

import java.util.Scanner;
import java.lang.Math;

public class Quiz {
	
	String[] preguntas = new String[10];
	int[] respuestas = new int[10];
	String[] operadores = {"+", "-", "*", "/"};
	
	public void preguntar() {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<preguntas.length; i++) {
			
			System.out.println(preguntas[i]);
			
			int respuesta = input.nextInt();
			
			if(respuesta == respuestas[i]) {
				System.out.println("Respuesta correcta.");
			} else {
				System.out.println("Respuesta incorrecta.");
			}
			
		}
		input.close();
	}
	public void generarPreguntas(int cantidadPreguntas) {
		
		for(int i = 0; i<cantidadPreguntas; i++) {
			
			int a = (int)Math.floor(Math.random()*100+1);
			int b = (int)Math.floor(Math.random()*100+1);
			int c = (int)Math.floor(Math.random()*4+1);
			
			int respuesta = a + b;
			switch(operadores[c]) {
				case "+":
					respuesta = 
					
			}
			String cadena = "¿Cuánto es " + a + " + " + b +"?";
			preguntas[i] = cadena;
			
			respuestas[i] = respuesta;
		}
	}
}