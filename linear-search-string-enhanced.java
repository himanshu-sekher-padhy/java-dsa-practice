import java.util.Scanner;
import java.util.Arrays;

class LinearSearchStringEnhanced{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] formattedCharArray= str.toCharArray();
        System.out.println(Arrays.toString(formattedCharArray));

        System.out.println("Enter character to search: ");
        char target=sc.next().charAt(0);

        System.out.println("Is "+target+" present in the String? \"" + linearSearch(formattedCharArray,target) + "\"");
        sc.close();
    }
    
    static boolean linearSearch(char[] str, char target){
        if (str.length==0){
            return false;
        }
        for(int i=0; i<str.length; i++){
            if(str[i]==target)
                return true;
        }
        return false;
    }
}

//Another way to search for a character in a string, after converting the string into array .