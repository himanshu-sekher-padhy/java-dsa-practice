class Main{
    static int digitCount(int num){
        if(num<10)
            return 1;
        return digitCount(num/10)+1;
    }
    public static void main(String[] args){
        int n=3245;
        System.out.print("Nummber of digits in "+n+" is "+digitCount(Math.abs(n)));
    }
}