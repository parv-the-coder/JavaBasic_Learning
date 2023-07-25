import java.util.*;

public class Function_BCoeff_28 {

    public static int Fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BCoeff(int n, int r) {
        int fact_n = Fact(n);
        int fact_r = Fact(r);
        int fact_n_r = Fact(n - r);
        int BCoeff = fact_n / (fact_r * fact_n_r);
        return BCoeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        System.out.println(BCoeff(n, r));
        sc.close();
    }
}
