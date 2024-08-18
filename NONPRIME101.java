import java.util.*;
import java.lang.*;
import java.io.*;

class t
{
	public static void main (String[] args) throws java.lang.Exception
	{  Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 int sum=0,z=0,a=0;
	 for(int x=0;x<T;x++)
	 {int N=sc.nextInt();
	    int A[]=new int[N];
	    
	      for(int y=0;y<N;y++)
	      {A[y]=sc.nextInt();}
	      
	     for(int y=0;y<N;y++)
	          {for(z=y+1;z<N;z++)
	         { sum=A[y]+A[z]; 
	           
	          for(int t=2;t<sum;t++)
	           { if(sum%t==0)
	               {a=1;
	               break;
	               }
	               if(a==1)
	           {  break;}
	           }
	           if(a==1)
	           {System.out.println((y+1)+" "+(z+1));
	               break;
	           }
	           	           
	     }
	     if(a==1)
	      break;
	     	}
              if(a==1)
              a=0;
              else
              System.out.println("-1");
    }
}
}
