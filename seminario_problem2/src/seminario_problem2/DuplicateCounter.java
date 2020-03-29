package seminario_problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

//This program displays the use different types of functions
//found in the java library (scanner, exceptions, set, hashset, formatter, and map)
//The program opens a file and counts the words in a file
public class DuplicateCounter {
	
	// Map, Scanner and Formatter function 
	private Map<String, Integer> wordCounter = new HashMap<String, Integer>();
	public Scanner readFile;
	public Formatter printOut;

	// Function remove cleans up any all all resources allocated
	// during method execution
	// Reads file problem2.txt
	public void count(String dataFile)
	{
		// try function
		try
		{
			// Scanner function
			Scanner readFile = new Scanner(new File(dataFile));
			
			// While loop cycles through each word in the problem2.txt
			// and counts each word
			while(readFile.hasNext())
			{
				String nextWord = readFile.next().toLowerCase();
				
				if(wordCounter.containsKey(nextWord))
				{
					int number = wordCounter.get(nextWord);
					wordCounter.put(nextWord, number + 1);
				}else wordCounter.put(nextWord, 1);
				
			}
			// Closes readFile to avoid any leaks
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
	// unique_words_counts.txt
	public void write(String outputFile)
	{
		// try function 
		try
		{
			// Formatter and Scanner function 
			Formatter printOut = new Formatter(new File(outputFile));
			Set<String> writeWord = wordCounter.keySet();
			
			// The for loop loops through all the words
			// prints to the output txt and counts the words
			// Sorry, some of the numbers did not align with the others
			// on the output
			for(String string : writeWord)
			{
				printOut.format("%s\t\t%d%n", string, wordCounter.get(string));
			}
			
			// Closes Formatter to avoid leaks
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
