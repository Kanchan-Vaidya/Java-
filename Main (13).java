/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Narrowing
{
    public static void main (string[]args)
    {
        double d=200.66;
        long l=(long)d;//explicit type casting
        long i=(int)l;//explicit type casting
        System.out.pritnln("Double Data type value"+d);
        //fractional part lost
        System.out.println("Long Data type value"+l);
        System.out.println("Int Data type value"+i);
    }
}


