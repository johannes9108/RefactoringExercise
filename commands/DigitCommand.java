package commands;

import refactoringExercise.DoubleStack;
import refactoringExercise.UI;

public class DigitCommand implements Command {

	@Override
	public void execute(String input, DoubleStack stack, UI ui) {
		double value = Double.parseDouble(input);
		stack.push(value);
	}

}
