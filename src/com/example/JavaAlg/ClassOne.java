package com.example.JavaAlg;

/**
 * Created by svishnu on 8/2/17.
 */
class ClassOne
{
    static int i, j = 191919;

    {
        --i;
    }

    {
        j++;
    }
}

class ClassTwo extends ClassOne
{
    static
    {
        i++;
    }

    static
    {
        --j;
    }

    public static void main(String[] args)
    {
        System.out.println(i);

        System.out.println(j);
    }
}