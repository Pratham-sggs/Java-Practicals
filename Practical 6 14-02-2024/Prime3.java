class Prime
{
	public int Prime=0;
	public int Nonprime=0;
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
	public Prime primeCountAndNonPrimeCount1(int arr[],int n)
	{
	        Prime c=new Prime();
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i])==1)
			{
				c.Prime++;
			}
			else
			{
				c.Nonprime++;
			}
		}
		return c;
	}
	
	public Prime primeCountAndNonPrimeCount2(int arr[],int n)
	{
	        Prime c=new Prime();
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i])!=1)
			{
				c.Nonprime++;
			}
			else
			{
				c.Prime++;
			}
		}
		return c;
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
		int c=0;
		do{
			c=randomDigit();
		}while(c==0);
		
		num = (1000000*c + 100000*(randomDigit()) + 10000*(randomDigit()) + 1000*(randomDigit()) + 100*(randomDigit()) + 10*(randomDigit()) + (randomDigit()));
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
		Prime c=new Prime();
		Prime e=new Prime();
		int arr[]=b.tenLakhArray();
		int n=1000000;
		int starttime,endtime;
		int[] Time1=new int[4];
		int[] Time2=new int[4];
		for(int i=0;i<4;i++)
		{
			starttime=(int)System.nanoTime();
			c=b.primeCountAndNonPrimeCount1(arr,n);
			endtime=(int)System.nanoTime();
			Time1[i]=endtime-starttime;
		}
		for(int i=0;i<4;i++)
		{
			starttime=(int)System.nanoTime();
			e=b.primeCountAndNonPrimeCount2(arr,n);
			endtime=(int)System.nanoTime();
			Time2[i]=endtime-starttime;
		}
		System.out.println("Approach 1st check  \t2nd test  \t3rd test  \t4th test");
        	System.out.println("Aprr1\t " + Time1[0] + "\t  " + Time1[1] + "\t  " + Time1[2] + "\t  " +Time1[3] );
        	System.out.println("Aprr2\t " + Time2[0] + "\t  " + Time2[1] + "\t  " + Time2[2] + "\t  " +Time2[3] );	
	}
}
