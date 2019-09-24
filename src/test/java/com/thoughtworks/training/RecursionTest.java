package com.thoughtworks.training;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {

    @Test
    void givenArrayWithOneChar_a_WhenPermute_ThenReturnChar_a() {
        char[] charArray = {'a'};
        List<String> recursiveArrangeOutput = new ArrayList<>();
        recursiveArrangeOutput.add("a");
        Recursion recursion = new Recursion(charArray);
        assertEquals(recursiveArrangeOutput, recursion.permute(0,charArray.length-1));
    }

    @Test
    void givenArrayWithTwoChar_a_WhenPermute_ThenReturnChar_aa() {
        char[] charArray = {'a', 'a'};
        List<String> recursiveArrangeOutput = new ArrayList<>();
        recursiveArrangeOutput.add("aa");
        recursiveArrangeOutput.add("aa");
        Recursion recursion = new Recursion(charArray);
        assertEquals(recursiveArrangeOutput, recursion.permute(0,charArray.length-1));
    }

    @Test
    void givenArrayWithTwoChar_ab_WhenPermute_ThenReturnChar_ab() {
        char[] charArray = {'a', 'b'};
        List<String> recursiveArrangeOutput = new ArrayList<>();
        recursiveArrangeOutput.add("ab");
        recursiveArrangeOutput.add("ba");
        Recursion recursion = new Recursion(charArray);
        assertEquals(recursiveArrangeOutput, recursion.permute(0, charArray.length - 1));
    }
}
