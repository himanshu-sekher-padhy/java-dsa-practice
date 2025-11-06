class Main {
    static long reverse(long num, long rev) {
        // Base case: when num becomes 0, return the reversed number
        if (num == 0)
            return rev;

        // Recursive case: extract last digit and build the reversed number
        return reverse(num / 10, rev * 10 + num % 10);
    }
    static boolean isPalindrome(long n){
        return n==reverse(n,0);
    }

    public static void main(String[] args) {
        long num = 12321;
        if(isPalindrome(num))
            System.out.println("Yes, "+num+" is a Palimdrome number.");
        else
            System.out.println("No, "+num+" is not a Palimdrome number.");
    }
}