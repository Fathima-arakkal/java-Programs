import java.io.*;

public class DeSerDemo
{
public static void main (String args[])
{
Student s = null;
try{
FileInputStream fin = new FileInputStream("D:\\javademo\\s.txt");
ObjectInputStream ois= new ObjectInputStream(fin);
s=(Student)ois.readObject();// read
/*System.out.println("DeSerialization happened");
System.out.println("Name is" +s.name);
System.out.println("Age is" +s.age);
System.out.println("RollNo is" +s.rno);*/
s.disp();
}
catch(IOException e){System.out.println(e);}
catch(ClassNotFoundException f){System.out.println(f);}
}
}