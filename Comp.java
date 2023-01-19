class Comp
{
	int r1;
	int m;
	String str;
	void read()
	{
		DataInputStream dis;
		dis= new dis(System.in);
		try
		{
			System.out.println("Enter Real part :");
			str=dis.readLine();
			r1=Integer.parseInt(str);
		}
		catch (Exception e)
		{
			System.out.println("Error"+e);
		}
	}
	
	void disp()
	{
		System.out.println
	}
}