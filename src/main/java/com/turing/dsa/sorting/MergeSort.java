/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

import java.util.Arrays;

/**
 *
 * @author ThinYuWai
 */
public class MergeSort {
    
    public int[] merge(int[] input, int start, int middle, int end)
    {
//        System.out.println("merge arrat" + Arrays.toString(input));
        int[] result = new int[input.length];
        System.arraycopy(input, 0, result, 0, input.length);

        int i = start;
        int j = middle + 1;
        int k = start;
        
//        System.out.println(" Merge Start " + i + "End " + j);
        while (i < middle+1 && j < end + 1)
        {
            int item = 0;
            if ( input[i] < input[j]){
                item = input[i];
                i++;
            }
            else 
            {
                item = input[j];
                j++;
            }
            
//            System.out.println("middle " + k + " end ");
            result[k++] = item;
        }
        
        while (i < middle + 1) {
            result[k++] = input[i++];
        }
        
        while (j < end + 1) {
            result[k++] = input[j++];
        }
        
        return result;
    }
    
    public int[] sort(int[] input)
    {
        return this.sort(input, 0, input.length - 1);
    }
    
    public int[] sort(int[] input, int start, int end)
    {
        if ( start == end )
        {
            return input;
        }
        else 
        {
            int middle = ( start + end ) / 2;
            input = this.sort(input, start, middle);
//            System.out.println("array input1" + Arrays.toString(input));
	    input = this.sort(input, middle+1, end);
//            System.out.println("array input2" + Arrays.toString(input));
            
            return this.merge(input, start, middle, end);
        }
        
    }
}
