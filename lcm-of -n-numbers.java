import java.util.Scanner;

class Main {
    // Function to calculate GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM of two numbers safely
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // Function to calculate LCM of an array
    static int lcmOfArray(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = lcm(ans, arr[i]);
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

        System.out.println("LCM of array = " + lcmOfArray(arr));
        sc.close();
    }
}
