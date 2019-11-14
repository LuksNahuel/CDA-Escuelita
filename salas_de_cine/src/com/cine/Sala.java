package com.cine;
import java.util.Scanner;

public class Sala {
	private int[][] asientos = new int[4][5];
	private int precioNinio = 15;
	private int precioAdulto = 20;
	private int precioJubilado = 18;
	
	
	public void iniciarVentas() {
		Scanner input = new Scanner(System.in);
		char respuesta = 's';
		
		do {
			System.out.println("Ingrese la fila (de 1 a 5):");
			int fila = Integer.parseInt(input.nextLine()) - 1;
			
			System.out.println("Ingrese la butaca (de 1 a 4):");
			int butaca = Integer.parseInt(input.nextLine()) - 1;
			
			System.out.println("Ingrese su edad: ");
			
			int edad = Integer.parseInt(input.nextLine());
			
			int precio = 0;
			
			if(edad < 18) {
				precio = this.precioNinio;
			} 
			else if(edad > 18 && edad < 65) {
				precio = this.precioAdulto;
			}
			else {
				precio = this.precioJubilado;
			}
			
			if(this.asientos[fila][butaca] == 0) {
				this.asientos[fila][butaca] = precio;
			} 
			else {
				System.out.println("La butaca se encuentra ocupada, por favor seleccione otra.");
			}
			
			System.out.print("¿Desea continuar comprando? (s/n) \n");
			
			respuesta = input.nextLine().charAt(0);
		}
		
		while(respuesta == 's');
		
		input.close();
		
	}
	
	public int butacasVendidas() {
		int butacas = 0;
		for(int i = 0; i < this.asientos.length; i++) {
			for(int j = 0; j < this.asientos[0].length; j++) {
				if(this.asientos[i][j] != 0) {
					butacas++;
				}
			}
		}
		return butacas;
	}
	
	public void imprimirButacas() {
		for(int i = 0; i < this.asientos.length; i++) {
			System.out.print("|");
			for(int j = 0; j < this.asientos[0].length; j++) {
				if(this.asientos[i][j] != 0) {
					System.out.print("X");
				}
				else {
					System.out.print(this.asientos[i][j]);
				}
			
				if (j!=this.asientos[i].length-1) System.out.print("\t");
			}
			System.out.println("|");
		}
	}
	
	public int butacasLibres() {
		int butacas = 0;
		for(int i = 0; i < this.asientos.length; i++) {
			for(int j = 0; j < this.asientos[0].length; j++) {
				if(this.asientos[i][j] == 0) {
					butacas++;
				}
			}
		}
		return butacas;
	}
	
	public int recaudacion() {
		int total = 0;
		for(int i = 0; i < this.asientos.length; i++) {
			for(int j = 0; j < this.asientos[0].length; j++) {
				total += this.asientos[i][j];
			}
		}
		return total;
	}
	
	public int getPrecioNinio() {
		return precioNinio;
	}

	public void setPrecioNinio(int precioNinio) {
		this.precioNinio = precioNinio;
	}

	public int getPrecioAdulto() {
		return precioAdulto;
	}

	public void setPrecioAdulto(int precioAdulto) {
		this.precioAdulto = precioAdulto;
	}

	public int getPrecioJubilado() {
		return precioJubilado;
	}

	public void setPrecioJubilado(int precioJubilado) {
		this.precioJubilado = precioJubilado;
	}
}
