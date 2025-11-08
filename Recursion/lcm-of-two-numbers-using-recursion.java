import java.util.Scanner;
class Main{
    
    static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static int lcm(int num1, int num2){
        if(num1==0||num2==0){
            return 0;
        }
        return (num1/gcd(num1, num2))*num2;
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        
        System.out.print("LCM of "+num1+" and "+num2+" is "+lcm(num1, num2));
        sc.close();
    }
}