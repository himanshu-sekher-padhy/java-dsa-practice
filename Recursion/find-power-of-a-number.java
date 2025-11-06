import java.util.Scanner;
class Main{
    static double power(int x, int n){
        if(x==0 && n==0)
            return 1;
        if(x==0 && n<0)
            throw new IllegalArgumentException("0 raise to the power any negative value is undefined.");
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(n<0)
            return 1 / power(x,-n);
        return x * power(x,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int base,expo;
        
        System.out.println("Enter Base value: ");
        base=sc.nextInt();
        
        System.out.println("Enter Exponent value: ");
        expo=sc.nextInt();
        
        try{
            System.out.println(base+"^"+expo+"= "+ power(base,expo)+".");
        } catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        sc.close();
    }
}

