package com.example.Java8;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args){
        String sc= "sudhan";
        Predicate<String> p1 = s -> sc.length() < 20;
        Predicate<String> p2 = s -> sc.length() > 10;

    }


}
