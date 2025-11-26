/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;
import java.util.Random;

/**
 *
 * @author ThinYuWai
 */
public class SortingUtil {
    
    public static int[] randomArray(int size)
    {
        Random random = new Random();
        int arr [] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = random.nextInt(1000);
	}
	return arr;
    }
    
    public static boolean isSorted(int[] input)
    {
        for ( int i = 0 ; i < input.length - 1; i++) {
            if (input[i] > input[i+1]){
                return false;
            }
        }
        return true;
    }
    
}
