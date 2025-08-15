import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a number to check whether Armstrong or not: ");
        int num= sc.nextInt();
        
        int original= num;
        int expo= String.valueOf(num).length();
        int sum= 0;
        
        while(num>0){
            int base= num%10;
            sum= sum+ (int)Math.pow(base, expo);
            num= num/10;
        }
        
        if(sum==original){
            System.out.println(original+" is an Armstrong number.");
        }
        else{
            System.out.println(original+" is not an Armstrong number.");
        }
        
        sc.close();
    }
}