import java.util.*;
class QuickSortLastElementAsPivot{	

	public static void main(String[] args) {

		int[] numbers = { 2, 7, 1, 8, 6, 3, 5, 4};
		quickSort(numbers , 0 , numbers.length-1);
		printTheSortedArray(numbers , " / ");
	}

	private static int partition(int[] numbers, int low , int high){

		int pivot  = numbers[high];
		int i = low - 1 ;
		for(int j = low  ; j < high ; j++ ){
			
			if(numbers[j] <= pivot){
				//increment the i and swap it with j
				i = i+1;
				int tempValue = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = tempValue;
			}
		}

		//now replace the pivot with i
		i = i +1;
		int iTempValue = numbers[i];
		numbers[i] = pivot;
		numbers[high] = iTempValue;
		printTheSortedArray(numbers , " * ");
		return i;	
	}

	private static void quickSort(int[] numbers, int low , int high){
		if(low < high){
			int i = partition(numbers, low ,  high);
			quickSort(numbers, low , i -1);
			quickSort(numbers , i + 1 , high);
		}
	}

	private static void printTheSortedArray(int[] numbers , String symbol){
		for(int i = 0 ; i < numbers.length ; i++){
			System.out.print(numbers[i] + symbol);
		}
		System.out.println();
	}

}