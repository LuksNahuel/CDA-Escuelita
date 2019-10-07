package ejercicios;
import ejercicios.Quiz;

public class evaluacion {

	public static void main(String[] args) {
		Quiz cuestionario = new Quiz();
		//System.out.println(cuestionario.respuestas.length);
		cuestionario.generarPreguntas(10);
		cuestionario.preguntar();
	}
}
