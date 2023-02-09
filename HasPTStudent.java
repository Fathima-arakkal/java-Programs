//child class - HAS A relationship
import java.io.*;

public class HasPTStudent implements Serializable
{ 
String ctgry;
Student s = new Student("Arya",22,112);

public HasPTStudent( String ctgry)
{
		this.ctgry=ctgry;
}

public void disp()
{
		System.out.println("ctgry is " + ctgry);
		s.disp();
}
}