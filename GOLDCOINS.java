import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ int A,B,X,Y;
		Scanner sc=new Scanner(System.in);
	 do{
		 A=sc.nextInt();
		 B=sc.nextInt();
		 X=sc.nextInt();
		 Y=sc.nextInt();
		if(X>Y)
		System.out.println(A);
		else
		System.out.println(B);
	 }while(!(1<=B && B<=10 && 1<=A && A<=10 && 1<=X && X<=5 && 1<=Y && Y<=5 && X!=Y ));

	}
}
