import java.io.*;

public class DescendingArray{

static int[] countOccurrences(int[] a)
{
    int temp = 0;
    
    for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] < a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
    
    
	return a;
}

public static void main(String args[])
{
  int array[]={8,2,3,1,6,5,7};
   for (int i = 0; i < array.length; i++)   
        {
            System.out.println(countOccurrences(array)[i]);}
	
}

}