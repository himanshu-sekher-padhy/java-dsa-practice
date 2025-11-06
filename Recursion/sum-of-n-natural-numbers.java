class Main{
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        int n=10;
        System.out.print("Sum of "+n+" natural numbers is "+sum(n));
    }
}

// short format
// static int sum(int n) {
//    return (n == 0) ? 0 : n + sum(n - 1);