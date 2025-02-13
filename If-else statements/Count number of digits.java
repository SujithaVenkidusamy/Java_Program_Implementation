import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0)
        {
            int a = n%10;
            count++;
            n = n/10;
        }
        System.out.println("The number of digits present is " + count);
    }
}
