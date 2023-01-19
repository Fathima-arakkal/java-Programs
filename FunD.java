class test 
{
	public int sq()
	{
		int a=10;
		int b=12;
		int p=a*b;
		return p;
	}
}

class FunD
{
	public static void main( String args[])
	{
		test t= new test();
		int x=t.sq();
		System.out.println("Product is :"+x);
	}
	
}