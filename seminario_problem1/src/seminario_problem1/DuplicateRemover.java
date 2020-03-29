package seminario_problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;



// This program displays the use different types of functions
// found in the java library (scanner, exceptions, set, hashset, and printwriter)
// The program opens a file and checks how many unique words are found
public class DuplicateRemover {

	// Set and Scanner function
	private Set<String> uniqueWords = new HashSet<>();
	public Scanner readFile;
	
	// Function remove cleans up any all all resources allocated
	// during method execution
	// Reads file problem1.txt
	public void remove(String dataFile)
	{
		// try function 
		try
		{
			// Scanner function 
			Scanner readFile = new Scanner(new File(dataFile));
			
			// the while loop cycles through each word in the given file
			while(readFile.hasNext())
			{
				uniqueWords.add(readFile.next());			
			}
			// Closes the scanner above so no leaks occurs 
			readFile.close();
		
		// catch function checks to see if an error occurs when opening users file]
		// prints out friendly error message to users screen
		}catch(IOException e)
		{
			System.out.println("An issue occured while opening the file!");
			System.out.println(e);	
		}
	}
	
	// The write function prints all the words onto the 
	// unique_words.txt
	public void write(String outputFile)
	{
		// try function 
		try
		{
			// PrinWriter function 
			PrintWriter printOut = new PrintWriter(new File(outputFile));
			
			// The for loop prints each word onto the 
			// the unique_words.txt
			for(String string : uniqueWords)
			{
				printOut.print(string + " \n");
			}
			
			// flushes and closes the PrintWriter function to avoid leaks
			printOut.flush();
			printOut.close();
		
		// The catch function gives an error if there was problems when opening
		// or creating the unique_word.txt
		// If an error occurs display friendly message to user screen
		}catch(FileNotFoundException e)
		{
			System.out.println("An issue occured while opening/creating the file!");
			System.out.println(e);
		}	
	}
}
