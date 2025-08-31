import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        
        System.out.println("Enter your Name: ");
        String name= br.readLine();
        
        System.out.println("Enter your age: ");
        int age= Integer.parseInt(br.readLine());
        
        System.out.println("Enter your gender(M/F): ");
        char gen= br.readLine().charAt(0);
        
        System.out.println("---Your Details---");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gen);
        
    }
}