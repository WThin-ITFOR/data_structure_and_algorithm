package com.turing.dsa.sorting;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 *
 * @author ThinYuWai
 */
public class ShellSortTest {
    
    ShellSort algo = new ShellSort();
    
    @Test
    public void singleCae()
    {
        int[] input = {3};
        int[] sortedArray = algo.sort(input);
        assertTrue(SortingUtil.isSorted(sortedArray));
    }
    
}
