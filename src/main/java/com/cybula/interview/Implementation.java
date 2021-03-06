/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybula.interview;

import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alex Fargus <alex.fargus@cybula.com>
 * 
 * Please note: I had some trouble setting up this as a project, my java experience concists
 * of solo development projects, therefore I never had to set up a existing project into Eclips
 * or any other form of compiler or development enviroment.
 * 
 * I have kept the same format as far as files are concerned, so There might be some problem with
 * making the project run. I have ensured, however, that the code would run and that it is
 * sybtatically correct. Although it might not work I hope that it will show my ability to write
 * code in java as well as using Git. I don't believe that setting up a project would be a problem
 * once I am working within the office enviroment, I just have no experience on this particular area
 */
public class Implementation implements Challenge {

	public List<Integer> getNumbers(File file) throws IOException{
		//make the temporary list to be returned
		List<Integer> temp = new ArrayList<Integer>();
		//temporary variable used to read from the file
		String line = null;
		try{
			//creates the file reader
			FileReader fr = new FileReader(file);
			//creates the buffer reader to wrap the file reader
			BufferedReader br = new BufferedReader(fr);
			//start reading all the lines in the file
			while ((line = br.readLine()) != null){	
				//checks if the next number is odd and adds to the list if it is
				if (addToList(line)){
					temp.add(Integer.parseInt(line));
				}
			}
			//after reading all items and adding the odd numbers to the list:
			//closes the file as it is no longer needed
			br.close();
			//sort the list using java's built in sorting alg
			Collections.sort(temp);
		
		} catch (Exception e){
			//if the file can't be opened or data is not valid:
			//empties the list to be returned
			temp = Collections.EMPTY_LIST;	
		}
		//then returns the list, whichever it may be
		return temp;
	}
	
	private boolean addToList(String line){
		//first check if the line is a comment
		if (line.charAt(0)=='#'){
			return false;
		}
		//if not a comment, check if it is odd
		int i = Integer.parseInt(line);		//NOTE: if the line is not a number, a exeption is thrown which is handled elsewhere 
																							//(within the getNumbers function)
		return (i % 2 != 0);
	}
	
}
