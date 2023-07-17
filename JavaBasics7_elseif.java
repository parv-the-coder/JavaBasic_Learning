import java.util.*;

public class JavaBasics7_elseif{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=18)
        {
            System.out.println("Adult");
        }
        else if(n>=13 && n<18)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Kid");
        }
    }
}