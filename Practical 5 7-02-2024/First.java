class First
{
	public static void main(String args[])
	{
		First d = new First();
		int c=d.fun(3,10,7,8);
		String s="Pratham";
		System.out.println(c);
		int g=d.fun1(1,s,5,7,8,0,12,56);
	}
	public int fun(int... b)
	{
		System.out.println(b[1]);
		return b[1];
	}
	public int fun1(int a,String s,int... b)
	{
		System.out.println(b.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	return b[3];
	}
}
