package org.example;

public class Homework3 {

    public float divisione(int a, int b) throws ArithmeticException {
        if((a<-50 || a >50) || (b<-50 || b>50)){
            throw new IllegalArgumentException("i valori devono essere compresi tra -50 e 50.");

        }else{
            return (float)a/b;
        }
    }


}
