import java.util.Scanner;

class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Your entered array is: "+Arrays.toString(arr));

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE)
            System.out.println("No second maximum element (all elements are equal)");
        else
            System.out.println("Second maximum = " + secondMax);
            sc.close();
    }
}
