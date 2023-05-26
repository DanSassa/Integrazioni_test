package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Homework1Test {
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

    int[][] matrice3 = {
            {9, 8},
            {3, 2}
    };

/*
    @Test
    @DisplayName("test verifica risultato")
    void testVerificaRisultato() {
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

        int[][] matriceResult = {
                {30, 24, 18},
                {84, 69, 54},
                {138, 114, 90}
        };


        assertEquals(matriceResult, homework1.moltiplicaMatrici(matrice1, matrice2));
    }
*/
    @Test
    @DisplayName("test matrici moltiplicabili")
    void testMatriciMoltiplicabili() {

        assertEquals(matrice1.length, matrice2[0].length);
        assertNotEquals(matrice1.length, matrice3[0].length );
        assertArrayEquals(null, Homework1.moltiplicaMatrici(matrice1,matrice3));
    }

    @Test
    @DisplayName("test risultato corretto")
    void testRisultatoCorretto() {

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

        int[][] matrice3 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrice4 = {
                {9, 8},
                {6, 5},
                {3, 2}
        };

//RISULTATI


        int[][] result = {
                {30, 24, 18},
                {84, 69, 54},
                {138, 114, 90}
        };

        int[][] result1 = {
                {30, 24, 18},
                {84, 69, 54}
        };

        int[][] result2 = {
                {30, 24},
                {84, 69}
        };

        assertArrayEquals(result,Homework1.moltiplicaMatrici(matrice1,matrice2));
        assertArrayEquals(result1,Homework1.moltiplicaMatrici(matrice3,matrice2));
        assertArrayEquals(result2,Homework1.moltiplicaMatrici(matrice3,matrice4));
    }

    @Test
    @DisplayName("test matrici nulle")
    void testMatriceNull() throws NullPointerException {
        //T1
        assertThrows(NullPointerException.class, ()-> Homework1.moltiplicaMatrici(null,matrice1));
        //T2
        assertThrows(NullPointerException.class, ()-> Homework1.moltiplicaMatrici(matrice1,null));
    }

    @Test
    @DisplayName("test matrice identità")
    void testMatriceIdentita() {

        int[][] matrice = {
                {1, 2, 3},
                {4, 1, 6},
                {7, 8, 1}
        };

        int[][] matriceIdentita = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        //T3
        assertArrayEquals(matrice,Homework1.moltiplicaMatrici(matrice,matriceIdentita));
        //T4
        assertArrayEquals(matrice,Homework1.moltiplicaMatrici(matriceIdentita,matrice));


    }

    @Test
    @DisplayName("test matrice zeri")
    void testMatriceZeri() {
        int[][] matriceZeri = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        //T5
        assertArrayEquals(matriceZeri,Homework1.moltiplicaMatrici(matriceZeri,matrice1));
        //T6
        assertArrayEquals(matriceZeri,Homework1.moltiplicaMatrici(matrice1,matriceZeri));


    }

    @Test
    @DisplayName("test matrice negativa")
    void testMatriceNegativa() {

        int[][] matriceNeg = {
                {-9, 8, 7},
                {-6, 5, -4},
                {-3, 2, -1}
        };


        int[][] result = {
                {-30, 24, -4},
                {-84, 69, 2},
                {-138, 114, 8}
        };

        int[][] result1 = {
                {72, 78, 84},
                {-14, -19, -24},
                {-2, -4, -6}
        };


        //T7
        assertArrayEquals(result1,Homework1.moltiplicaMatrici(matriceNeg,matrice1));
        //T8
        assertArrayEquals(result,Homework1.moltiplicaMatrici(matrice1,matriceNeg));


    }


}
