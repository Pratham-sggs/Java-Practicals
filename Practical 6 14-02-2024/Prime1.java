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
	public static void main(String args[])
	{
		int arr[]={5,2133451,3334556,4667895,5122344};
		int n=5;
		Prime b=new Prime();
		System.out.println("Prime :"+ b.primeCount(arr,n));
		System.out.println("Non Prime :"+ b.nonPrimeCount(arr,n));
		
	}
}
