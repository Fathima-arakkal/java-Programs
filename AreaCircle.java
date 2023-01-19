import java.io.*;
import java.lang.*;
class Array
{
	public static void main(String args[])
	{
		String str;
		int a[],n;
		DataInputStream din;
		din= new DataInputStream(System.in);
		try
		{
			System.out.println("Enter size of array :");
			str=din.readLine();
			n=Integer.parseInt(str);
			System.out.println("Array is : "+n);
			}
			catch(Exception e)
			{
				System.out.println("Error"+e);
				}
	}
}