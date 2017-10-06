package com.example.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by svishnu on 7/26/17.
 */
public class Comparator8{
    public static void main(String[] args) {
        Course restWithSpring = new Course("REST with Spring", 99);
        Course learnSpringSecurity = new Course("Learn Spring Security", 110);
        Course introToSpringMVC4 = new Course("Introduction to Spring MVC 4", 0);


        List<Course> listOfCourses = new ArrayList<>();
        listOfCourses.add(restWithSpring);
        listOfCourses.add(learnSpringSecurity);
        listOfCourses.add(introToSpringMVC4);
        // let's sort this list of course by title first using Comparator
        Comparator<Course> titleComparator = (c1, c2) -> c1.getTitle().compareTo(c2.getTitle());
        Comparator<Course> feeComparator = (c1, c2) -> (int) (c1.getFee() - c2.getFee());


        System.out.println("unsorted list: " + listOfCourses);
        listOfCourses.sort(titleComparator);
        System.out.println("sorted list in ascending order of title: " + listOfCourses);
        System.out.println("unsorted list: " + listOfCourses);
        listOfCourses.sort(feeComparator);
        System.out.println("sorted list in ascending order of fees: " + listOfCourses);
    }

}