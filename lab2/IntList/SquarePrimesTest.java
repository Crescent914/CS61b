package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(4, 4, 6, 7, 8);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 4 -> 6 -> 49 -> 8", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesComplicated() {
        IntList lst = IntList.of(4, 5, 6, 7, 8, 11, 12);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 25 -> 6 -> 49 -> 8 -> 121 -> 12", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesNoPrime() {
        IntList lst = IntList.of(4, 6, 8, 12);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 6 -> 8 -> 12", lst.toString());
        assertFalse(changed);
    }
}
