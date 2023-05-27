package org.example;

public class Homework2{

        public int OperationsBetweenNumbers(int var1, int var2) {

            int op=0;
            if(var1 ==0 && var2 == 0)
                throw new IllegalArgumentException();
           else{
                if (var1 >0 && var2 >=0){
                    op= var1+var2;
                    System.out.println("somma: ("+ var1 + ")+(" + var2 + ") =" + op);
                } else if (var1 <0 && var2 <0) {
                    op= var1-var2;
                    System.out.println("differenza: ("+ var1 + ")-(" + var2 + ") =" + op);
                } else if (var1>=0 && var2 <0 ) {
                    op= var1*var2;
                    System.out.println("moltiplicazione: ("+ var1 + ")*(" + var2 + ") =" + op);
                } else if((var1 <0 && var2>0) || (var1 ==0 && var2 >0)){
                    op=var1/var2;
                    System.out.println("divisione: ("+ var1 + ")/(" + var2 + ") =" + op);
                }
            }
            return op;
        }

    public  void printTotal( int tot) {
        System.out.println("Total: " + tot);
    }
}
