import java.util.Scanner;

class LinearSearchString{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Enter character to search: ");
        char target=sc.next().charAt(0);

        System.out.println(linearSearch(str,target));
        sc.close();
    }
    static int linearSearch(String str, char target){
        if(str.length()==0){
            return -1;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}

//searching a character in a string using linear search