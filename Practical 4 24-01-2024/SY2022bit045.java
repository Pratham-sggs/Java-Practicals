class SY2022bit045{
    public static int task1(int c[])
    {
        return c[0];
    }
    public static int task2(int d[])
    {
        return d[9];
    }
    public static int task3(int e[])
    {
        return e[8];
    }
    public static int task4(int f[])
    {
        int sum=0;
        for(int i=0;i < f.length;i++)
        {
            sum=sum+f[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[]={};
        int a=task1(arr);
        System.out.println(a);
        int h =task2(arr);
        System.out.println(h);
        int g=task3(arr);
        System.out.println(g);
        int b=task4(arr);
        System.out.println(b);
    }
}
    
