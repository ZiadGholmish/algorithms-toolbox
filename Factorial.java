import java.util.*;

class Factorial{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// System.out.println("the recurr == " + calcFactorialRecur(n));
		// System.out.println("the brute force == " +calcFactorialBrute(n));
		stressTestFactorial(n);
	}

	private static long calcFactorialRecur(int n){
		if(n <= 0) return 1;
		return n * calcFactorialRecur(n-1);
	}

	private static long calcFactorialBrute(int n){
		long result  = 1;
		for(int i = 1 ; i <= n ; i++){
			result = result * i;
		}		
		return result;
	}
	/** 
	* do the stress testing to the algorithms by generating a random number
	*/
	private static void stressTestFactorial(int n){
			while(true){
			    int randomN= (int) (Math.random() * (30 - 0)) + 0;
				if(calcFactorialRecur(randomN) == calcFactorialBrute(randomN) ){
				  System.out.println("OKK == " + randomN +  " == " + calcFactorialRecur(randomN) );
				}else{
					 System.out.println("NOT OK == " + randomN );
					 break;
				}
			}
	}

}