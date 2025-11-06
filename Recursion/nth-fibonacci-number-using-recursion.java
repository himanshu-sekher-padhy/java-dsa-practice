class Main{
    static long fibo(int n){
        if(n==0 || n==1)
            return n;
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[] args){
        int n=10;
        System.out.println(n+"th Fibonacci number is "+fibo(n)+".");
    }
}