import java.util.*;
public class Main{
    public static boolean fib(int n){
        if(n==0 || n==1){
            return true;
        }
        int a=0,b=1,c=0;
        while(c<n){

            c=a+b;
            a=b;
            b=c;

        }
        return c==n;
    }
    public static void range(int start,int end){
        System.out.println("Fibonacci number between "+ start +" to " +end);
        for(int i=start;i<end;i++){
            if(fib(i)){
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
