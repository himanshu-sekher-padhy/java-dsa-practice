import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int n=10;
        int[] arr= new int[]{1,2,3,4,6,7,8,9,10};
        
        int sumTotal= (n/2)*(n+1);
        int sumArray= Arrays.stream(arr).sum();
        
        System.out.print("Missing value: "+ (sumTotal-sumArray));
    }
}