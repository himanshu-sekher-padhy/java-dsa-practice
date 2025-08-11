import java.util.Scanner;
import java.util.Arrays;

class SimpleTwoDimentionalArray{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows= sc.nextInt();
        
        int[][] jaggedArray= new int[rows][];
        
        for(int i=0; i<rows; i++){
            System.out.print("Enter number of elements/columns in row "+(i+1)+" :");
            int cols= sc.nextInt();
            
            jaggedArray[i]= new int[cols];
            
            System.out.print("Enter "+cols+" elements :");
            for(int j=0; j<cols; j++){
                jaggedArray[i][j]= sc.nextInt();
            }
        }
        
        System.out.println("Your entered 2-D array  is :");
        //simple for loop
        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //for each loop
        for(int[] arr: jaggedArray){
            for(int elem: arr){
                System.out.print(elem+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //using Arrays.toString()
        for(int i=0; i<jaggedArray.length; i++){
            System.out.println(Arrays.toString(jaggedArray[i]));
        }
        System.out.println();
        //using Arrays.deepToString()
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}