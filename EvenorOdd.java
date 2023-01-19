import java.io.*;
class EvenorOdd
{
	public static void main(String args[])
		{
			try{
				int number;
				String str ;
				System.out.println("Enter the number : ");
				DataInputStream dis= new DataInputStream(System.in);
				str= dis.readLine();
				number= Integer.parseInt(str);
		if(number%2==0)
			{
				System.out.println(number+ " is Even Number");
			}
		else
			{
				System.out.println(number+ " is Odd Number");
			}
				}
catch(IOException e)
{
	System.out.println(e);
}
}
}
