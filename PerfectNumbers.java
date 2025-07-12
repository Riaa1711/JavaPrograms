public class PerfectNumbers {
    public static boolean isPerfectNumber(int n) {
        if (n < 2) {
            return false;
        }
        int sum = 1; 
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 100:");
        for (int num = 1; num <= 100; num++) {
            if (isPerfectNumber(num)) {
                System.out.println(num);
            }
        }
    }
}

