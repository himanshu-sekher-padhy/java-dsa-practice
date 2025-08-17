class Main{
    public static void main(String[] args){
        int n=10;
        int[] arr= new int[]{1,2,4,6,7,8,9,10};
        boolean[] present= new boolean[n+1];
        
        for(int num: arr){
            present[num]=true;
        }
        
        System.out.print("Missing number(s) are: ");
        for(int i=1; i<=n; i++){
            if(!present[i]){
                System.out.print(i+" ");
            }
        }
    }
}

//works for both sing or multiple missing numbers, irrespactive of whether it is sorted or not, whether there's duplicacy. It just works fine.