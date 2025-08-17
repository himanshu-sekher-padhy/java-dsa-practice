import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7};
        System.out.print("Enter k value: ");
        int k= sc.nextInt();
        rotate(arr, k);
        System.out.print("Rotated array: "+Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k){
        int n= arr.length; 
        k= k % n;
        
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}