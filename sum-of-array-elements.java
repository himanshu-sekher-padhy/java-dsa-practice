import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int sum = Arrays.stream(arr).sum();   // one-liner sum
        System.out.println("Sum = " + sum);
    }
}
