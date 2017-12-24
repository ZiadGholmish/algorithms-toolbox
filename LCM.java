import java.util.*;

public class LCM {

  private static long lcm_naive(int a, int b) {

    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

      return (long) a * b;
    }

    private static long lcm(long a, long b) {

      if(a > b){
        long temp = b;
        b = a;
        a = temp; 
      }
    return (a * b) / calcGCDRecurr(a , b);
    }

    private static long calcGCDRecurr(long a , long b){
    if(b == 0){ 
      return a;
    }else{
      return calcGCDRecurr(b , a % b);
    }
  }

    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();

   // System.out.println("LCM == " + lcm_naive(a, b));
      System.out.println(lcm(a, b));

   // stressTestGCD();
    }


    private static void stressTestGCD(){
      while(true){
        int a= (int) (Math.random() * (100- 2)) + 2;
        int b= (int) (Math.random() * (200 - 100) )+ 100;
        if(lcm_naive(a,b) == lcm(a,b)){
          System.out.println("Okk " + a +" == " + b + " ^^^ " + lcm_naive(a,b)) ;
        }else{
          System.out.println("NOT Okk " + a +" == " + b + " ^^^r " + lcm_naive(a,b) + " ^^^b " + lcm(a,b) ) ;
          break;
        }
      }
    }
  }
