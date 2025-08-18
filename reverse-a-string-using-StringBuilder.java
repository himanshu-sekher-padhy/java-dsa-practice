//Reverse a string
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        
        System.out.println("Original String: "+str);
        
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String: "+sb.toString());
    }
}

//String reversed= new StringBuilder(str).reverse().toString();
//Another way to reverse a string using StringBuilder
//This is more efficient and concise than manually swapping characters in an array.