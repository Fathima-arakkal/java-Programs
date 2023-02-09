import java.io.*;

public class ISADeSerDemo
{
public static void main (String args[])
{
PTStudent ps = null;
try{
FileInputStream fin = new FileInputStream("D:\\javademo\\isas.txt");
ObjectInputStream ois= new ObjectInputStream(fin);
ps=(PTStudent)ois.readObject();// read
ps.disp();
}
catch(IOException e){System.out.println(e);}
catch(ClassNotFoundException f){System.out.println(f);}
}
}