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
        assertEquals(recursiveArrangeOutput, recursion.permute());
    }
}
