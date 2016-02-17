/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybula.interview;

import com.google.common.io.Resources;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Alex Fargus <alex.fargus@cybula.com>
 */
public class ChallengeTest {

    @Test
    public void getNumbers_With1234_Returns13() throws Exception {
        final File numberFile = new File(Resources.getResource("numbers").getFile());

        final Challenge challenge = new Implementation();
        final List<Integer> numbers = challenge.getNumbers(numberFile);

        Assert.assertEquals(numbers, Arrays.asList(1, 3));
    }

    @Test
    public void getNumbers_WithMissingFile_ReturnsEmptyList() throws Exception {
        final File numberFile = new File("missingFile");
        final Challenge challenge = new Implementation();
        
        final List<Integer> numbers = challenge.getNumbers(numberFile);

        Assert.assertEquals(numbers, Collections.EMPTY_LIST);
    }
    
    @Test
    public void getNumbers_WithCommmentLines_IgnoresAllComments() throws Exception {
        //checks if the function will correctly ignore commented lines
    	final File numberFile = new File(Resources.getResource("numbers_commented").getFile());
    	final Challenge challenge = new Implementation();
    	
    	final List<Integer> numbers = challenge.getNumbers(numberFile);
    	Assert.assertEquals(numbers, Arrays.asList(1,3));
    }
    
    @Test
    public void getNumbers_WithNonNumbers_ReturnsEmptyList() throws Exception {
    	//tests if an exception is thrown if the data within the file is not valid i.e. characters instead of numbers
    	final File numberFile = new File(Resources.getResource("numbers_char").getFile());
    	final Challenge challenge = new Implementation();
    	
    	final List<Integer> numbers = challenge.getNumbers(numberFile);
    	Assert.assertEquals(numbers, Collections.EMPTY_LIST);
    	
    }
    
    @Test
    public void getNumbers_WithEmptyFile_ReturnsEmptyList() throws Exception {
    	//tests if an exception is thrown if the data within the file is not valid i.e. characters instead of numbers
    	final File numberFile = new File(Resources.getResource("numbers_empty").getFile());
    	final Challenge challenge = new Implementation();
    	
    	final List<Integer> numbers = challenge.getNumbers(numberFile);
    	Assert.assertEquals(numbers, Collections.EMPTY_LIST);
    	
    }
    
}
