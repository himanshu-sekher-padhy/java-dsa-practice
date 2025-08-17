import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr= {1,2,3,4,6,7,8};
        int left=0, right= arr.length-1;
        
        while(left<right){
            int temp=arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    }
}

import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr= {1,2,3,4,6,7,8};
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int left=0, right= arr.length-1;
        
        while(left<right){
            int temp=arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            
            left++;
            right--;
        }
    }
}

import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr= {1,2,3,4,6,7,8};
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int left=0, right= arr.length-1;
        
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    static void swap(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]= arr[right];
        arr[right]= temp;
            
    }
}