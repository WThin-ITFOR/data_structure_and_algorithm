/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.tree;

import com.turing.dsa.sorting.SortingUtil;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 *
 * @author ThinYuWai
 */
public class BinarySearchTreeTest {
    
    BinarySearchTree tree = new BinarySearchTree();
    @Test
    public void insertTest()
    {
        // [10, 20, 5, 20, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.value);
    }

    @Test
    public void insertTwoTest()
    {
        // [10, 20, 5, 20, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.value);
                
        tree.insert(5);
        Node left = root.getLeft();
        assertEquals(5, left.value);
        
        tree.insert(20);
        Node right = root.getRight();
        assertEquals(20, right.value);
    }
    
    
    @Test
    public void insertLeftTest()
    {
        // [10, 20, 5, 20, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.value);
                
        tree.insert(5);
        Node left = root.getLeft();
        assertEquals(5, left.value);
    }
    
    @Test
    public void insertRightTest()
    {
        // [10, 20, 5, 20, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.value);
        
        tree.insert(20);
        Node right = root.getRight();
        assertEquals(20, right.value);
    }
    
    @Test
    public void nonleafInsertTest()
    {
        // [10, 20, 5, 30, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.value);
        
        tree.insert(20);
        Node right = root.getRight();
        assertEquals(20, right.value);
                
        tree.insert(5);
        Node left = root.getLeft();
        assertEquals(5, left.value);
    }
    
    @Test
    public void complexInsertTest()
    {
        // [10, 20, 5, 30, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.getValue());
        
        tree.insert(20);
        Node right = root.getRight();
        assertEquals(20, right.getValue());
                
        tree.insert(5);
        Node left = root.getLeft();
        assertEquals(5, left.getValue());
        
        tree.insert(30);
        Node rootRightofRight = right.getRight();
        assertEquals(30, rootRightofRight.getValue());
        
        tree.insert(12);
        tree.insert(15);
    }
    /*  
     * [10, 20, 5, 30, 12, 15] 
     * Binary Search Tree -> Binary Search Tree သည် ရှာလို့ ရအောင်လု့ပ်ပေးလိုက်တာ
     *                  10
     *                 /  \
     *                5    20
     *                    /   \
     *                   12   30
     *                    \
     *                    15
     * 
     * 
    */
    @Test
    public void complexInserTwotTest()
    {
        // [10, 20, 5, 30, 12, 15] 
        // if Root will be null, create node and insert
        tree.insert(10);
        Node root = tree.getRoot();
        assertEquals(10, root.getValue());
        
        tree.insert(20);
        Node node20 = root.getRight();
        assertEquals(20, node20.getValue());
                
        tree.insert(5);
        Node left = root.getLeft();
        assertEquals(5, left.getValue());
        
        tree.insert(30);
        Node node30 = node20.getRight();
        assertEquals(30, node30.getValue());
        
        tree.insert(12);
        Node node12 = node20.getLeft();
        assertEquals(12, node12.getValue());
        
        tree.insert(15);
        Node node15 = node12.getRight();
        assertEquals(15, node15.getValue());
    }
    
    @Test
    public void testSearch()
    {
        tree.insert(10);
        Node root = tree.getRoot();
        
        tree.insert(20);
        tree.insert(5);
        tree.insert(30);
        tree.insert(12);
        tree.insert(15);
        
        Node node = tree.search(10);
        
        Node node20 = tree.search(20);
        assertEquals(20, node20.getValue());
        
        assertEquals(10, node.getValue());
        assertEquals(5, tree.search(5).getValue());
        assertEquals(30, tree.search(30).getValue());
        assertEquals(12, tree.search(12).getValue());
        assertEquals(15, tree.search(15).getValue());
        
        Node nodeNotFound = tree.search(13);
        assertEquals(null, nodeNotFound);
    }
    
    @Test
    public void testSearchTwo()
    {
        // Duplicate Case မှာ ပြဿနာတက်နိုင်တယ် 
        // Binary Tree ရဲ့ issue သည် Duplicate Case ထည့်ပြီး လုပ်သင့်တယ်
        
        int[] random = SortingUtil.randomArray(30);
        //System.out.println("Input "+Arrays.toString(input));
        for ( int item : random) {
            tree.insert(item);
        }
        
        for (int item: random){
            Node node = tree.search(item);
            assertEquals(item, node.getValue());
        }
    }
    
    
    
    @Test
    public void testSearchThree()
    {
        for(int i=0;i<20;i++)
        {
            BinarySearchTree tree = new BinarySearchTree();
            int[] random = SortingUtil.randomArray(30);
            //System.out.println("Input "+Arrays.toString(input));
            for ( int item : random) {
                tree.insert(item);
            }

            for (int item: random){
                Node node = tree.search(item);
                assertEquals(item, node.getValue());
            }
        }
    }
    
}
