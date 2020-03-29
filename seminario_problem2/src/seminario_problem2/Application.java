package seminario_problem2;

public class Application {

	public static void main(String[] args) {
		
		// Instance of the class DuplicateCounter
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		
		// Reads the files and outputs the file
		duplicateCounter.count("problem2.txt");
		duplicateCounter.write("unique_words_counts.txt");

	}

}
