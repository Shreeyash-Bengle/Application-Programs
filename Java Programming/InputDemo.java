import java.io.*;

public class InputDemo
 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        int No1 = 0, No2 = 0, Ans = 0;
        System.out.print("Enter the First number : ");
        No1 = Integer.parseInt(bobj.readLine());
        System.out.print("Enter the Second number : ");
        No2 = Integer.parseInt(bobj.readLine());
        Ans = No1 + No2;
        System.out.println("Addition of : " +Ans);
       // bobj.close();
    }

}
