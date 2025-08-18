import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        str= str.toLowerCase();
        
        int vowelCount=0;
        
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
                vowelCount++;
            }
        }
        System.out.print("Number of Vowels: "+ vowelCount);
        sc.close();
    }
}