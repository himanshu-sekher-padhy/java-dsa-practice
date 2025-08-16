import java.util.*;

class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        double avg = Arrays.stream(arr).average().orElse(0);   // one-liner avg
        System.out.println("Average = " + avg);
    }
}
// Note: avg can be double or float only to preserve data, or type error will occur unless we are explicity casting.
// Note: both 0 or 0.0 are allowed.
// Note.stream() converts int[]m array into IntStream, and average()/sum() are built-in methods of IntStream.
// Note: orElse(0) is used to handle the case when the array is empty, preventing a NoSuchElementException.