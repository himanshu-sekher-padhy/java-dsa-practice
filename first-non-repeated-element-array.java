//First non-repeating element in an array
class Main{
    public static void main(String[] args){
        int[] arr= {1,2,4,6,7,9,2,1,5,6,8};
        int firstNonRepeated= -1;
        
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                firstNonRepeated=arr[i];
                break;
            }
        }
        
        if(firstNonRepeated==-1){
            System.out.println("No non repeated element in the array.");
        }
        else{
            System.out.println("First non repeated element: "+firstNonRepeated);
        }
    }
}