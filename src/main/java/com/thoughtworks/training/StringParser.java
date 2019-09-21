package com.thoughtworks.training;

public class StringParser {
    String inputString;

    StringParser(String inputString) {
        this.inputString = inputString;
    }

    char[] parser() {
        char[] stringToCharArray=inputString.toCharArray();
        return stringToCharArray;
    }
}
