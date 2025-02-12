import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next().toLowerCase(); // Convert input to lowercase
        
        if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a consonant");
        }
    }
}
