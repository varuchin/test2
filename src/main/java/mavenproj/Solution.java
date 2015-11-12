package mavenproj;

import java.util.Arrays;


public class Solution {

    public static String helloWorld()
    {
        return "Hello, World!";
    }
    public static void main(String[] args)
    {

        System.out.println(helloWorld());

        Thread thread = new Thread();
        ClockSolution s = new ClockSolution(thread);

        s.setClock();
    }
}
