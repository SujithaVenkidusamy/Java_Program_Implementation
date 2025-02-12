import java.util.*;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b && a>c && a>d)
        {
            System.out.println(a + " is the greatest");
        }
        else if(b>a && b>c && b>d)
        {
            System.out.println(b + " is the greatest");
        }
        else if(c>a && c>b && c>d)
        {
            System.out.println(c + " is the greatest");
        }
        else {
            System.out.println(d + " is the greatest");
        }
    }
}
