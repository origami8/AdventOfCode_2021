package com.example;

import java.util.ArrayList;
import java.util.List;

public class Day2 {
    static long directions(List<String> day2InputList) {
        ArrayList<Integer> forwardList = new ArrayList<>();
        ArrayList<Integer> upList = new ArrayList<>();
        ArrayList<Integer> downList = new ArrayList<>();
        String REGEX = "[^0-9]";
        for (String oneItem : day2InputList) {
            if (oneItem.contains("forward")) {
                int forwardNumber = Integer.parseInt(oneItem.replaceAll(REGEX, ""));
                forwardList.add(forwardNumber);
            } else {
                if (oneItem.contains("up")) {
                    int upNumber = Integer.parseInt(oneItem.replaceAll(REGEX, ""));
                    upList.add(upNumber);
                } else {
                    if (oneItem.contains("down")) {
                        int downNumber = Integer.parseInt(oneItem.replaceAll(REGEX, ""));
                        downList.add(downNumber);
                    }
                }
            }
        }


        long forward = 0;
        for(int i=0; i< forwardList.size(); i++) {
            //System.out.println("forward:" + forwardList.get(i));
           forward = forward + forwardList.get(i);
        }
        //System.out.println("forward total: " + forward);

        long up = 0;
        for(int i=0; i< upList.size(); i++) {
            //System.out.println("up:" + upList.get(i));
            up = up + upList.get(i);
        }
        //System.out.println("up total: " + up);

        long down = 0;
        for(int i=0; i< downList.size(); i++) {
            //System.out.println("down:" + downList.get(i));
            down = down + downList.get(i);
        }
        //System.out.println("down total: " + down);

        return (down-up)*forward;

    }
}


