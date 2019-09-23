package com.thoughtworks.training;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
public class Iterative {
    char[] charArray;
    List<String> iterativeArrange=new ArrayList<String>();
    char[] newCharArray;
    Permutation permutation;

    Iterative(char[] charArray) {
        this.charArray = charArray;
    }

    String simpleString = "";

    void arrange() {
        System.out.println(1);
        newCharArray = charArray;
        for (int i = 0; i < newCharArray.length; i++) {
            this.swap(i);
        }
        print();
    }

    void swap(int i) {
        System.out.println(2);
        for (int j = 0; j < newCharArray.length; j++) {

            if (i != j) {
                char temp = newCharArray[i];
                newCharArray[i] = newCharArray[j];
                newCharArray[j] = temp;

                simpleString = String.copyValueOf(newCharArray);
                //this.iterativeArrange = new String[]{simpleString};
                System.out.println("iterativeArrange"+simpleString);
                iterativeArrange.add(simpleString);
               // print(iterativeArrange);

               //permutation.iterativeArrange(this.iterativeArrange);
            }

        }

    }
    void print() {
        Iterator i = iterativeArrange.iterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void main(String args[]) {
        char[] ar = {'a', 'b', 'c'};
        Iterative i = new Iterative(ar);
        i.arrange();
    }

}

