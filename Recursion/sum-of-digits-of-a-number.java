class Main{
    static int sumOfDigits(int num){
        num=Math.abs(num);
        if(num==0)
            return 0;
        return (num%10)+sumOfDigits(num/10);
    }
    public static void main(String[] args){
        int n=32456789;
        System.out.print("Sum of digits if "+n+" is "+sumOfDigits(n));
    }
}