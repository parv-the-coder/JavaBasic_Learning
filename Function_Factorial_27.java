import java.util.*;
public class Function_Factorial_27 {
    
    public static int Fact (int a)
    {
        int f=1;
        for (int i = 1; i <= a; i++) {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fact(n));
        sc.close();
    }
}
