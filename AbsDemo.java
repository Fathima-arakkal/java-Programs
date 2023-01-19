import java.io.*;
import java.lang.*;
abstract class Shape
{
	int l,b;
  void Shape(int x, int y)
  {
  l=x;
  b=y;
  }
  abstract double area();
  void display()
  {
	  System.out.println("Shape Display");
  }
  }
 

class Rectangle extends Shape
{
	Rectangle(int x, int y)
	{
	   super(x,y);
	   }
		 double area()
		{
			return(l*b);
		}
		void display()
  {
	  System.out.println("Rectangle Display");
  }
	}


class Triangle extends Shape
{
	
	Triangle(int x, int y)
	{
	super(x,y);}
		double area()
		{
			return(0.5*l*b);
		}
		void display()
  {
	  System.out.println("Triangle Display");
  }
	}
  	


class AbsDemo
{
  public static void main(String args[])
   {
	Rectangle R=new Rectangle(10,20);
	r.display();
	Triangle R=new Triangle(10,20);
	t.display();
	double ra= r.area();
	double ta= t.area();
	System.out.println("Reactangle "+ra);
	System.out.println("Triangle"+ta);
	
	
   }
}
