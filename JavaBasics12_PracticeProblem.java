// Write a Java program to get a number from the user and print whether it is
// positive or negative.
import java.util.*;

public class JavaBasics12_PracticeProblem {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0)
        {
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }    
}
