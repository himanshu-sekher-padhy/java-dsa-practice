import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n= sc.nextInt();
        
        int[] arr= new int[n];
        
        System.out.print("Enter the numbers: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        System.out.println("Your entered array is: "+Arrays.toString(arr));
        
        int min= Integer.MAX_VALUE;
        int secondMin= Integer.MAX_VALUE;
        
        for(int num : arr){
            if(num<min){
                secondMin=min;
                min=num;
            }
            else if(num>min && num<secondMin){
                secondMin= num;
            }
        }
        
        if(secondMin== Integer.MAX_VALUE){
            System.out.println("All the numbers are same.");
        }
        else{
            System.out.println("Second minimum number is: "+ secondMin);
            System.out.println("Minimum number is: "+ min);
        }
        sc.close();
    }
}