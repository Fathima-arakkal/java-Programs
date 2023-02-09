//child class - ISA relationship
import java.io.*;

public class PTStudent extends Student
{ 
String ctgry;

public PTStudent(String name,int age,int rno,String ctgry )
{
	super( name,age,rno);
	this.ctgry=ctgry;
}

public void disp()
{
	super.disp();
	System.out.println("ctgry is " + ctgry);
}
}