package com.yavaconf._2_switchexpressions;

public class New {

    static void ratePresentation(Grade grade) {
        int score = switch (grade) {
            case BAD, WORST_EVER -> 1;
            case NEUTRAL -> 3;
            case GREAT, NICE -> {
                System.out.println("Impressive!");
                yield 5;
            }
        };
        System.out.println("Presentation score: " + score);
    }

    public static void main(String[] args) {
        ratePresentation(Grade.GREAT);
    }
}
