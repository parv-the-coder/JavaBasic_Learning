import java.util.*;

public class Function_BincarytoDecimal_29 {
    public static void BintoDec(int n) {
        int pow = 0;
        int bino = n;
        int decimal = 0;
        int lastdigit = 0;
        while (bino > 0) {

            lastdigit = bino % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, pow));
            bino = bino / 10;
            pow++;
        }
        System.out.println("Decimal of " + n + " = " + decimal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BintoDec(n);
        sc.close();
    }
}
