package org.alumno;

import java.util.Random;

public class AlumnosArray {
    private final static String [] nombres = {"Alejandra","Candela","Vega","Sergio"};

    public void rellanarArray(Alumno[] datos) {
        Random rand = new Random();
        for(int i = 0; i < datos.length; i++) {
            datos[i] = new Alumno(nombres[rand.nextInt(nombres.length)], rand.nextInt(5)+10);
            System.out.println(datos[i]);
        }
    }

public void compararArray(String name, int edad, Alumno[] datos) {
        int cont = 0;
    for (Alumno dato : datos) {
        if ((dato.getName().equals(name)) && (dato.getEdad() == edad))
            cont++;
    }
    System.out.println("Se repite " + cont + " veces");
    }
}
