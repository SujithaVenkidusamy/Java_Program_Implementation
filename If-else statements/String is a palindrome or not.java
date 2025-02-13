import java.util.*;
public class palindromestring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = " ";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed += str.charAt(i);
        }
        if(str.equals(reversed))
        {
            System.out.println("It is a palindrome String");
        }
        else {
            System.out.println(("It is not a palindrome String"));
        }
    }
}
