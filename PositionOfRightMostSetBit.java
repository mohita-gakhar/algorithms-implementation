/**
 * Given a number, output the position of right most
 * set bit in its binary representation
 * @author Mohita
 *
 */
public class PositionOfRightMostSetBit {
	
	/**
	 * Take the 2's complement of number and do a bit wise
	 * and then take a log2 of the returned number and 
	 * then add 1 to it
	 * @param number
	 * @return
	 */
	private static int rightMostComplement(int number){
		if(number==0){
			return 0;
		}
		return (int)(Math.log10(number & -number)/Math.log10(2))+1;
	}
	
	/**
	 * Here we take bit wise and of number with 1
	 * and keep left shifting until we encounter
	 * a set bit in number and return the 
	 * position
	 * @param number
	 * @return
	 */
	private static int rightMostBitWiseAnd(int number){
		if(number==0){
			return 0;
		}
		int position=1;
		int m=1;
		while((number & m) ==0)
		{
			m<<=1;
			position++;
		}
		return position;
	}
	
	/**
	 * Rather than running till you find a set bit,
	 * just check till INT_SIZE
	 * @param number
	 * @return
	 */
	private static int rightMostBitWiseAndIntSize(int number){
		if(number==0){
			return 0;
		}
		int position=1;
		int INT_SIZE=32;
		for(int i=0;i<INT_SIZE;i++){
			if((number & (1<<i))==0){
				position++;
			}else{
				break;
			}
		}
		return position;
	}

	public static void main(String[] args) {
		 int n = 18; 
	     System.out.println(rightMostComplement(n));
	     System.out.println(rightMostBitWiseAnd(n));
	     System.out.println(rightMostBitWiseAndIntSize(n));
	}

}
