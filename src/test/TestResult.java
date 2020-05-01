package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {

        int armstrongNumber = 371;
        int notArmstrongNumber = 200;

        System.out.println("Is " + armstrongNumber + " an Armstrong number? - " + Exercise.isArmstrongNumber(armstrongNumber));
        System.out.println("Is " + notArmstrongNumber + " an Armstrong number? - " + Exercise.isArmstrongNumber(notArmstrongNumber));
        
    }
}