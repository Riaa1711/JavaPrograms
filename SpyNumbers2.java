public class SpyNumbers {
    public static boolean isSpyNumber(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        System.out.println("Spy numbers between 1 and 100:");
        for (int num = 1; num <= 100; num++)
			{
            if (isSpyNumber(num))
				{
                System.out.println(num);
            }
        }
    }
}


