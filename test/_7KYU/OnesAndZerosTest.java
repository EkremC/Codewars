package _7KYU;

import _7KYU.OnesAndZeros;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 07/07/2017.
 */
public class OnesAndZerosTest {

    @org.junit.Test
    public void convertBinaryArrayToInt() throws Exception {

        assertEquals(1, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, OnesAndZeros.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));


    }

}