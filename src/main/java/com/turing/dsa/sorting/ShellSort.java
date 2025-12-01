/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.dsa.sorting;

/**
 *
 * @author ThinYuWai
 */
class ShellSort {
    
    public int[] sort(int[] input)
    {
        int n = input.length / 2;
        // ( input.length - 1 ) - window_size 
        // 8 - 4 = 4 i => 0 ~ 3 j => 4 ~ 7
        // 8 - 2 = 6 i => 0 ~ 5 j => 6 ~ 7
        // 8 - 1 = 7 i => 0 ~ 6 j => 7
        while (n > 0) {
            for ( int i = 0 ; i < input.length - n; i++) {
                for ( int j = i + n; j < input.length; j++) {
                    
                    if (input[i] > input[j]) {
                        int temp = input[i];
                        input[i] = input[j];
                        input[j] = temp;
                    }
                }
            }
            n = n / 2;
        }
        return input;
    }
}
