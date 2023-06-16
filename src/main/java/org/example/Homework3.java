package org.example;

public class Homework3 {

    public float divisione(float a, float b) {
        if (b != 0) {
            if ((a < -50.0f || a > 50.0f) || (b < -50.0f || b > 50.0f))
                throw new IllegalArgumentException("FUORI DAL RANGE!");
            return a / b;
        } else {
            throw new ArithmeticException("non si può dividere un numero per 0!");
        }

    }


}
