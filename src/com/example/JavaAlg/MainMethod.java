package com.example.JavaAlg;

class X
{
    static
    {
        Y.methodOfY();
    }
}

class Y extends X
{
    static void methodOfY()
    {
        System.out.println("Hi....");
    }
}
 class MainClass
{
    public static void main(String[] args)
    {
        Y.methodOfY();
    }
}