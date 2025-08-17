import java.util.stream.IntStream;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr1= {1,3,5,7,9,15};
        int[] arr2= {2,5,8,10,15,18,19};
        
        int[] concatenated= IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        int[] sorted= Arrays.stream(concatenated).sorted().distinct().toArray();
        System.out.println("Sorted array: "+Arrays.toString(sorted));
    }
}