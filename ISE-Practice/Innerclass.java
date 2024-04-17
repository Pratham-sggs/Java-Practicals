import java.io.*;



class HelloException extends Exception
{
	
	HelloException(){}
	
	HelloException(String str)
	{
		super(str);
	}
}




class Ex extends HelloException
{
	private String name1;
	private String name;
	public int number;
	class error
	{
		private String name;
		public int number;
		public void Hello()
		{
			name1 = "Pratham";
			System.out.println(name1);
			System.out.println("In error Hello");
			name = "Pratham";
			System.out.println(name);
			Ex.this.name = "Prathamhhh";
			System.out.println(Ex.this.name);
			System.out.println(name);
			this.name = "Pratham hhh Ex";
			System.out.println(name);
			System.out.println(Ex.this.name);
			this.number = 10;
			System.out.println(number);
		}
	}
	static public void fun(String ...args)
	{
		System.out.println(args[0]);
	}
	public static void main(String ...args)
	{
		Ex k = new Ex();
		error c = k.new error();
		
		try
		{
			String[] Check ={ "Hello", "Kal", "Pratham"};
			for (String C : Check)
			{
				if(C.equals("Pratham"))
				{
					HelloException me = new HelloException();
					throw me;
				}
				System.out.println(C);
			}
		}
		catch(HelloException me)
		{
			me.printStackTrace();
		}
		
	}
}
