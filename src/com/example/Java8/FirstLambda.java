package com.example.Java8;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
    /*Lambda is a functional interfaces with only one abstract method. Methods from the object class don't count*/

    public static void main(String[] args){
    //    FileFilter filter = new FileFilter() {
         /*   @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };*/
        FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
        //other ways of writing version

        File dir = new File("C:\\Users\\jisasv1\\Documents\\Alg\\src\\com\\DataStruc\\OCJP");
        File[] files = dir.listFiles(filterLambda);

        for(File f: files){
            System.out.println(f);
        }




    }
}
