import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a;
        int b = 0;
        int temp = n;
        while(n!=0)
        {
            a = n%10;
            b = b*10+a;
            n = n/10;
        }
        System.out.println("Reversed number: "+b);

        if(temp == b)
        {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a Palindrome number");
        }
    }
}
