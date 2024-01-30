package org.ej9;

public class Ej9 {
    public static void main(String[] args) {
        int[][] mat = {{1, 5, 3}, {2, 5, 8}, {5, 6, 1}};

        mostrarMatriz(mat);
        System.out.println();
        calculaSumaFila(mat);
        System.out.println();
        mostrarArraysUnidimensional(mat);

    }

    private static void mostrarMatriz(int[][] mat) {

        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void calculaSumaFila(int[][] mat) {

        int num = 0;

        for (int[] i : mat) {
            for (int j : i) {
                num += j;
            }
            System.out.println(num );
            num = 0;
        }
    }
    

    private static void mostrarArraysUnidimensional(int[][] mat) {

        int total = 0;
        for (int[] fila : mat)
            total += fila.length;

        int[] arraysUniD = new int[total];

        int indice = 0;
        for (int[] fila : mat) {
            for (int i : fila) {
                arraysUniD[indice] = i;
                indice++;
            }
        }

        System.out.print("Array Unidimensional: ");
        for (int num : arraysUniD) {
            System.out.print(num + " ");
        }


    }
}
