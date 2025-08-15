import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number to find factorial: ");
        int num=sc.nextInt();
        
        if(num<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else{
        System.out.print("Factorial of "+num+" is "+factorial(num));
        }
    }
    static long factorial(int number){
        if(number==0||number==1){
            return 1;
        }
        else
            return number*factorial(number-1);
    }
}