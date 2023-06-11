package org.example;

public class Homework2{

        public float OperationsBetweenNumbers(int var1, int var2) {


                float op;
                if(var1 == 0 || var2 == 0)
                    throw new IllegalArgumentException();
                else{
                    if (var1 >0 && var2 >0){
                        op= var1+var2;
                    } else if (var1 <0 && var2 <0) {
                        op= var1-var2;
                    } else if (var1>0) {
                        op= var1*var2;
                    } else {
                        op= (float) var1 /var2;
                    }
                }
                return op;
            }



    public  void printTotal( float tot) {
        System.out.println("Total: " + tot);
    }
}
