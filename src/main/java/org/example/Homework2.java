package org.example;

public class Homework2 {

        public int sum(int var1, int var2, int var3) {
            int sum = 0;

            if (var1 > 0 && var2 > 0) {
                sum = var1 + var2;

                if (var3 > 0 && (var1 % 2 == 0 || var2 % 2 == 0 || var3 % 2 == 0)) {
                    sum += var3;
                }
            } else if (var1 > 0 && var3 > 0) {
                sum = var1 + var3;

                if (var2 > 0 && var1 % 3 == 0 && var2 % 3 == 0) {
                    sum += var2;
                }
            } else if (var2 > 0 && var3 > 0) {
                sum = var2 + var3;

                if (var1 > 0 && var1 % 2 != 0 && var2 % 2 != 0 && var3 % 2 != 0) {
                    sum += var1;
                }
            }

            return sum;
        }

    public  void printSum( int somma) {
        System.out.println("Sum: " + somma);
    }
}
