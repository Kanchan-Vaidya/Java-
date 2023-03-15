class Helloworld 
{
    public static void main (String[]args)
    {
        int a=12,b=10,c=7,d=5,small;
        if(a<b)
        {
            if(a<d)
            small=a;
            else
            small=d;
        }
        {
            if(b>d)
            small=b;
            else
            small=d;
        }
        {
            if(c<d)
            small=d;
            else
            small=d;
        }
        System.out.println("small value is"-small);
    }
}