import java.util.Scanner;

class LinearSearch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr={1,32,-3,9,75,0,22,5};
        System.out.println("Enter the target value you want to search for: ");
        int target=sc.nextInt();
        int res=linearSearch(arr, target);
        if(res!=(-1))
            System.out.println("\""+target+"\" is found at position: "+ (res+1));
        else
            System.out.println(target +" is not present in the array.");
        sc.close();        
        
    }
    
    static int linearSearch(int[] array, int target){
        if(array.length==0)
            return -1;
        for(int i=0; i<array.length; i++){
            if(array[i]==target)
                return i;
        }
        return -1;
        
    }
}