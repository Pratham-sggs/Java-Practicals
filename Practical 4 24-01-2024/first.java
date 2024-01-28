class pratham{
    public static void myFunction()
    {
    	System.out.println("Pratham calling function 1");
    }
    public static int arrayPrint(int a[])
    {
        int size = a.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
        return 045;
    }
    public static void main(String[] args)
    {
        int a;
        myFunction();
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        a = arrayPrint(arr);
        System.out.println(a);
    }
}
