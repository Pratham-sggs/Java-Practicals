import java.util.Scanner;
import java.util.InputMismatchException;


class Ex
{
	public static void main(String ...args)
	{
		Scanner n = new Scanner(System.in);
		
		try{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException | InputMismatchException ae)
		{
			ae.printStackTrace();
			System.out.println("In Ex Exception");
		}
	}
}
