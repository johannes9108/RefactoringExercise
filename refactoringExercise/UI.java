package refactoringExercise;

public interface UI {

	String getString();

	void addString(String s);

	void clear();

	void exit();
	
	default String trimmedInputString() {
        String input = getString().trim();
        if (input.equals("")) {
            input = " ";
        }
        return input;
    }

	String getDigit();
}
