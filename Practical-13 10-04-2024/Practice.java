interface sample{
	
	void fun();
	int a = 0;
}

abstract class SampleInterface{
	
	SampleInterface(){
		
		System.out.println("Inside Abstract Constructor");
		
	}
	
	static{
		
		System.out.println("Inside Abstract static Block");
	}
	
	{
		System.out.println("Inside Abstract Init Block");
	}
	
	
	abstract void info();
}

class Pratham implements sample{
	
	Pratham(){
		
		System.out.println("Pratham Inside Constructor");
		
	}
	
	static{
		
		System.out.println("Inside Pratham static Block");
	}
	
	{
		System.out.println("Inside Pratham Init Block");
	}
	
	public void fun()
	{
		
		System.out.println("Pratham Ushkewar");
		System.out.println("16");
		
	}
	
	
}

class base{
	public static void main(String args[]){
		sample I = new Pratham();
		I.fun();
		System.out.println(I.a);
	}
	
	base(){
		
		System.out.println("Inside Base Constructor");
		
	}
	
	static{
		
		System.out.println("Inside Base static Block");
	}
	
	{
		System.out.println("Inside base Init Block");
	}
	
}
