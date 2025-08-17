import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        int[] arr={1,3,5,8,0,5,-8,2,5,8,9,9,9,8,0,4,1,-8,-8};
        boolean[] visited= new boolean[arr.length];
        
        int maxCount=0;
        ArrayList<Integer> list= new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(visited[i]){
                continue;
            }
            int count= 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            
            if(count>maxCount){
                maxCount= count;
                list.clear();
                list.add(arr[i]);
            } else if(count==maxCount){
                list.add(arr[i]);
            }
        }
        System.out.println("Element(s) with highest frequency is "+list+" (frequency: "+maxCount+" times)");
    }
}