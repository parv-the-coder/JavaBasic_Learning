
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;

public class JavaBasics20_PracticeProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Esum = 0;
        int Osum = 0;
        for (int i = 0; i < n; i++) {

            System.out.print("Enter no:");
            int x = sc.nextInt();

            if (x % 2 == 0) {
                Esum += x;
            } else {
                Osum += x;
            }
        }
        System.out.println("Sum of Even elements:" + Esum);
        System.out.println("Sum of Odd elements:" + Osum);
        sc.close();
    }
}