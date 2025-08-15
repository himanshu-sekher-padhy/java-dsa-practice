import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        
        BigInteger a=BigInteger.ZERO,b=BigInteger.ONE;
        
        if(n<=0)
            System.out.print("Enter a valid positive number");
        else if(n==1)
            System.out.print(a);
        else{
            System.out.println("Fibonacci series upto "+n+" terms: ");
            System.out.print(a+" "+b);
            for(int i=3; i<=n; i++){
                BigInteger next = a.add(b);
                System.out.print(" "+next);
                a=b;
                b=next;
            }
        }
        sc.close();
    }
}