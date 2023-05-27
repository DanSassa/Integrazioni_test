package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Homework2Test {
    Homework2 homework2 = new Homework2();
    @Test
    @DisplayName("test sulla correttezza dei risultati")
    void testRisultatoCorretto() {
        Assertions.assertEquals(4, homework2.OperationsBetweenNumbers(2,2));
        Assertions.assertEquals(40, homework2.OperationsBetweenNumbers(25,15));
        Assertions.assertEquals(-20, homework2.OperationsBetweenNumbers(10,-2));
    }


    @Test
    void testZeri() {
        //T1
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(55,0));
        //T2
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(0,1));
    }

    @Test
    @DisplayName("test sulla somma dei due valori")
    void testSomma() {
        //T3
        Assertions.assertEquals(10, homework2.OperationsBetweenNumbers(5,5));
    }

    @Test
    @DisplayName("test sulla sottrazione dei due valori")
    void testSottrazione() {
        //T4
        Assertions.assertEquals(-4, homework2.OperationsBetweenNumbers(-8,-4));
    }

    @Test
    @DisplayName("test sulla moltiplicazione dei due valori")
    void testMoltiplicazione() {
        //T5
        Assertions.assertEquals(-49, homework2.OperationsBetweenNumbers(7,-7));
    }

    @Test
    @DisplayName("test sulla moltiplicazione dei due valori")
    void testDivisione() {
        //T5
        Assertions.assertEquals(-5, homework2.OperationsBetweenNumbers(-10,2));
    }
}
