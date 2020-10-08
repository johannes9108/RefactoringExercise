package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;
import refactoringExercise.UI;

public class ClearCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI ui) {
		stack.clear();
		ui.clear();
	}

}
