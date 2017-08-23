package com.example.JavaAlg;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

class FlattenList{

    public static void main(String args[]){

        CreateList obj = new CreateList();

        // Get the nested list sample
        List<Object> nestedList = obj.createNestedList();
        System.out.println("-----------------------------------");

        // Print the nested list
        System.out.println("Nested List  = " + nestedList);
        // Print the sample nested list after flattening the list
        System.out.println("Flatten List = " + new FlattenList().flattenList(nestedList));

    }

    public List<Integer> flattenList(List<Object> nestedList){
        List<Integer> flatList = new LinkedList<Integer>();
        for(Object obj : nestedList){
            if(obj instanceof List) // If the value is a List
                for(Object integer : flattenList((List)obj)) // traverse the returned list and add it to the list.
                    flatList.add((Integer) integer);
            if(obj instanceof Integer) // If the value is an integer number add it to list
                flatList.add((Integer)obj);
        }
        return flatList;
    }

}