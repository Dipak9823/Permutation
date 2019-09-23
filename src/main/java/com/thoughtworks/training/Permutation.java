package com.thoughtworks.training;

public class Permutation {
    String sample;

    Permutation(String sample) {
        this.sample=sample;
    }

    void arrange() {
        StringParser stringparser=new StringParser(sample);
        char[] parseString=stringparser.parser();
        Iterative iterative=new Iterative(parseString);
        iterative.arrange();
        Recursion recursion=new Recursion(parseString);
       // recursion.arrange();
    }

    void iterativeArrange(String[] iterativeOrder) {
        for(String str:iterativeOrder) {
            System.out.println(str);
        }
    }

    void recursionArrange(String[] recursionOrder) {

    }
}
