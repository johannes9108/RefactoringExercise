package ui;

import java.util.Stack;

import refactoringExercise.DoubleStack;

public interface UI {

	
	default String trimmedInputString() {
		String input = getString().trim();
		if (input.equals("")) {
			input = " ";
		}
		return input;
	}

	default void displayApplicationState(Stack<Double> stack) {
		clear();
		if (stack.size()==0) {
			displayWhenStackIsEmpty();
		} else {
			displayWhenStackHasValues(stack);	
		}
		
	}

	default void displayWhenStackHasValues(Stack<Double> stack) {
		addString(stack.toString());
	}

	default void displayWhenStackIsEmpty() {
		addString("[empty]\n");	
		addString("Commands: q=quit c=clear + - * / sin cos number");
	}

	public String getString();

	public void addString(String s);

	public void clear();

	public void exit();
	
	
}
