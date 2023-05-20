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
    @DisplayName("test matrice identità")
    void testMatriceIdentita() {

        int[][] matrice1 = {
                {1, 2, 3},
                {4, 1, 6},
                {7, 8, 1}
        };

        int[][] matrice2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        assertArrayEquals(matrice1,Homework1.moltiplicaMatrici(matrice1,matrice2));


    }

    @Test
    @DisplayName("test matrice negativa")
    void testMatriceNegativa() {

        int[][] matrice2 = {
                {-9, 8, 7},
                {-6, 5, 4},
                {3, -2, 1}
        };

        int[][] result = {
                {-12, 12, 18},
                {-48, 45, 54},
                {-84, 78, 90}
        };

        assertArrayEquals(result,Homework1.moltiplicaMatrici(matrice1,matrice2));


    }

    @Test
    @DisplayName("test matrice zeri")
    void testMatriceZeri() {
        int[][] matrice2 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertArrayEquals(matrice2,Homework1.moltiplicaMatrici(matrice1,matrice2));


    }
}
