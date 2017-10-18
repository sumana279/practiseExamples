package com.example.Java8;

import java.util.*;
import java.util.function.Consumer;

public class ComparatorLambda {

    public static void main(String[] args){
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(),o2.length());
//            }
//        };


        Comparator<String> compLambda = (String o1, String o2) -> Integer.compare(o1.length(),o2.length());

        List<String> list = Arrays.asList("***","**","*");
        Collections.sort(list,compLambda);

List<String> result = new ArrayList<>();

           Consumer<String> c1 = s -> System.out.println(s);
        list.forEach(s -> System.out.println(s));

        Consumer<String> c12 = System.out::println;
        Consumer<String> c2 = result::add;

         list.forEach(c1.andThen(c2));
//         for(String s:list){
//             System.out.println(s);
//         }
    }
}
