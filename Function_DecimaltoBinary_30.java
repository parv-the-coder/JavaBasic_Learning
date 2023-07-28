import java.util.*;
public class Function_DecimaltoBinary_30 {
    public static void DectoBin(int n)
    {
        int dec =n;
        int bin = 0;
        int pow = 0;
        while(n>0)
        {
            int rem = n % 2;
            bin = bin + (rem*((int)Math.pow(10, pow)));
            pow++;
            n=n/2;
        }
        System.out.println("Decimal of " + dec + " = " + bin);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DectoBin(n);
        sc.close();
    }
}
