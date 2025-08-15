import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        
        int a=0,b=1;
        
        //edge conditions check
        if(n<=0)
            System.out.print("Enter a valid positive number");
        else if(n==1)
            System.out.print(a);
        else{
            System.out.println("Fibonacci series upto "+n+" terms: ");
            System.out.print(a+" "+b);
            for(int i=3; i<=n; i++){
                int next = a+b;
                System.out.print(" "+next);
                a=b;
                b=next;
            }
        }
        sc.close();
    }
}

//int works upto 43 terms, long works upto 93 terms without overflow.
