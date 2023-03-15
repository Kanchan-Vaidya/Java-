class Helloworld
{
    public static void main (String[]args)
    {
        int a=10,b=15,c=19,d=20,e=25,big;
        if(a>b)
        {
            if (a>e)
            big=a;
            else
            big=e;
        }
        else
        {
            if(b>e)
            big=b;
            else
            big=e;
        }
        {
            if(c>e)
            big=c;
            else
            big=e;
        }
        {
            if(d>e)
            big=d;
            else
            big=e;
        }
        System.out.println("big value is"+big);
    }
}