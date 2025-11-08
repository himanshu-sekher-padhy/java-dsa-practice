class Main {
    static void printSquares(int n) {
        //Base case: stop when n == 0
        if (n == 0)
            return;

        //Recursive case: first print smaller numbers
        printSquares(n - 1);
        System.out.println(n + "² = " + (n * n));
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Numbers and their squares up to " + n + ":");
        printSquares(n);
    }
}
