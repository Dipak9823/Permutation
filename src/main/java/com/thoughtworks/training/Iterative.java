package com.thoughtworks.training;

import java.util.ArrayList;
import java.util.List;

public class Iterative {
    char[] charArray;
    char[] newCharArray;
    List<String> list=new ArrayList<String>();
    public Iterative(char[] charArray) {
        this.charArray=charArray;
    }

    public List<String> arrange() {
        newCharArray=charArray;
        if(newCharArray.length==1) {
            String str =String.valueOf(newCharArray);
            list.add(str);
            return list;
        }
        for(int index=0;index<newCharArray.length;index++) {
            swap(index);
        }
        return list;
    }

    void swap(int index) {
        for(int j=0;j<newCharArray.length;j++) {
            if(index!=j) {
                char temp=newCharArray[index];
                newCharArray[index]=newCharArray[j];
                newCharArray[j]=temp;

                String str=String.valueOf(newCharArray);
                System.out.println(str);
                list.add(str);
            }
        }
    }
}
