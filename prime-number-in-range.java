import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start= sc.nextInt();
        System.out.print("Enter end of range: ");
        int end= sc.nextInt();
        
        for(int i=start; i<=end; i++){
            if(isPrime(i))
                System.out.print(i+ " ");
        }
        sc.close();
    }
    static boolean isPrime(int num){
        if(num<=1)
            return false;
        else{
            for(int i=2; i<=num/2; i++){
                if(num%i==0)
                   return false;
            }
        }
        return true;
    }
}