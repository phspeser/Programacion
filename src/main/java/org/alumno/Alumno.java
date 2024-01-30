package org.alumno;

public class Alumno {
	
	private String name;
	private int edad;
	
	public Alumno(String alumno) {
		this.name = alumno;
	}
	
	public Alumno(String alumno, int edad) {
		this.name = alumno;
		this.edad = edad;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String alumno) {
		this.name = alumno;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", edad=" + edad + "]";
	}


	
	
	
	

}
