import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();
        
       while(num2!=0){
           int temp=num2;
           num2=num1%num2;
           num1=temp;
       }
       System.out.print("GCD: "+ num1);
        sc.close();
    }
}