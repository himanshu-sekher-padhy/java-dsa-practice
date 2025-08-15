import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        int num=100;
        BigInteger fact= BigInteger.ONE;
        
        if(num<0){
            System.out.print("Factorial is not defined for negative numbers.");
        }
        else{
            for(int i=2; i<=num; i++){
                fact=fact.multiply(BigInteger.valueOf(i));
            }
            System.out.print(num+"! = "+fact);
        }
    }
}

