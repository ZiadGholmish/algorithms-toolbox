	import java.util.*;

	public class FibanocciNumebrs {

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			//System.out.println("the lazy way == " + calcFibRecucrssion(n));
			//System.out.println("the fast way ==" + calcFibFast(n));
			strssTestFib();
		}


		private static long calcFibRecucrssion(int n){
			if(n <= 1) return n ; 	
			return calcFibRecucrssion(n-1) + calcFibRecucrssion(n-2); 
		}

		private static long  calcFibFast(int n){

        	if(n <= 1) return n ; 			
			long[] numbers = new long[n];   
			numbers[0]  = 0;   
			numbers[1]  = 1;
			for(int i = 2 ; i < numbers.length ; i++){
				numbers[i] = numbers[i-1] + numbers[ i -2];
			}
			return numbers[numbers.length-1] + numbers[numbers.length-2];
		}

		/**
		* do stress testing for the fib numbers by generating random n and calculate the fib
		*for this random number
		*/
		private static void strssTestFib(){

 			while(true){
			    int randomN= (int) (Math.random() * (9 - 0)) + 0;
				if(calcFibRecucrssion(randomN) == calcFibFast(randomN) ){
				  System.out.println("OKK == " + randomN+  " == " + calcFibFast(randomN) );
				}else{
					 System.out.println("NOTOK == " + randomN );
					 break;
				}
			}
		}
	}