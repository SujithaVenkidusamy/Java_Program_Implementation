import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Angle");
        int n=sc.nextInt();
        System.out.println("Enter the Second Angle");
        int m=sc.nextInt();
        System.out.println("Enter the Third Angle");
        int o=sc.nextInt();
        int sum=n+m+o;
        if(sum==180) {
            if (n < 90 && m < 90 && o < 90) {
                System.out.println(" Acute Triangle ");
            } else if (n == 90 || m == 90 || o == 90) {
                System.out.println(" Right Triangle ");
            } else {
                System.out.println(" Obtuse Triangle ");
            }
        }
        else
        {
                System.out.println("Invalid");
        }

    }

}
