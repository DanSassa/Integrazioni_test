import org.example.Homework1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Homework1Test {
    Homework1 homework1 = new Homework1();
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

    }

    @Test
    @DisplayName("check risultato corretto")
    void checkRisultatoCorretto() {
        Homework1 homework1 = new Homework1();
/*
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
*/


        int[][] result = {
                {30, 24, 18},
                {84, 69, 54},
                {138, 114, 90}
        };
        assertArrayEquals(result,Homework1.moltiplicaMatrici(matrice1,matrice2));
    }


}
