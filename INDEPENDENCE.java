import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
    
        for(int x=0;x<T;x++)
        {int o=sc.nextInt();
        int w=sc.nextInt();
        int g=sc.nextInt();
        if((o+w+1)>=g && (o+g+1)>=w && (g+w+1)>=o )
        System.out.println("YES");
        else
        System.out.println("NO");
        }

	}
}
