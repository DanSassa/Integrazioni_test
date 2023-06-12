package org.example;

import static org.example.Homework1.stampaMatrice;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        stampaMatrice(homework1.prodotto);

        Homework2 homework2 = new Homework2();
        homework2.printTotal(homework2.OperationsBetweenNumbers(-1,2));


    }
}