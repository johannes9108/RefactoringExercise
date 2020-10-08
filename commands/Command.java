package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public interface Command {
	
	void execute(String input, DoubleStack stack, UI ui);

}
