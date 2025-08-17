class Main{
    public static void main(String[] args){
        int[] arr={1,3,5,8,0,5,2,5,8,0,4,1};
        boolean[] visited= new boolean[arr.length];
        
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
            System.out.println("Frequency of "+arr[i]+" is "+count);
        }
    }
}