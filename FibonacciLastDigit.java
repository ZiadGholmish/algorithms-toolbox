import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    private static int getFibonacciLastDigitEnhance(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous %10 + current %10;
        }

        return current % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
      //  int c = getFibonacciLastDigitNaive(n);
        int d = getFibonacciLastDigitEnhance(n);
       // System.out.println(c);
        System.out.println(d);

       // strssTestFib();
    }


    /**
        * do stress testing for the fib numbers by generating random n and calculate the fib
        *for this random number
        */
        private static void strssTestFib(){

            while(true){
                int randomN= (int) (Math.random() * (30 - 0)) + 0;
                if(getFibonacciLastDigitNaive(randomN) == getFibonacciLastDigitEnhance(randomN) ){
                  System.out.println("OKK == " + randomN+  " == " + getFibonacciLastDigitEnhance(randomN) );
                }else{
                     System.out.println("NOTOK == " + randomN );
                     break;
                }
            }
        }



}

