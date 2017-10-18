package com.example.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("1","2","3234234","434535456");
        Predicate<String> p1 = s -> s.length()> 3;
       // stream.filter(p1).forEach(s -> System.out.println(s));
        Predicate<String> p2 = Predicate.isEqual("2");
        Predicate<String> p3 = Predicate.isEqual("1");
        //stream.filter(p2.or(p3)).forEach(s -> System.out.println(s));
        List<String> list = new ArrayList<>();
        stream.peek(System.out::println)
              .filter(p1.or(p2))
        .forEach(list::add);




        System.out.println("Size is as of now "+ list.size());


    }
}
