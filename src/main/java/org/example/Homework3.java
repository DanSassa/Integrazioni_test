package org.example;

public class Homework3 {

    public float divisione(float a, float b) throws IllegalArgumentException {
        if(b==0)
            throw new ArithmeticException("non si può dividere un numero per 0!");

        return a/b;

    }


}
