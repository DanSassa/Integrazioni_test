package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Homework2Test {
    Homework2 homework2 = new Homework2();
    //TEST PER IL 100% DI CC
    @Test
    void testZeri() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(55,0));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(0,1));
    }

    @Test
    @DisplayName("test sulla somma dei due valori")
    void testSomma() {
        Assertions.assertEquals(10, homework2.OperationsBetweenNumbers(5,5));
    }

    @Test
    @DisplayName("test sulla sottrazione dei due valori")
    void testSottrazione() {
        Assertions.assertEquals(-4, homework2.OperationsBetweenNumbers(-8,-4));
    }

    @Test
    @DisplayName("test sulla moltiplicazione dei due valori")
    void testMoltiplicazione() {
        Assertions.assertEquals(-35, homework2.OperationsBetweenNumbers(7,-5));
    }

    @Test
    @DisplayName("test sulla divisione dei due valori")
    void testDivisione() {
        Assertions.assertEquals(-5, homework2.OperationsBetweenNumbers(-10,2));
    }

    //TEST BLACK-BOX

    @Test
    @DisplayName("test sulla correttezza dei risultati")
    void testRisultatoCorretto() {
        Assertions.assertEquals(4, homework2.OperationsBetweenNumbers(2,2));
        Assertions.assertEquals(40, homework2.OperationsBetweenNumbers(25,15));
        Assertions.assertEquals(-20, homework2.OperationsBetweenNumbers(10,-2));
    }
    @Test
    void testValoreNullo() {
        Integer v= null;
        //T1
        Assertions.assertThrows(NullPointerException.class, ()-> homework2.OperationsBetweenNumbers(v,4) );
        //T2
        Assertions.assertThrows(NullPointerException.class, ()-> homework2.OperationsBetweenNumbers(4,v) );
    }

    @Test
    void boundaryCases() {
        //T3 SOMMA
        Assertions.assertEquals(3, homework2.OperationsBetweenNumbers(1,2));
        //T4 SOMMA
        Assertions.assertEquals(3, homework2.OperationsBetweenNumbers(2,1));
        //T5 MOLTIPLICAZIONE
        Assertions.assertEquals(-2, homework2.OperationsBetweenNumbers(1,-2));
        //T6 DIVISIONE
        Assertions.assertEquals(-2, homework2.OperationsBetweenNumbers(-2,1));
        //T7 DIVISIONE
        Assertions.assertEquals(-0.5, homework2.OperationsBetweenNumbers(-1,2));
        //T8 MOLTIPLICAZIONE
        Assertions.assertEquals(-2, homework2.OperationsBetweenNumbers(2,-1));
        //T9 SOTTRAZIONE
        Assertions.assertEquals(1, homework2.OperationsBetweenNumbers(-1,-2));
        //T10 SOTTRAZIONE
        Assertions.assertEquals(-1, homework2.OperationsBetweenNumbers(-2,-1));

    }
}
