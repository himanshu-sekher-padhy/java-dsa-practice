import java.util.Scanner;

class Main{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to check if prime or not: ");
        int num= sc.nextInt();
        boolean isPrime= true;
        
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println(num+(isPrime? " is a prime number." : " is not a prime number."));
        sc.close();
    }
}

//to decrease time complexity to O(sqrt(n)), we can do it i*i<=num instead of i<=num/2.