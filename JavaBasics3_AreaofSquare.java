import java.util.*;

public class JavaBasics3_AreaofSquare{

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int side = sc.nextInt();
        int Area = side * side;

        System.out.println("Area of Square:" + Area);

    }
}