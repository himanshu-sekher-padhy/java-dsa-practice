class Main {
    static long reverse(long num, long rev) {
        // Base case: when num becomes 0, return the reversed number
        if (num == 0)
            return rev;

        // Recursive case: extract last digit and build the reversed number
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        long num = 1234568;
        System.out.println("Reverse of " + num + " = " + reverse(num,0));
    }
}
