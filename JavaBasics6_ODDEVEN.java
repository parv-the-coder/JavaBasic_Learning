import java.util.*;

public class JavaBasics6_ODDEVEN {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("ODD");
        }

    }
}
