package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class NewInputCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI gw) {
		double value = Double.parseDouble(input);
		stack.push(value);
	}

}
