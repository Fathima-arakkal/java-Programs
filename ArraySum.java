import java.io.*;
import java.lang.*;
class ArraySum
{
	public static void main(String args[])
	{
		
		int a[],n,i;
		int sum;
		DataInputStream din;
		din= new DataInputStream(System.in);
		try
		{
			System.out.println("Enter size of array :");
			n=Integer.parseInteger(din.readLine());
			a=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInteger(din.readLine());
			}
			System.out.println("The array sum is : ");
			for(i=0;i<n;i++)
			sum=sum+a[i];
			System.out.println("Sum is: "+sum);
		}
			catch(Exception e)
			{
				System.out.println("Error"+e);
				}
	}
}