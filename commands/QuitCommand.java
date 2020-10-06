package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class QuitCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI gw) {
		stack.clear();
		gw.exit();
	}

}
