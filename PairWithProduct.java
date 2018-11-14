import java.util.HashSet;
import java.util.Set;

/**
 * Given an array and a number, check if a pair
 * whose product equals given number exists
 * @author Mohita
 *
 */
public class PairWithProduct {
	
	/**
	 * Time and space complexity is O(n)
	 * @param arr
	 * @param k
	 * @return
	 */
	public static boolean doesPairExist(int[] arr, int k){
		if(arr.length<2){
			return false;
		}
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0 && k==0){
				return true;
			}
			if(arr[i]==0){
				continue;
			}
			if(k%arr[i]==0){
				if(set.contains(k/arr[i])){
					return true;
				}
				set.add(arr[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 9, 40}; 
        int x = 400;
      
        if(doesPairExist(arr, x)) 
        	System.out.println("Yes");  
        else
        	System.out.println("No"); 
  
        x = 190; 
      
        if(doesPairExist(arr, x)) 
        	System.out.println("Yes");  
        else
        	System.out.println("No"); 

	}

}
