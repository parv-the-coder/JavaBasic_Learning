// Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;
public class JavaBasics21_PracticeProblem {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        if (n==0) {
            System.out.println(fact);
        }
        else
        {

            for (int i = n; i>1; i--)
            {
                fact = fact*i;
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
