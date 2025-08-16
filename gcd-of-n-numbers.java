import java.util.Scanner;

class Main {
    // Function to calculate GCD of two numbers
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate GCD of an array
    static int gcdOfArray(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = gcd(ans, arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("GCD of array = " + gcdOfArray(arr));
        sc.close();
    }
}
