package _036_ValidSudoku;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionBadTest {

    /** Test method for {@link _036_ValidSudoku.SolutionBad } */
    SolutionBad solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBad();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        char[][] board = {
                // 0 1 2 3 4 5 6 7 8
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, // 0
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, // 1
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, // 2
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, // 3
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, // 4
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, // 5
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, // 6
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, // 7
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } // 8
        };
        boolean actual = solution.isValidSudoku(board);
        assertTrue(actual);
    }

    @Test
    public void Test2() {
        char[][] board = {
                // 0 1 2 3 4 5 6 7 8
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 0
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 1
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 2
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 3
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 4
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 5
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 6
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' }, // 7
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' } // 8
        };
        boolean actual = solution.isValidSudoku(board);
        assertTrue(actual);
    }

    @Test
    public void Test3() {
        char[][] board = {
                // 0 1 2 3 4 5 6 7 8
                { '5', '3', '.', '.', '6', '.', '.', '.', '.' }, // 0
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, // 1
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, // 2
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, // 3
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, // 4
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, // 5
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, // 6
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, // 7
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } // 8
        };
        boolean actual = solution.isValidSudoku(board);
        assertTrue(!actual);
    }

    @Test
    public void Test4() {
        char[][] board = {
                // 0 1 2 3 4 5 6 7 8
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, // 0
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, // 1
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, // 2
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, // 3
                { '4', '.', '8', '8', '.', '3', '.', '.', '1' }, // 4
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, // 5
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, // 6
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, // 7
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } // 8
        };
        boolean actual = solution.isValidSudoku(board);
        assertTrue(!actual);
    }
}
