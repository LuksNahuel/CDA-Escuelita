package ejercicios;
import java.lang.Math;

public class Dado {
	public int tirarDado() {
		double random = (Math.random() * ((6 - 1) + 1)) + 1;
		
		int salida = (int)random;
		
		return salida;
	}
}