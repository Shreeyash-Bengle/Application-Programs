import Marvellous.Arithematic;
import Marvellous.Arithematic;

class PackageDemo
{
    public static void main(String Arg[])
    {
        Arithematic aobj = new Arithematic();
        Mathematics aobj = new Mathematics();

        int iRet = 0;

        iRet = aobj.Addition(10,11);
        System.out.println("Addition is : "+iRet);

        iRet = aobj.Subtraction(10,11);
        System.out.println("Subtraction is : "+iRet);

        iRet = aobj.Square(10);
        System.out.println("Square is : "+iRet);

        iRet = aobj.Cube(10);
        System.out.println("Cube is : "+iRet);



    }
}