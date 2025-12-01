package com.turing.dsa.sorting;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
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
    @Test
    public void baseCase()
    {
        int[] input = {3,2,10,9,20,31,41,66,8,14};
        int[] sortedArray = algo.sort(input);
        assertTrue(SortingUtil.isSorted(sortedArray));
    }
    
    @Test
    public void manyCase()
    {
        for(int i=0;i<10;i++)
        {
            int []input = SortingUtil.randomArray(30);
            //System.out.println("Input "+Arrays.toString(input));
            input  = algo.sort(input);
            System.out.println("Output "+Arrays.toString(input));
            assertTrue(SortingUtil.isSorted(input));
	}
    }
    
}
