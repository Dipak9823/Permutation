package com.thoughtworks.training;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    char[] charArray;
    List<String> recursiveArrange = new ArrayList<>();

    public Recursion(char[] charArray) {
        this.charArray = charArray;
    }

    public List<String> permute(int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            recursiveArrange.add(String.valueOf(charArray));
        }
        for (int count = startIndex; count <= endIndex; count++) {
            swap(startIndex, count);
            permute(startIndex + 1, endIndex);
            swap(startIndex, count);
        }
        return recursiveArrange;
    }
    public void swap(int startIndex, int count) {
        char temp;
        temp = charArray[startIndex];
        charArray[startIndex] = charArray[count];
        charArray[count] = temp;
        String.valueOf(charArray);
    }
}

