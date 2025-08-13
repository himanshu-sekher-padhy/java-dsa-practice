class SwapUsingTemp{
    public static void main(String[] args){
        int num1=2,num2=5;
        
        int temp=num1;
        num1=num2;
        num2=temp;
        
        System.out.print(num1+"  "+num2);
    }
}