import java.util.*;
public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int)Math.sqrt(n);
        int b = sqrt*sqrt;
        if(n == b)
        {
            System.out.println("It is a perfect square");
        }
        else {
            System.out.println("It is not a perfect square");
        }

    }
}
