package com.thoughtworks.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringParserTest {

    @Test
    void givenStringWithOneChar_a_WhenParse_ThenReturnChar_a() {
        StringParser stringparser = new StringParser("a");
        assertEquals('a', stringparser.parser());
    }
}
