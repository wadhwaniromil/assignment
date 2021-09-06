import java.io.*;

public class CountWordInString {

static int countOccurrences(String str, String word)
{
	String a[] = str.split(" ");

	int count = 0;
	for (int i = 0; i < a.length; i++)
	{
	if (word.equals(a[i])){
		count++;
	}
	
}
	return count;
}

public static void main(String args[])
{
	String str = "Java is Object oriented. Java is platform independent. Java is simple. ";
	String word = "Java";
	System.out.println(countOccurrences(str, word));
}

}