class Main{
    public static void main(String[] args){
        int n=10;
        int[] arr= new int[]{1,2,3,4,6,7,8,9,10};
        
        long productArray=1;
        long productTotal=1;
        
        for(int i=1; i<=n; i++){
            productTotal*=i;
        }
        for(int num: arr){
            productArray*=num;
        }
        
        System.out.print("Missing value: "+ (productTotal/productArray));
    }
}