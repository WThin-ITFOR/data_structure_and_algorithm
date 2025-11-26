/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.search;

/**
 *
 * @author ThinYuWai
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySerachRecursiveTest {
    
    BinarySearchRecursive algo = new BinarySearchRecursive();
    
    @Test
    public void testBase() {
        
        int[] arr = {};
        int start = 0;
        int end;
        end = arr.length - 1;
        System.out.println(end);
        int index = algo.search(arr, 10, start, end);
        assertEquals(-1, index);
        
        index = algo.search(null, 10, start, end);
        assertEquals(-1, index);
        
        int[] arr2 = {1,2,4};
        index = algo.search(arr2, 1, 0, arr2.length - 1);
        assertEquals(0, index);
        
        index = algo.search(arr2, 4, 0, arr2.length - 1 );
        assertEquals(2, index);
        
        index = algo.search(arr2, 2, 0, arr2.length -1 );
        assertEquals(1, index);
    }
    
    @Test
    public void testComplex()
    {
        // binarysearch သည် sort ပြီးသားဟာဖြစ်ရမယ်
	int[]arr2 = {1,2,4,8,12};
	int index = algo.search(arr2,12,0,arr2.length - 1);
	assertEquals(4,index);
		
	index = algo.search(arr2,1,0,arr2.length -1 );
	assertEquals(0,index);
		
	index = algo.search(arr2,2,0,arr2.length -1 );
	assertEquals(1,index);
    }
    @Test
    public void testComplex2()
    {
        // binarysearch သည် sort ပြီးသားဟာဖြစ်ရမယ်
	int[]arr2 = {9, 8, 40, 71, 88, 312, 910};
	int index = algo.search(arr2,71,0,arr2.length -1 );
	assertEquals(3,index);
		
	index = algo.search(arr2,312,0,arr2.length- 1 );
	assertEquals(5,index);
		
	index = algo.search(arr2,910,0,arr2.length - 1);
	assertEquals(6,index);
		
	index = algo.search(arr2,1000,0,arr2.length - 1);
	assertEquals(-1,index);
    }
}
