package ejercicios;
import ejercicios.Fibonacci;

public class Sucesion_Fibonacci {

	public static void main(String[] args) {
	
		Fibonacci fibo = new Fibonacci();


		for(int i = 1; i<11; i++) {
			System.out.println(fibo.numero_N(i));
		}
		

	}

}
