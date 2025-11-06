class Main{
    static int productOfDigits(int num){
        if(num==0)
            return 0;
        if(num%10==num)
            return num;
        return (num%10)*productOfDigits(num/10);
    }
    public static void main(String[] args){
        int n=32456789;
        System.out.print("Product of digits if "+n+" is "+productOfDigits(Math.abs(n)));
    }
}