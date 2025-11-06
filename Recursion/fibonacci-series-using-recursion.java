class Main{
    static int fibo(int n){
        if(n==0||n==1)
            return n;
        return fibo(n-2) + fibo(n-1);
    }
    static void print(int n){
        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static void main(String[] args){
        int n=15;
        print(n);
    }
}