package com.thoughtworks.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recursion {
    private final char[] charArray;

    private String[] str1;
    String str;
    Recursion(char[] charArray) {
        this.charArray = charArray;
    }

    public List<String> arrange(int l, int r) {
        List<String> recursiveArrange=new ArrayList<String>();
        //here arraylist
     //char[] charArray1 = new char[charArray];

        if (l == r) {
             //System.out.println(charArray);
            //String str = String.valueOf(charArray);

            recursiveArrange.add(String.valueOf(charArray));
//            str=new String(charArray);
//            str1=new String[]{str};
//            return str1;
        }
        for (int i = l; i <= r; i++) {
            swap(l, i);
            arrange(l + 1, r);
            swap(l, i);
        }
        return recursiveArrange;

    }


    public void swap(int i, int j) {
        char temp;
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
       String.valueOf(charArray);
        //print();
    }
//    public void print() {
//        Iterator i = recursiveArrange.iterator();
//        System.out.println("The ArrayList elements are:");
//        while (i.hasNext()) {`
//            System.out.println(i.next());
//        }
//    }
    public static void main(String[] args) {
        String str= "ABC";
        //System.out.println(str);
        char [] charArray=str.toCharArray();
       // StringParser stringParser = new StringParser(str);
        //char[] charArray = stringParser.parser();
        Recursion recursion = new Recursion(charArray);
        // recursion.arrange(0, charArray.length - 1);
        List<String> arrayList=new ArrayList<String>();
         arrayList.addAll(recursion.arrange(0, charArray.length - 1));
         Iterator i=arrayList.iterator();
         while(i.hasNext()){
             System.out.println(i.next());
         }

    }



}
