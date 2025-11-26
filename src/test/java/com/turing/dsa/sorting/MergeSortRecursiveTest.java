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
public class MergeSortRecursiveTest {
    MergeSort algo = new MergeSort();
    @Test
    public void mergeBaseCase()
    {
        int[] input = {3,1};
        int[] sortedArray = algo.merge(input, 0, 0, input.length - 1);
        assertTrue(SortingUtil.isSorted(sortedArray));
        
        int[] input2 = {2,3,1,10};
        sortedArray = algo.merge(input2, 0, 1, input2.length - 1);
        assertTrue(SortingUtil.isSorted(sortedArray));
    }
    
    @Test
    public void mergeSingleBaseCase()
    {
        int[] input = {3};
        int[] sortedArray = algo.merge(input, 0, 0, input.length - 1);
        assertTrue(SortingUtil.isSorted(sortedArray));
    }
    
    @Test
    public void sortMergeBaseCase()
    {
        int[] input = {3};
        int[] sortedArray = algo.sort(input);
        assertTrue(SortingUtil.isSorted(sortedArray));
    }
    
    @Test
    public void sortMergeManyCase()
    {
        int[] input = {3,2};
        int[] sortedArray = algo.sort(input);
        assertTrue(SortingUtil.isSorted(sortedArray));
//        
        int[] input3 = {3,2,1,10};
        sortedArray = algo.sort(input3);
        assertTrue(SortingUtil.isSorted(sortedArray));
    }
    
    @Test
    public void sortMergeComplexCase()
    {
        int arr[] = {10,20,1,-1,100};
        int result[] = algo.sort(arr);
		
        assertTrue(SortingUtil.isSorted(result));
        
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
