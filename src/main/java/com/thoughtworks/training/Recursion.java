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
        recursiveArrange.add("a");
        return recursiveArrange;
    }
}
