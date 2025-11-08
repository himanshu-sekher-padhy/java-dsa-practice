import java.util.Scanner;
class Main{
    
    static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        
        System.out.print("GCD of "+num1+" and "+num2+" is "+gcd(num1, num2));
        sc.close();
    }
}