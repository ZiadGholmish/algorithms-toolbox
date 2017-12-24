import java.util.*;

class MergeSort{

	public static void main(String[] args) {

		MergeSortImp mergeSortImp = new MergeSortImp();
		
		int[] numbersValues = {5 ,20  , 10, 8, 50,1}; 
		mergeSortImp.sort(numbersValues);
		printArray(numbersValues , " / ");
	}

	 static void printArray(int[] arr , String symbol){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i] + " " + symbol); 
		}
	}

}

class MergeSortImp{

	  private int[] originalArray;
	  private int[] tempArray; 

	 void sort(int[] numbersValues){
	 	originalArray = numbersValues;
		tempArray = new int[originalArray.length];
		doMergeSort(originalArray , 0 , originalArray.length-1 );
	}

	 private void doMergeSort(int[] numbersValues  , int low , int high){

		if(low < high){

			//get the middle item of the array 
			int middle  = low + (high - low)/2;

			//call the recurssion with subarray 
			doMergeSort(numbersValues , low , middle);
			doMergeSort(numbersValues , middle+1 , high);
			mergeParts(low , middle , high);

		}

	}

	private  void mergeParts(int low , int middle , int high){

	//add the values in the temp array 
		for(int i = low ; i <= high ; i++){
			tempArray[i] = originalArray[i];
		}
		//now loop over the temp array and add the values in the origin array 
		int i = low ; 
		int j  =  middle +1; 
		int k  = low;

		while(i <= middle && j <= high){

			if(tempArray[i] <= tempArray[j]){
				originalArray[k] = tempArray[i];
				i++;
			}else{
				originalArray[k] = tempArray[j];
				j++;
			}

			k++;
		}

		//now add the remaining values at the end 
		while(i <= middle){
			originalArray[k] = tempArray[i];
			i++;
			k++;
		}
	}

}





