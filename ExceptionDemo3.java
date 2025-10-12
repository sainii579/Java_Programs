// best example
import java.util.*;

class ExceptionDemo3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter first number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iNo2 = sobj.nextInt();

        iAns = iNo1 / iNo2;    // exception prone code

        System.out.println("Division is :"+iAns);
        

    }
}