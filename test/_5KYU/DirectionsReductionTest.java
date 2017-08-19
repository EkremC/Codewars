package _5KYU;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 01/08/2017.
 */
public class DirectionsReductionTest {
    @Test
    public void testSimpleDirReduc() throws Exception {
        assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirectionsReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }

    @Test
    public void test(){
        assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirectionsReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }


}