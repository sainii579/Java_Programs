class Base    // 8 byte
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside Base fun\n");
    }
}

class Derived extends Base
{
    public int x;

    public void gun()
    {
        System.out.println("Inside Derived gun\n");
    }
}

class Single
{
    public static void main(String A[])
    {
        Base bobj = new Base();
        Derived dobj = new Derived();

        bobj.fun();

        dobj.fun();
        dobj.gun();
    }
}