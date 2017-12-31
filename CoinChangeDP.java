import java.util.*;

class CoinChangeDP{
	
	public static int[] dpMakeChange(List<Integer> coinValueList, int change, int[] minCoins) {
		for (int cents = 0; cents <= change; cents++) {
			int coinCount = cents;
			for (Integer c : coinValueList) {
				if (c > cents) {
					continue;
				}
				if (minCoins[cents - c] + 1 < coinCount) {
					coinCount = minCoins[cents - c] + 1;
				}
			}
			minCoins[cents] = coinCount;
		}
		return minCoins;
	}


	public static int[] changeCoinUsingDP(int change , int[] coinValues){

		//array to hold the min coins solutions for every value
		int[] minCoins = new int[change+1];

		//loop over the value from 0 to 1 
		for(int changeValueNow = 1 ; changeValueNow <= change ; changeValueNow++){
			int coinCount = changeValueNow;

			//loop over the available coins to select or ignore the coins 
			for(int coinValue : coinValues){

				//if the value to change is less than the coin then i should not select it 
				if(changeValueNow < coinValue){
					continue;
				}

				if(minCoins[changeValueNow - coinValue] + 1 < coinCount){
					coinCount = minCoins[changeValueNow - coinValue] + 1;
				}

				minCoins[changeValueNow] = coinCount;
			}
		}
		return minCoins;
	}

	public static void main(String[] args) {
		List<Integer> coinValueList = Arrays.asList(new Integer[]{1, 2, 3});
		int[] coins = {1,2,3};
		int change = 9;
		int[] minCoins = new int[change + 1];
		int[] result = dpMakeChange(coinValueList, change, minCoins);
		int[] resultZ = changeCoinUsingDP(change , coins);

		System.out.println("the min coin change is " + resultZ[resultZ.length-1]);


		for (int i = 0; i < result.length; i++) {

			if(result[i] == resultZ[i]){
				System.out.println("OK");
			}else{
				System.out.println("Not OK");
				break;
			}

		}
	}
}