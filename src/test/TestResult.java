package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
	public static void main(String[] args) {
        try {
            int input = -123456;
            System.out.printf("Number %d in binary, octal and hex  notation: %s.",
                              input, Exercise.Calculate(input));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }
}
