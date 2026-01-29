class ThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        Thread tobj = Thread.currentThread();    // static method because Thread is a root class

        String name = tobj.getName();    // non static method because object

        System.out.println("Name of current thread is : "+name);
        int Priority = tobj.getPriority();

        System.out.println("Priority of current thread is : "+Priority);

        tobj.setPriority(10);
        Priority = tobj.getPriority();
        
        System.out.println("Priority of current thread is : "+Priority);  
    }
}