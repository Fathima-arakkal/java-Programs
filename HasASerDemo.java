import java.io.*;

public class HasASerDemo
{
public static void main (String args[])
{
HasPTStudent ps = new HasPTStudent("weeekend");
try{
FileOutputStream fout = new FileOutputStream("D:\\javademo\\hasas.txt");
ObjectOutputStream oos= new ObjectOutputStream(fout);
oos.writeObject(ps);//write
System.out.println("HAS A Serialization happened");
}
catch(IOException e){System.out.println(e);}
}
}