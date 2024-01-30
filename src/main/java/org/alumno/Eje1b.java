package org.alumno;

import java.util.Scanner;

public class Eje1b {
	

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Alumno[] datos = new Alumno[20];
		AlumnosArray rellenar = new AlumnosArray();



		rellenar.rellanarArray(datos);
		
		System.out.println("Dame el nombre a buscar (Alejandra, Candela, Vega, Sergio)");
		String nomBuscar = sc.next();
		System.out.println("Dame la edad a buscar (10 al 15)");
		int edadBuscar = sc.nextInt();
		sc.close();

		rellenar.compararArray(nomBuscar, edadBuscar,datos);
	}


	


}
