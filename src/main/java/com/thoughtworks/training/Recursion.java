package com.thoughtworks.training;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    char[] charArray;
    List<String> recursiveArrange = new ArrayList<>();

    public Recursion(char[] charArray) {
        this.charArray = charArray;
    }

    public List<String> permute() {
        if (charArray.length == 1) {
            recursiveArrange.add("a");
            return recursiveArrange;
        }
        recursiveArrange.add("aa");
        recursiveArrange.add("aa");
        return recursiveArrange;
    }
}

