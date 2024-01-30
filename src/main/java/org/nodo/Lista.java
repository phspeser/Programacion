package org.nodo;

import jdk.jshell.spi.SPIResolutionException;

public class Lista {

    private  Nodo primero;
    private int tamano;

    public void add(String info){
        Nodo nuevo = new Nodo(info);
        if (primero == null){
            primero = nuevo;
        }else {
            Nodo aux = primero;

            while (aux.getSig() != null){
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        tamano++;
    }
    public void print(){
        Nodo aux = primero;
        while (aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getSig();
        }
    }

    public int size(){
        return tamano;
    }
    public int sizeV2() {
        int contador = 0;
        Nodo aux = primero;
        while (aux != null){
            contador++;
            aux = aux.getSig();
        }
        return contador;
    }


    public boolean isEmpty(){
        return primero == null;
    }
    public boolean isEmptyV2(){
        return tamano == 0;
    }
}
