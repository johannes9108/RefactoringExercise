package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.SimpleWindow;

public class QuitCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, SimpleWindow gw) {
		stack.clear();
		gw.exit();
	}

}
