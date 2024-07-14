import java.util.Scanner;

class ExceptionDemo
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0, Ans = 0;
        float fAns = 0.0f;

        System.out.println("Enter the first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter the first number : ");
        No2 = sobj.nextInt();

        try
        {
            System.out.println("Inside Try block");
            fAns = No1 / No2;
            System.out.println("Division is : "+fAns);
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Inside Catch block");
            System.out.println(obj);   
        }
        finally
        {
            System.out.println("Inside Finally block");
            sobj.close();
        }
    }
}