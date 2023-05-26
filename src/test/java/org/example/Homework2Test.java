package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Homework2Test {
    Homework2 homework2 = new Homework2();

    @Test
    void testOperazione() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(0,1));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(1,0));
        Assertions.assertThrows(IllegalArgumentException.class, ()-> homework2.OperationsBetweenNumbers(0,0));
    }

    @Test
    @DisplayName("test sul risultato della somma")
    void testRisultatoCorretto() {
        Assertions.assertEquals(4, homework2.OperationsBetweenNumbers(2,2));
        Assertions.assertEquals(0, homework2.OperationsBetweenNumbers(-2,-2));
        Assertions.assertEquals(-8, homework2.OperationsBetweenNumbers(4,-2));
        Assertions.assertEquals(-1, homework2.OperationsBetweenNumbers(-2,2));
    }
}
