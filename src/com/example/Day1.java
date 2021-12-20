package com.example;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    static List<Integer> slidingWindows(List<Integer> numbers){
        ArrayList<Integer> slidingWindow = new ArrayList<>();
        for(int i = 2; i< numbers.size(); i++) {
            int prepreviousnumber = numbers.get(i-2);
            int previousnumber = numbers.get(i-1);
            int currentnumber = numbers.get(i);
            int sum = prepreviousnumber + previousnumber + currentnumber;
            slidingWindow.add(sum);
        }
//        for(int i=0; i< slidingWindow.size(); i++) {
//            System.out.println(slidingWindow.get(i));
//        }
        return slidingWindow;
    }

    static void compareWithPrevious(List<Integer> numbers) {
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
