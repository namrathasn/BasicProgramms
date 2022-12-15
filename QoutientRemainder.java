import java.util.*;

public class QoutientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        System.out.println("Enter the Divisor");
        int d = sc.nextInt();
        //generating quotient
        int q = num / d;
        //generating remainder
        int r = num % d;
        System.out.println("Quotient: " + q);
        System.out.println("Remainder: " + r);
    }

}