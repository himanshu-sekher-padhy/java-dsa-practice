class SwapWithoutUsingTemp{
    public static void main(String[] args){
        int num1=2;
        int num2=5;
        
        //not using temp variable
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        
        System.out.print(num1+"  "+num2);
    }
}