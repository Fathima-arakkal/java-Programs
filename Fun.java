class test {
	public void sq()
	{
		int a=10;
		int b=12;
		int p= a*b;
		System.out.println("Product is : "+p);
		
	}
}

class Fun{
	public static void main( String args[])
	{
		test t= new test();
		t.sq();
	}
}
