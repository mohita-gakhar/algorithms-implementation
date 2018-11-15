/**
 * print all the combinations of a string
 * with 0 or 1 space places between each 
 * character of the strings
 * @author Mohita
 *
 */
public class PossibleStringSpacesI {
	
	private static void printPattern(String string, char[] buffer,int i,int j, int n){
		if(i==n){
			buffer[j]='\0';
			System.out.println(buffer);
			return;
		}
		//Either put the character
		buffer[j]=string.charAt(i);
		printPattern(string, buffer, i+1,j+1, n);
		
		//Or put the space and then put the character
		buffer[j]=' ';
		buffer[j+1]= string.charAt(i);
		printPattern(string, buffer, i+1,j+2, n);
	}
	
	private static void printPattern(String string){
		int len = string.length();
		char[] buffer = new char[2*len];
		buffer[0] = string.charAt(0);
		printPattern(string,buffer,1,1,len);
	}

	public static void main(String[] args) {
		String str = "ABCD"; 
        printPattern(str); 

	}

}
