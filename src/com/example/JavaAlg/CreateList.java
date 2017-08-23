package com.example.JavaAlg;

/**
 * Created by svishnu on 7/14/17.
 */
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class CreateList{

    public static void main(String args[]){
        CreateList obj = new CreateList();
        System.out.println(obj.createNestedList());
    }

    public List<Object> createNestedList(){

       // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nested List");

        // Take input from the user
        String inputString = "[1,[4,[6]]]";
        System.out.println("Entered the Nested List " + inputString);

        List<Object> nestedList = new LinkedList<Object>();
        String num=""; // Strore the number as String
        for(int itr=1; itr<inputString.length()-1;itr++){
            char c = inputString.charAt(itr);
            if(c == ','){ // If the char is , then add the number to list
                if(!num.equals("")) // Check if the number is not null or ""
                    nestedList.add(Integer.parseInt(num));
                num= "";
            }
            else if(c != '[' && c != ']') { // If the character is a digit add it to number

                num += c;
               // System.out.println(num);
            }
            else if(c == '[') // If [ is encountered, add it to list
                nestedList.add(c);
            else if(c == ']'){ // If ] is encountered, pop all elements till last [ and add to list.
                if(!num.equals(""))
                    nestedList.add(Integer.parseInt(num));
                num= "";
                System.out.println(nestedList.subList(nestedList.lastIndexOf('[')+1,nestedList.size()));
                System.out.println(nestedList.lastIndexOf('['));
                System.out.println(nestedList.size());
                List<Object> temp = new LinkedList<Object>(nestedList.subList(nestedList.lastIndexOf('[')+1,nestedList.size()));
                nestedList = nestedList.subList(0,nestedList.lastIndexOf('['));
                nestedList.add(temp);
            }
        }
        if(!num.equals("")) // If last digit is not added to list, add it
            nestedList.add(Integer.parseInt(num));
        return nestedList;
    }
}