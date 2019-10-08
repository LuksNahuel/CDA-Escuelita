package ejercicios;

import ejercicios.Dado;

public class Dados {

	public static void main(String[] args) {
		Dado[] dados = new Dado[5];
		dados[0] = new Dado();
		dados[1] = new Dado();
		dados[2] = new Dado();
		dados[3] = new Dado();
		dados[4] = new Dado();
		
		int suma = 0;
		for(int i = 0; i < dados.length; i++) {
			int aux = dados[i].tirarDado();
			System.out.println("Se tiró el dado " + aux);
			suma += aux;
			
		}
		System.out.println("La suma total fue " + suma);		

	}
	
	
	

}

