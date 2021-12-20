package com.example;

import utils.TestUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = TestUtils.readFileIntoListInteger("input/input.txt");
        System.out.println("Day1: First Solution:");
        Day1.compareWithPrevious(numbers);
        System.out.println("Day1: Second Solution:");
        List<Integer> slidingWindow = Day1.slidingWindows(numbers);
        Day1.compareWithPrevious(slidingWindow);
    }

}
