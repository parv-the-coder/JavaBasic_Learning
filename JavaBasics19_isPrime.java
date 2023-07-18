import java.util.Scanner;

public class JavaBasics19_isPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if (n == 2) {
            System.out.println("Number is Prime.");
        } else {

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Number is Prime.");
            } else {
                System.out.println("Number is not Prime.");
            }
        }
        sc.close();
    }
}
