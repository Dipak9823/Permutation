package com.thoughtworks.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IterativeTest {

    @Test
    void givenSingleCharArray_WhenPermute_ThenReturnList() {
        List<String> l=new ArrayList<String>();
        l.add("a");
        char[] charArray={'a'};
        Iterative iterative=new Iterative(charArray);
        Assertions.assertEquals(l,iterative.arrange());
    }

    @Test
    void givenTwoCharArray_WhenPermute_ThenReturnList() {
        List<String> l=new ArrayList<String>();
        l.add("ba");
        l.add("ab");
        char[] charArray={'a','b'};
        Iterative iterative=new Iterative(charArray);
        Assertions.assertEquals(l,iterative.arrange());
    }

}
