import java.io.*;
public class NumberAndWordCount
{
	public static void main(String[] args) throws  IOException
	{
	    StreamTokenizer token =  new StreamTokenizer(new StringReader("12,RutherFord Building,Lake Street,Chichago-29"));
	    int t, wordCount=0, numberCount=0;
        while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
        {
            switch (t)
            {
            case StreamTokenizer.TT_NUMBER:
                numberCount++;
                break;
            case StreamTokenizer.TT_WORD:
                wordCount++;
                break;
            }
        }
        System.out.println("Count of numbers: "+ numberCount);
        System.out.println("Count of words: "+ wordCount);
    }
}
