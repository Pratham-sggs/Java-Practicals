import java.io.*;


class Ex
{
	private String name;
	public int number;
	class error
	{
		private String nam1e;
		public int number;
		public void Hello()
		{
			System.out.println("In error Hello");
			error e = new error();
			name = "Pratham";
			System.out.println(name);
			Ex.this.name = "Prathamhhh";
			System.out.println(Ex.this.name);
			this.nam1e = "Pratham hhh Ex";
			System.out.println(nam1e);
			this.number = 10;
			System.out.println(number);
		}
	}
	public static void main(String ...args)
	{
		
		Ex k = new Ex();
		Ex.error c = k.new error();
		c.Hello();
		
	}
}
