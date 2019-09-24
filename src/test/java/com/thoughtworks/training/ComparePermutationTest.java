package com.thoughtworks.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparePermutationTest {
    @Test
    void givenSingleCharString_WhenPassToArrangeRecursivelyAnIteratively_ReturnsEqualTrue() {
        ComparePermutation comparePermutation = new ComparePermutation("a");
        Assertions.assertTrue(comparePermutation.compare());
    }

}
