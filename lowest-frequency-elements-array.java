import java.util.Arrays;
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        int[] arr={1,2,4,6,8,0,5,2,1,6,8,7,3,5,7,8,4};
        System.out.println("Array: "+Arrays.toString(arr));
        boolean[] visited= new boolean[arr.length];
        
        int minCount=Integer.MAX_VALUE;
        ArrayList<Integer> list= new ArrayList<>();
        
        if(arr.length==0){
            System.out.print("Array is empty.");
        }
        else{
            for(int i=0; i<arr.length; i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count<minCount){
                minCount=count;
                list.clear();
                list.add(arr[i]);
            }else if(count==minCount){
                list.add(arr[i]);
            }
          }
          System.out.println(list+" has/have the lowest frequency of "+minCount);
        }
        
    }
}