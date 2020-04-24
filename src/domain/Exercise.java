package domain;

public class Exercise {

    /**
     * Method that checks if your number is an Armstrong number
     * @param number your number
     * @return Boolean value
     */
    public static boolean isArmstrongNumber(int number) {
        
        int count = getDigitsCount(number);
        int originalNumber = number;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += Math.pow(number%10 , count);
            number /= 10;
        }

        return (sum == originalNumber);
    }

    private static int getDigitsCount(int number) {

        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}