import java.io.*;


class Ex
{
	private String name; 
	class error
	{
		private String name;
		public void Hello()
		{
			System.out.println("In error Hello");
			error e = new error();
			e.name = "Pratham";
			System.out.println(e.name);
		}
	}
	public void Helloc()
		{
			System.out.println("In Ex Hello");
			Ex e = new Ex();
			e.name = "Pratham Ex";
			System.out.println(e.name);
		}
	public static void main(String ...args)
	{
		
		Ex k = new Ex();
		error c = k.new error();
		c.Hello();
		k.Helloc();
	}
}
