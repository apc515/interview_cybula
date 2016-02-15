/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybula.interview;

import java.util.List;
import java.io.*;
import java.util.Collection;

/**
 *
 * @author Alex Fargus <alex.fargus@cybula.com>
 */
public class Implementation implements Challenge {

	public list<Integer> getNumbers(File file){
		//make the temporary list to be returned
		List<Integer> temp = new ArrayList<Integer>();
		//temporary variable used to read from the file
		String line = null;
		try{
			//creates the file reader
			FileReader fr = new FileReader(file);
			//creates the buffer reader to wrap the file reader
			BufferReader br = new BufferReader(fr);
			//start reading all the lines in the file
			while ((line = bf.readline()) != null){	
				//checks if the next number is odd and adds to the list if it is
				if (addToList(line)){
					temp.add(Integer.parseInt(line));
				}
			}
			//after reading all items and adding the odd numbers to the list:
			//closes the file as it is no longer needed
			br.close()
			//sort the list using java's built in sorting alg
			Collections.sort(temp);
			//then returns the sorted list
			return temp;
		} catch (NumberFormatException e){
			//if the line on the file does not contain a number
			//the list is set to an empty list:
			temp = Collections.EMPTY_LIST;
			//and a IO exception is thrown
			throw new IOException("The contant of the file is not valid, only accept numbers within the file");
		} catch (IOException e){
			//if the file cant be opened:
			//empties the list to be returned
			temp = Collections.EMPTY_LIST;
			//throws the io exception that has been raised
			throw e;	
		}
	}
	
	private boolean addToList(String line){
		int i = Integer.parseInt(line);
		return (i % 2 != 0)
	}
	
}
