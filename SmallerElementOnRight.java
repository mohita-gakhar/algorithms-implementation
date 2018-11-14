import java.util.Arrays;
import java.util.Stack;

/**
 * For each element of an array, print an array
 * which has nearest smaller element of each element
 * in former array
 * @author Mohita
 *
 */
public class SmallerElementOnRight {
	
	/**
	 * Idea is to use stack to maintain a subsequence of
	 * values that have been processed so far and are smaller
	 * than any later value that has already been processed
	 * time and space complexity is O(N)
	 * @param arr
	 */
	private static void printSmallerElements(int[] arr){
		Stack<Integer> stack= new Stack<Integer>();
		for(int i=0;i<arr.length;i++){
			while(!stack.isEmpty() && stack.peek() >= arr[i]){
				stack.pop();
			}
			if(stack.isEmpty()){
				System.out.print("_, ");
			}else{
				System.out.print(stack.peek()+", ");
			}
			stack.push(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,3,0,2,5};
		System.out.println(Arrays.toString(arr));
		printSmallerElements(arr);
	}

}
