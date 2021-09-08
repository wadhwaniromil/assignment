
import java.util.*;

public class GFG {
  
	public static String updateString(String givenString, char c)
	{
	    char[] ch = givenString.toCharArray();
  
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < givenString.length(); i++) {
		    if(ch[i] == 'a'){
		        ch[i] = c;
		    }
			sb.append(ch[i]);
		}

		return sb.toString();
	}
	
	public static String updateChar(String givenString){
  
		StringBuilder sb = new StringBuilder(givenString);
    
		for (int i = 0; i < sb.length(); i++) {
		    if(i == 3){
		        char n = Character.toUpperCase(sb.charAt(i));
        		sb.setCharAt(i, n);
		    }
		}

		return sb.toString();   
	}

	public static void main(String args[])
	{
        char ch = 'e';
		String originalString = "Halo";
		
		System.out.println(updateString(originalString, ch));
		System.out.println(updateChar(originalString));
	}
}