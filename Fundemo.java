class test
{
	public void sq(int b)
	{
		int s=b*b;
		System.out.println("Square is :"+s);
	}
}

class Fundemo
{
	public static void main( String args[])
	{
		test t=new test();
		int a=10;
		int b=20;
		t.sq(a);
	}
}