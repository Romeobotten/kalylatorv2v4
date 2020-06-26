package se.lexicon.romeo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static se.lexicon.romeo.kalylatorv2.subtraction;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestArray()
    {
        float[] inputArray = (-7, 5, 3);
        float result = subtraction(inputArray);
        System.out.println(result);
    }

}
