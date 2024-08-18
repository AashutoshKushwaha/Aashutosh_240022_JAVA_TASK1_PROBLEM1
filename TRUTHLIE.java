import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt(); 
            
            int r = (2 * N)-1;
            
            if (r<= N+M && N>M && r!=1)
           System.out.println(r);
           else 
            System.out.println(-1);
            
        }

	}
}
