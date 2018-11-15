import java.util.Arrays;

/**
 * Power set of a set is the set of
 * all the subsets of s. If set s has n elements
 * then its power set will have 2^n
 * @author Mohita
 *
 */
public class PowerSet {
	
	/**
	 * Time Complexity is O(n*2^n)
	 * @param set
	 */
	private static void printPowerSet(char[] set){
		int length = set.length;
		long powerLength = (long)Math.pow(2, length);
		for(long i=0;i<powerLength;i++){
			for(int counter=0;counter<length;counter++){
				if((i & (1 << counter)) > 0){
					System.out.print(set[counter]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char[] set = {'x','y','z'};
		System.out.println("The set is "+Arrays.toString(set));
		printPowerSet(set);
	}

}
