package com.thoughtworks.training;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StringParserTest {

    @Test
    void givenStringWithOneChar_a_WhenParse_ThenReturnChar_a() {
        StringParser stringparser = new StringParser("a");
        char[] stringToCharArray=stringparser.parser();
        assertEquals('a',stringToCharArray[0]);
    }

    @Test
    void givenStringWithThreeChar_abc_WhenParse_ThenReturnCharArray() {
        StringParser stringParser=new StringParser("abc");
         char[] charArray={'a','b','c'};
        char[] stringToCharArray=stringParser.parser();
        assertTrue(Arrays.equals(charArray,stringToCharArray));
    }
}
