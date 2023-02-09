
import java.io.*;

public class Student implements Serializable
{ //selective serializ
String name;
  int  age;
int rno;

public Student(String name,int age,int rno)
{
	this.name=name;
	this.age=age;
	this.rno=rno;
}

public void disp()
{
	System.out.println("name is " + name);
	System.out.println("age is " + age);
	System.out.println("rno is " + rno);
}
}