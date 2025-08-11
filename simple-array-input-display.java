import java.util.Scanner;
import java.util.Arrays;

class SimpleArrayInputDisplay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the numer of elements: ");
        int len= sc.nextInt();
        
        int[] arr= new int[len];
        
        System.out.print("Enter "+len+" elements: ");
        for(int i=0; i<len; i++){
            arr[i]=sc.nextInt();
        }
        
        //using for loop
        System.out.println("Entered array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println();
        
        //using for each loop
        for(int elem : arr){
            System.out.print(elem+ " ");
        }
        
        System.out.println();
         
        //using Arrays.toString method
        System.out.println(Arrays.toString(arr));
        
        sc.close();
    }
}