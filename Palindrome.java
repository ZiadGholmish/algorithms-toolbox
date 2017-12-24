import java.util.*;

class Palindrome{
	
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		StringBuilder strBuilder = new StringBuilder(word.trim());

		// if(isPalindrome(strBuilder)){
		// 	System.out.println("The Word is Palindrome == " + word);

		// }else{
		// 	System.out.println("The Word is not Palindrome == " + word);
		// }

		doStressTestOnString();

	}

	private static char getLastCharOfString(StringBuilder strBuilder){
		return strBuilder.charAt(strBuilder.length()-1);
	}

	private static char getFirstCharOfString(StringBuilder strBuilder){
		return strBuilder.charAt(0);
	}

	private static boolean isPalindrome(StringBuilder strBuilder){
		if(strBuilder.length() <= 1) return true;
		    if(getFirstCharOfString(strBuilder) == getLastCharOfString(strBuilder)){
			    strBuilder.deleteCharAt(0);
			strBuilder.deleteCharAt(strBuilder.length()-1);
			System.out.println(strBuilder.toString());
			return isPalindrome(strBuilder);
		}else{
			return false;
		}
	}

	private static void doStressTestOnString(){

		String[] testCases = new String[6];
     	testCases[0] = "";
		testCases[1] = " a ";
		testCases[2] = "aa";
		testCases[3] = "alkjdadskhasdjha";
		testCases[4] = "kjasdhkahsdkashdkkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdkjasdhkahsdkashdkahdkhaksdasdahdkhaksdasd";
		testCases[5] = "atata";
			
			for(int i = 0 ; i < testCases.length ;  i++){
				StringBuilder strBuilder = new StringBuilder(testCases[i].trim());
				if(isPalindrome(strBuilder)){
					System.out.println("The Word is Palindrome == " + testCases[i]);
		   		 }else{
					System.out.println("The Word is not Palindrome == " + testCases[i]);
		    	}
			}
	}

}