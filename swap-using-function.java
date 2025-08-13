class SwapUsingFunction{
    public static void main(String[] args){
        int num1=2, num2=5;

        int[] arr= swap(num1, num2);

        num1= arr[0];
        num2= arr[1];

        System.out.print(num1+" "+num2);

    }
    static int[] swap(int a, int b){
        return new int[] {b,a};
    }
}


// class SwapUsingFunction{
//     public static void main(String[] args){
//         int num1=2;
//         int num2=5;
            
//         int[] arr={num1,num2};
//         swap(arr, 0, 1);
        
//         num1=arr[0];
//         num2=arr[1];
        
//         System.out.print(num1+" "+num2);
        
//     }
    
//     static void swap(int[] arr, int index1, int index2){
//         int temp= arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]=temp;
//     }
// }