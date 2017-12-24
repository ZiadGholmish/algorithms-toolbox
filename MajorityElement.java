import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int left, int right) {
        //the numbers is { 2 3 9 2 2 }
        
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        
        //sort the array
        MergeSortImp mergeSortImp = new MergeSortImp();
        mergeSortImp.sort(a);
        
        int count = 1;
        int index = 0 ;
        for(int i = 0 ; i < a.length-1 ; i++){
            
            if(a[i] == a[i+1]){
                count++;
                index = i;
                if(count > a.length / 2){
                    return index+1;
                }
            }else{
                count = 1 ;
                index = i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
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

