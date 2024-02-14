class College
{
    public College(){
    	System.out.println("Base Constructer");
    }
};

class SGGS extends College 
{
    public SGGS() {
    	System.out.println("SGGS Constructor");
    }
    public static void main(String args[])
    {
        SGGS sggs= new SGGS();
    }
}
