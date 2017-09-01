package com.axxes.hackathon.solution;

import org.junit.Test;

import static org.junit.Assert.fail;

public class SudokuSolverImplTest {

    @Test
    public void sudokuTest() {
        Integer[][] input = {
                {null, 1, null, 4},
                {4, null, 1, null},
                {3, null, 2, null},
                {null, 2, null, 3}};

        Integer[][] expected = {
                {2, 1, 3, 4},
                {4, 3, 1, 2},
                {3, 4, 2, 1},
                {1, 2, 4, 3}};

        SudokuSolverImpl sudoku = new SudokuSolverImpl();
        Integer[][] result = sudoku.solveSudoku(input);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (!expected[i][j].equals(result[i][j])) {
                    fail("Your sudoku solver failed!");
                }
            }
        }

    }

}