package clases;

public class Alumno {
	
	public Alumno(int dni, String nombre, int materias) {
		this.DNI = dni;
		this.nombre = nombre;
		this.materias = materias;
	}
	
	public Alumno() { }
	
	private int DNI;
	private String nombre;
	private int materias;
	
	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaterias() {
		return materias;
	}

	public void setMaterias(int materias) {
		this.materias = materias;
	}
	
}
