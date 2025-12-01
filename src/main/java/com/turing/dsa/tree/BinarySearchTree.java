/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.tree;

/**
 *
 * @author ThinYuWai
 */
class BinarySearchTree {

    Node root;
    Node left;
    Node right;
    
    public void insert(int value) {
        Node node = new Node (value);
        if ( root == null) 
        {
            setRoot(node);
        }
        else 
        {
            Node current = this.root;
            boolean done = false;
            while(!done)
            {
                if ( value == current.value ) {
                    System.out.println("Duplicate Case");
                    return;
                }
                
                if ( value > current.value) 
                {
                    if ( current.getRight() != null)
                    {
                        current = current.getRight();
                    }
                    else {
                        current.setRight(node);
                        done = true;
                    }
                    
                }
                else if ( value < current.value)
                {
                    if ( current.getLeft() != null)
                    {
                        current = current.getLeft();
                    }
                    else {
                        current.setLeft(node);
                        done = true;
                    }
                }
            }
        }
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Node getRoot()
    {
        return root;
    }
    
    public void setRoot(Node root)
    {
        this.root = root;
    }

    public Node search(int value) {
        Node current = this.root;
        while ( current != null ) 
        {
            if (current.value == value) {
                return current;
            }
            else if (value > current.value) {
                current = current.getRight();
            }
            else {
                current = current.getLeft();
            }
        }
        return null;
    }
    
}
