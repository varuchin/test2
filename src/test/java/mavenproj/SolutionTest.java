package mavenproj;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

@Test
    public void testHello()
    {
        String hello = "Hello, World!";


        assertEquals(Solution.helloWorld(), hello);
    }

}