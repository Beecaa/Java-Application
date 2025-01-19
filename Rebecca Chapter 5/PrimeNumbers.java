public class PrimeNumbers {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) { // Check up to the square root
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");
        int primesFound = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primesFound++;
            }
        }
        System.out.println("\nTotal primes found: " + primesFound);
        System.out.println("You have to test all numbers up to 10,000 to find all primes in that range.");
    }
}