package _6KYU;

import _6KYU.PersistentBugger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ekremcandemir on 10/07/2017.
 */
public class PersistentBuggerTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, PersistentBugger.persistence(39));
        assertEquals(0, PersistentBugger.persistence(4));
        assertEquals(2, PersistentBugger.persistence(25));
        assertEquals(4, PersistentBugger.persistence(999));
    }

}