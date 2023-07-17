import java.util.*;

public class JavaBasics11_Calculator {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Operand:");
        int a= sc.nextInt();
        System.out.println("Enter 2nd Operand:");
        int b= sc.nextInt();
        System.out.println("Enter Operator:");
        char c = sc.next().charAt(0);
        int result=0;
        switch(c)
        {
            case '+': result=a+b;
            break;
            case '-': result=a-b;
            break;
            case '*': result=a*b;
            break;
            case '/': result=a/b;
            break;
            case '%': result=a%b;
            break;
        }
        System.out.println("Result is " + result);

    }
}
