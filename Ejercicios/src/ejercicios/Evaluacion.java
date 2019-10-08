package ejercicios;
import ejercicios.Quiz;

public class Evaluacion {

	public static void main(String[] args) {
		Quiz cuestionario = new Quiz(10);
		cuestionario.generarPreguntas();
		cuestionario.preguntar();
	}
}

