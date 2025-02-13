import java.util.*;
public class Main{
    public static boolean leap(int n){
        if(n%4 ==0 || (n%400==0 && (n%100 !=0))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void range(int start,int end){
        System.out.println("Leap Year  between "+ start +" to " +end);
        for(int i=start;i<end;i++){
            if(leap(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Ënter the Range");
        int start=s.nextInt();
        int end=s.nextInt();
        range(start,end);


    }
}
