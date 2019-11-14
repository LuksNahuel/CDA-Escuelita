package com.cine;
import com.cine.Sala;

public class Program {

	public static void main(String[] args) {
		Sala sala = new Sala();
		
		sala.iniciarVentas();
		
		System.out.println(sala.butacasVendidas());
		System.out.println(sala.butacasLibres());
		System.out.println(sala.recaudacion());
		
		sala.imprimirButacas();

	}

}
