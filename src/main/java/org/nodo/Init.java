package org.nodo;

import java.util.ArrayList;
import java.util.List;

public class Init {

    public static void main(String []args){

        Lista lista = new Lista();

        System.out.println("Esta vacia?: ");
        System.out.println(lista.isEmpty() ? "Si" : "No");

        lista.add("Informacion 1");
        lista.add("Informacion 2");
        lista.add("Informacion 3");

        lista.print();

        System.out.println("Tamaño de la lista es: " + lista.size());
        System.out.println("Esta vacia?: ");
        System.out.println(lista.isEmpty() ? "Si" : "No");
    }

}
