//First repeating element in an array
class Main{
    public static void main(String[] args){
        int[] arr= {1,2,4,6,7,9,2,1,5,6,8};
        int firstRepeated= -1;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    firstRepeated=arr[i];
                    break;
                }
            }
            if(firstRepeated!= -1){
                break;
            }
        }
        
        if(firstRepeated==-1){
            System.out.println("No repeated element in the array.");
        }
        else{
            System.out.println("First repeated element: "+firstRepeated);
        }
    }
}