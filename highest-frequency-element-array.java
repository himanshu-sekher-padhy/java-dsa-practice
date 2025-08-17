class Main{
    public static void main(String[] args){
        int[] arr={1,3,5,8,0,5,2,5,8,0,4,1};
        boolean[] visited= new boolean[arr.length];
        
        int element=Integer.MIN_VALUE, maxCount=0;
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
                element= arr[i];
            }
        }
        System.out.println("Element with highest frequency is "+element+" (frequency: " +maxCount+" times)");
    }
}
// If there are multiple elements with the same frequency, this code will return the first one encountered in the array.