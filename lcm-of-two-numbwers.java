
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        
        int gcd= findGCD(num1, num2);
        int lcm= (num1/gcd)*num2;
        
        System.out.print("LCM: "+ lcm);
        sc.close();
    }
    static int findGCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}