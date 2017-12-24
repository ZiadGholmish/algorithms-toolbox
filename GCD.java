import java.util.*;

class GCD{

	public static void main(String[] args){

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Please enter the firs number");
		// int a = scanner.nextInt();
		// System.out.println("Please enter the second number");
		// int b = scanner.nextInt();
		// System.out.println("the GDC is == " + calcGCDRecurr(a,b));
		// System.out.println("the GDC with brute is == " + calcGCDBrute(a,b));

		stressTestGCD();
	}

	private static long calcGCDRecurr(long a , long b){
		if(b == 0){ 
			return a;
		}else{
			return calcGCDRecurr(b , a % b);
		}
	}

	private static long calcGCDBrute(long a , long b){
		long gcdValue = 0 ;
		for(long i = 1 ; i <= b ; i++){
			if( (a%i == 0) && (b%i == 0)  ){
				gcdValue  = i;
			}
		}
		return gcdValue;
	}

	private static void stressTestGCD(){
		while(true){
			int a= (int) (Math.random() * (10000- 2)) + 2;
			int b= (int) (Math.random() * (20000000 - 10000000) )+ 10000000;
			if(calcGCDRecurr(a,b) == calcGCDBrute(a,b)){
				System.out.println("Okk " + a +" == " + b + " ^^^ " + calcGCDRecurr(a,b)) ;
			}else{
				System.out.println("NOT Okk " + a +" == " + b + " ^^^r " + calcGCDRecurr(a,b) + " ^^^b " + calcGCDBrute(a,b) ) ;
				break;
			}
		}
	}

}