import java.io.*;

public class ISASerDemo
{
public static void main (String args[])
{
PTStudent ps = new PTStudent("Arya",22,112,"evening");
try{
FileOutputStream fout = new FileOutputStream("D:\\javademo\\isas.txt");
ObjectOutputStream oos= new ObjectOutputStream(fout);
oos.writeObject(ps);//write
System.out.println("ISA Serialization happened");
}
catch(IOException e){System.out.println(e);}
}
}