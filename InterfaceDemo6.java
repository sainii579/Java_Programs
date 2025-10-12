interface A
{
    int no = 11;
    void fun();    // bydefault public and abstract
}

interface B
{ 
    int no = 21;
    void fun();     // bydefault public and abstract
}

class Demo implements A,B    // Multiple inheritance
{
     public void fun()
     {
        System.out.println("Inside fun"+no);    // Error
     }
}

class InterfaceDemo6
{
    public static void main(String A[])
     { 
        Demo dobj = new Demo();

        dobj.fun();
     }
}