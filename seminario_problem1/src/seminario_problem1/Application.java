package seminario_problem1;


// The Application class reads and outputs the file
public class Application {

	public static void main(String[] args) {
		
		// Instance of the class DuplicateRemover
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		// Reads the files and outputs to the file
		duplicateRemover.remove("problem1.txt");
		duplicateRemover.write("unique_words.txt");
		

	}

}
