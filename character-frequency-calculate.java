//count frequency of each character
//    0-25      26-51
//    A-Z        a-z
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        
        int[] frequency= new int[52];
        
        //count frequency of each character
        for(char ch : str.toCharArray()){
            if(ch>='A' && ch<='Z'){
                frequency[ch-'A']++;
            }
            else if(ch>='a' && ch<='z'){
                frequency[ch-'a'+26]++;
            }
        }
        //print frequencies
        for(int i=0; i<52; i++){
            if(frequency[i]>0){
                if(i<26){
                    System.out.println("Char: "+ (char)(i+'A')+" has a frequency of "+frequency[i]);
                }
                else{
                    System.out.println("Char: "+ (char)(i+'a'-26)+ " has a frequency of "+frequency[i]);
                }
            }
        }
        sc.close();
    }
}