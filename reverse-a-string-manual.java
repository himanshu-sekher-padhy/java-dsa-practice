//Reverse a string
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        
        System.out.println("Original String: "+str);
        
        String reversed= reverse(str);
        System.out.println("Reversed String: "+reversed);
    }
    static String reverse(String str){
        char[] arr= str.toCharArray();
        int left= 0, right= arr.length-1;
        
        while(left<right){
            char temp=arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            
            left++;
            right--;
        }
        return new String(arr);
    }
}