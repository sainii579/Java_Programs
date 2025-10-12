class Demo
{
    public int iNo1;
    public int iNo2;
    
    public Demo()
    {
        System.out.println("Inside Default constructor");
    }

    public Demo(int i,int j)
    {
       System.out.println("Inside Parameterised constructor");
    
    }

}

class Constructor
{
    public static void main(String arg[])
    {
        Demo dobj1 = new Demo();    //Demo dobj1;

        Demo dobj2 = new Demo(11,21);      // Demo dobj2(11,21); in C++
    }
}