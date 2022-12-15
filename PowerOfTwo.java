import java.util.Scanner;
public class PowerOfTwo
{
    public static void main(String[] args)
    {
        int n =31;
        int p;
        int result;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        //generating the values for power of 2 till 31
        for(int i=1;i<=n;i++)
        {
            result = (int) Math.pow(p, i);
            System.out.println(result);
        }
    }

}