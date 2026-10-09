
public class NumberOperations {

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int countDigits(int number) {
        return (int) (Math.log10(number)) + 1;
    }

    public static void printNumberDigits(int number) {
        do {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        } while (number > 0);
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        do {
            reversedNumber *= 10;
            int digit = number % 10;
            reversedNumber += digit;
            number /= 10;
        } while (number > 0);
        return (reversedNumber == originalNumber);
    }
}
