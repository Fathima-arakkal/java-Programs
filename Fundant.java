class test
{
	public cub(int a)
	{
		int c=a*sq(a);
		System.out.println("Cube is :"+c);
		
		}
		public void sq(int c)
		{
			int s=a*a;
			return s;
		}
}

class Fundant
{
	public static void main( String args[])
	{
		test t=new test();
		int a=10;
		t.cub(a);
	}
}