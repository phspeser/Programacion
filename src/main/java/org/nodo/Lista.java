package org.nodo;

import jdk.jshell.spi.SPIResolutionException;

public class Lista {

    private Nodo primero;
    private int tamano;

    public void remove(int index) {
        Nodo aBorrar = null;
        String info = "";

        if ((!isEmpty()) && (index <= tamano) && (index >=0)){
            if (index == 0){
                aBorrar = primero;
                primero = primero.getSig();
            }else{
                aBorrar = primero.getSig();
                Nodo anterior = primero;
                for (int i = 1; i < tamano; i++){
                    aBorrar = aBorrar.getSig();
                    anterior = anterior.getSig();
                }
                if (index == tamano - 1){
                    anterior.setSig(null);
                    info = aBorrar.getInfo();
                } else {
                    anterior.setSig(aBorrar.getSig());
                    aBorrar.setSig(null);
                }
                info = aBorrar.getInfo();
                aBorrar = null;
            }

        }
    }

    public void add(String info) {
        Nodo nuevo = new Nodo(info);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo aux = primero;

            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        tamano++;
    }

    public void print() {
        Nodo aux = primero;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getSig();
        }
    }

    public int size() {
        return tamano;
    }

    public int sizeV2() {
        int contador = 0;
        Nodo aux = primero;
        while (aux != null) {
            contador++;
            aux = aux.getSig();
        }
        return contador;
    }


    public boolean isEmpty() {
        return primero == null;
    }

    public boolean isEmptyV2() {
        return tamano == 0;
    }
}
