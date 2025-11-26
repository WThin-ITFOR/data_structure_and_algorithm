/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 *
 * @author ThinYuWai
 */
public class BinarySearchTest {
 
    SearchAlgorithm algo = new BinarySearch();
    
    @Test
    public void testBase()
    {
        int[] arr = {};
        int index = algo.search( arr, 10 );
        
        assertEquals(-1, index);
        
        index = algo.search ( null, 100);
        
        assertEquals(-1, index);
    }
    
    @Test
    public void testSingle()
    {
        int[] arr = {10};
        int index = algo.search( arr, 10 );
        
        assertEquals(1, index);
    }
}
