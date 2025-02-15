import java.util.Scanner;

public class gcd {
    public static int getGcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int res=getGcd(a, b);
        System.out.println("gcd:"+res);
    }
}
