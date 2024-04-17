import java.util.Scanner;
import java.util.InputMismatchException;


class Ex extends Error
{
	public String name;
	class publicc{
		
		public void he(){
		
		System.out.println("Pratham");
		Ex.this.he();
		
		}
		
	}
	public void he(){
		
		System.out.println("Pratham1");
		
		}
	
	
	public static void main(String ...args)
	{
		Scanner n = new Scanner(System.in);
		
		try{
			Ex k = new Ex();
			publicc h = k.new publicc();
			h.he();
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException | InputMismatchException ae)
		{
			
			System.out.println("In Ex Exception");
		}
		Hello123();
	}
}
