class Prime
{
	public int isPrime(int num)
	{
		if(num<=1)
		{
			return 0;
		}
		for(int i=2 ; i*i<=num ; i++)
		{
			if(num%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public int primeCount(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i])==1)
			{
				count++;
			}
		}
		return count;
	}
	public int nonPrimeCount(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i])!=1)
			{
				count++;
			}
		}
		return count;
	}
	
	public int[] tenLakhArray()
	{
		int[] arr= new int[1000000];
		for(int i=0; i<1000000 ; i++)
		{
			arr[i]=randomNumber();
		}
		return arr;
	}
	
	public int randomNumber()
	{
		int num;
		num = (1000000*(randomDigit()) + 100000*(randomDigit()) + 10000*(randomDigit()) + 1000*(randomDigit()) + 100*(randomDigit()) + 10*(randomDigit()) + (randomDigit()));
		return num;
	}
	
	public int randomDigit()
	{
		int b = (int) System.nanoTime();
		int c = ( b % 10);
		return c;
	}
	public static void main(String[] args)
	{
		Prime b=new Prime();
		int arr[]=b.tenLakhArray();
		int n=1000000;
		System.out.println("Prime :"+ b.primeCount(arr,n));
		System.out.println("Non Prime :"+ b.nonPrimeCount(arr,n));
		
	}
}
