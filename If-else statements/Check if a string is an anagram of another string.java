import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Ënter the String");
        String str1=s.next();
        System.out.println("Ënter the string ");
        String str2=s.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length())
        {
            System.out.println("both String not anagram");

        }
        else{
            char[] String1=str1.toCharArray();
            char[] String2=str2.toCharArray();

            Arrays.sort(String1);
            Arrays.sort(String2);
            if(Arrays.equals(String1,String2)==true){
                System.out.println("both String is Anagram");
            }
            else{
                System.out.println("both String not Anagram");
            }
        }
    }
}
