import java.util.*;

class InsertionSort{

	public static void main(String[] args) {
		int[] numbers = {5 , 2, 5, 46 , 0 , 1 , 5, 89};
		InsertionSortImpl insertionImp = new InsertionSortImpl();
		insertionImp.sort(numbers);

		printArray(numbers , " / ");
	}
	 static void printArray(int[] arr , String symbol){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i] + " " + symbol); 
		}
	}
}

class InsertionSortImpl{

	public void sort(int[] numbers){

		int n = numbers.length;
		for( int j = 1 ; j < n ; j++){

			//get the key to compare with
			int key = numbers[j];
			int i = j-1;

			while(i > -1 && (numbers[i] > key)){
				//shift the array 
				numbers[i+1] = numbers[i];
				i--;
			}
			//add the key in the right place 
			numbers[i+1] = key;
		}
	}
}