/**
 * Check if string s2 can be obtained by rotating string s1 by two places
 * @author Mohita
 *
 */
public class StringRotate {
	
	private static boolean isRotatebyTwo(String s1,String s2){
		int len= s1.length();
		String antiClock=new StringBuilder(s1.substring(2)).append(s1.substring(0, 2)).toString();
		String clock= new StringBuilder(s1.substring(len-2)).append(s1.substring(0, len-2)).toString();
		return s2.equals(antiClock) || s1.equals(clock);
	}

	public static void main(String[] args) {
		String s1 = "amazon";
		String s2 = "azonam";
		System.out.println("Can "+s2+" can be obtained by rotating "+s1+" by two places: "+isRotatebyTwo(s1, s2));
	}

}
