class Father
{
    int balence=123;
    public Father(int balence)
    {
        if(balence+10==15)
        {
            System.out.println(balence);
        }
        System.out.println(balence);
    }
    static public void main(String[] args)
    {
        Father son = new Father(5);
        int d;
        System.out.printf("Enter value of d: ");
        int d= System.in.scanf(%d,&d);
        System.out.printf(d);
    }
}
