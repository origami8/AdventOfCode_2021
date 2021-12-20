package com.example;

import utils.TestUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> day1InputNumbers = TestUtils.readFileIntoListInteger("input/day1.txt");
        System.out.println("Day1: First Solution:");
        Day1.compareWithPrevious(day1InputNumbers);
        System.out.println("Day1: Second Solution:");
        List<Integer> slidingWindow = Day1.slidingWindows(day1InputNumbers);
        Day1.compareWithPrevious(slidingWindow);

        List<String> day2InputList = TestUtils.readFileIntoList("input/day2.txt");
        System.out.println("Day2: First Solution:");
        System.out.println(Day2.directions(day2InputList));
    }

}
