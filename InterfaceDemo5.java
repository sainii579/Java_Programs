interface A
{
    void fun();    // bydefault public and abstract
}

interface B
{ 
    void fun();     // bydefault public and abstract
}

class Demo implements A,B    // Multiple inheritance
{
     public void fun()
     {
        System.out.println("Inside fun");
     }
}

class InterfaceDemo5
{
    public static void main(String A[])
     { 
        Demo dobj = new Demo();

        dobj.fun();
     }
}