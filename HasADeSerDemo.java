import java.io.*;

public class HasADeSerDemo
{
public static void main (String args[])
{
HasPTStudent s = null;
try{
FileInputStream fin = new FileInputStream("D:\\javademo\\hasas.txt");
ObjectInputStream ois= new ObjectInputStream(fin);
s=(HasPTStudent)ois.readObject();// read

s.disp();
}
catch(IOException e){System.out.println(e);}
catch(ClassNotFoundException f){System.out.println(f);}
}
}