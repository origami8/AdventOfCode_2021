package com.example;

import utils.TestUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = TestUtils.readFileIntoListInteger("input/input.txt");
        System.out.println("Day1: First Solution:");
        compareWithPrevious(numbers);
        System.out.println("Day1: Second Solution:");
        List<Integer> slidingWindow = slidingWindows(numbers);
        compareWithPrevious(slidingWindow);
    }

    private static List<Integer> slidingWindows(List<Integer> numbers){
        ArrayList<Integer> slidingWindow = new ArrayList<Integer>();
        for(int i = 2; i< numbers.size(); i++) {
            int prepreviousnumber = numbers.get(i-2);
            int previousnumber = numbers.get(i-1);
            int currentnumber = numbers.get(i);
            int sum = prepreviousnumber + previousnumber + currentnumber;
            slidingWindow.add(new Integer(sum));
        }
//        for(int i=0; i< slidingWindow.size(); i++) {
//            System.out.println(slidingWindow.get(i));
//        }
        return slidingWindow;
    }

    private static void compareWithPrevious(List<Integer> numbers) {
        int count = 0;
        for(int i = 1; i< numbers.size(); i++) {
            int previousnumber = numbers.get(i-1);
            int currentnumber = numbers.get(i);
            if (currentnumber > previousnumber){
                count++;
            }
        }
        System.out.println(count);
    }
}
