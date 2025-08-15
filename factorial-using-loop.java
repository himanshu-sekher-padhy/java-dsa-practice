class Main{
    public static void main(String[] args){
        int num=10;
        long fact=1;
        
        if(num<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else{
            for(int i=2; i<=num; i++){
                fact=fact*i;
            }
        }
        System.out.print("Factorial of "+num+" is "+fact);
    }
}

//works upto 20! without overflow, beyond that it will overflow for int and long data types.
//for larger numbers, we can use BigInteger class in Java.


