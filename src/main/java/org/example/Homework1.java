package org.example;

import java.util.Arrays;

public class Homework1 {
    int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[][] matrice2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
    };

/*
    int[] array1 = {0, 1, 2};
    int[] array2 = {2, 1, 0};
*/

    int[][] prodotto = moltiplicaMatrici(matrice1, matrice2);


   // int[] arrayProd = moltiplicaArray(array1, array2);
/*
    public static int[] moltiplicaArray(int[] array1, int[]array2){
        int[] arrayProd = {0,0,0};
        for(int i = 0; i < array1.length; i++){
            arrayProd[i] = array1[i] + array2[i];
        }
        return arrayProd;
    }
*/
    public static int[][] moltiplicaMatrici(int[][] matrice1, int[][] matrice2) {
        int righe1 = matrice1.length;
        int colonne1 = matrice1[0].length;
        int righe2 = matrice2.length;
        int colonne2 = matrice2[0].length;

        if (colonne1 != righe2) {
            System.out.println("Le due matrici non possono essere moltiplicate.");
            return null;
        }

        int[][] prodotto = new int[righe1][colonne2];

        for (int i = 0; i < righe1; i++) {
            for (int j = 0; j < colonne2; j++) {
                for (int k = 0; k < colonne1; k++) {
                    prodotto[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }
        System.out.println("Matrice prodotto: " + Arrays.deepToString(prodotto));
        return prodotto;
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int[] ints : matrice) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }



    }

}

