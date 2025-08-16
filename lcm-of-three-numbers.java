import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        
        int result=lcm(lcm(num1, num2), num3);
        System.out.print("Lcm: "+result);
        sc.close();
    }
    static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
        // prevent overflow of (a*b)
    }
    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}