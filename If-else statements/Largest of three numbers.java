import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c) System.out.print(a+ " is the Largest of three ");
        else if(b>a && b>c)  System.out.print(b+ " is the of three ");
        else System.out.print(c+ " is the Largest of three ");
    }
}
