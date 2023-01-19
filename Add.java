import java.io.*;
class Add
{
public static void main( String args[ ] )
{
String str, str1;
int x,y,z;
try
{
System.out.println("Enter x");
DataInputStream dis= new DataInputStream(System.in);
str=dis.readLine();
x=Integer.parseInt(str);
System.out.println("Enter y");
str1=dis.readLine();
y=Integer.parseInt(str1);
z=x+y;
System.out.println("Sum is "+z);
}
catch(IOException e)
{
System.out.println(e);
}
}
}
