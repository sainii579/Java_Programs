interface A
{
    void fun();    // bydefault public and abstract
}

interface B
{ 
    void gun();     // bydefault public and abstract
}

class Demo implements A,B    // Multiple inheritance
{
     public void fun()
     {
        System.out.println("Inside fun");
     }

     public void gun()
     {
        System.out.println("Inside fun");
     }
}

class InterfaceDemo4
{
    public static void main(String A[])
     { 
        Demo dobj = new Demo();

        dobj.fun();
        dobj.gun();
     }
}