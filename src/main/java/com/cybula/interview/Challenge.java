/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybula.interview;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Alex Fargus <alex.fargus@cybula.com>
 */
public interface Challenge {

    /**
     * Provides a sorted list of all odd numbers in the supplied file.
     * @param file The number file to parse.
     * @return A sorted list of the numbers.
     * @throws java.io.IOException If file not found
     */
    public List<Integer> getNumbers(File file) throws IOException;
    
}
