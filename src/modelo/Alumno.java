package modelo;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private double nota;
	
	public Alumno(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public Alumno() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Alumno a) {
		/*if(this.nombre == null) {
			return 0;
		}
		return this.nombre.compareTo(a.nombre);*/
		if(this.nota == a.nota) {
			return 0;
		}
		
		if(this.nota >a.nota) {
			return 1;
		} else{
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return nombre + ", nota=" + nota;
	}
	
	
}
