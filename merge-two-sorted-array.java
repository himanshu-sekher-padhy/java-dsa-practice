// import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[] arr1= {1,3,5,7,9,15};
        int[] arr2= {2,5,8,10,15,18,19};
        
        int[] sorted= sort(arr1, arr2);
        System.out.print(Arrays.toString(sorted));
    }
    static int[] sort(int[] arr1, int[] arr2){
        int n=arr1.length, m=arr2.length;
        int[] sortedArray= new int[n+m];
        int i=0, j=0, k=0;
        
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                sortedArray[k++]=arr1[i++];
            }
            else{
                sortedArray[k++]=arr2[j++];
            }
        }
        while(i<n){
            sortedArray[k++]=arr1[i++];
        }
        while(j<m){
            sortedArray[k++]=arr2[j++];
        }
        return sortedArray;
    }
}