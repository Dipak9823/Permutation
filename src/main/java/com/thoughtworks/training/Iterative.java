package com.thoughtworks.training;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Iterative {
    char[] charArray;
    String iterativeArrange[];
    char[] newCharArray;
    Permutation permutation;

    Iterative(char[] charArray) {
        this.charArray = charArray;
    }

    String simpleString = "";

    void arrange() {
        newCharArray = charArray;
        for (int i = 0; i < newCharArray.length; i++) {
            this.swap(i);
        }
        for(String str:this.iterativeArrange){
            System.out.println(str);
        }
    }

    String[] swap(int i) {
        for (int j = 0; j < newCharArray.length; j++) {

            if (i != j) {
                char temp = newCharArray[i];
                newCharArray[i] = newCharArray[j];
                newCharArray[j] = temp;

                simpleString = String.copyValueOf(newCharArray);
            }
            iterativeArrange = new String[]{simpleString};
        }
        return iterativeArrange; 
    }

    void print(String[] iterativeArrange) {
        for(String str:this.iterativeArrange){
            System.out.println(str);
        }
    }

    public static void main(String args[]) {
        char[] ar= {'a','b','c'};
        Iterative i=new Iterative(ar);
        i.arrange();
    }
}
