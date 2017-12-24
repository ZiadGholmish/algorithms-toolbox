import java.util.*;

class SelectionSort{

     public static void main(String[] args){

     	List<Integer> numbersList = new ArrayList<Integer>(); 
     	numbersList.add(5);
     	numbersList.add(2);
     	numbersList.add(8);
     	numbersList.add(9);
     	numbersList.add(1);
     	numbersList.add(5);
     	numbersList.add(20);

     	sortUsingSelectionsSort(numbersList);
	}

	private static void sortUsingSelectionsSort(List<Integer> numbersList){

		//loop over the array to get the min value 
		for(int i = 0 ; i < numbersList.size() ; i++){
			int minIndex = i;
			for(int j = i +1 ; j < numbersList.size() ;j++ ){
				if(numbersList.get(minIndex) > numbersList.get(j)){
					minIndex = j;
				}
			}
			//swapt the two items and loop again 
			swapTwoItems(numbersList ,  minIndex , i);
		}

		for(int i = 0 ; i < numbersList.size() ; i++){
			System.out.println(numbersList.get(i));
		}
	}

	private static void swapTwoItems(List<Integer> numbersList , int minIndex , int currentIndex){
		int tempValue = numbersList.get(currentIndex);
		numbersList.set(currentIndex , numbersList.get(minIndex));
		numbersList.set(minIndex , tempValue);
	}

}